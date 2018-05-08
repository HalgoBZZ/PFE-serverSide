package com.app.ServerSide.controller;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ServerSide.modal.entities.Compte;
import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.service.ICompteService;
import com.app.ServerSide.service.IResponsableService;

@RestController
@RequestMapping("/responsables")
public class ResponsableController {
	final String username = "bgi2018.bgi@gmail.com";
	final String password = "bgi123456789";
	private String code;
	@Autowired
	private ICompteService compteService;
	@Autowired
	private IResponsableService responsableService;
	
	
	@GetMapping("/all")
	public List<Responsable> findAll(){
		return responsableService.findAll();
	}
	
	@PostMapping("/save")
	public void save(@Valid @RequestBody Responsable responsable) {
		Compte cmpt=compteService.findUserByLogin(responsable.getCMPT_LOGIN());
		if(cmpt!=null)throw new RuntimeException("Utilisateur existe déja!!");
		responsableService.save(responsable);
		compteService.addRoleToUser(responsable.getCMPT_LOGIN(), "RESPONSABLE");
	}
	
	@PostMapping("/update")
	public void update(@Valid @RequestBody Responsable responsable) {
		responsableService.update(responsable);
	}
	
	@GetMapping("/get/{id}")
	public Responsable findById(@PathVariable("id") Long id) {
		return responsableService.findById(id);
	}
	
	@GetMapping("/getbylogin/{login}")
	public Responsable findByLogin(@PathVariable("login") String login) {
		return responsableService.findByLogin(login);
	}
	
	@GetMapping("/getbyemail/{login}/{email}")
	public Responsable findByEmail(@PathVariable("login")String login,@PathVariable("email")String email) {
		Responsable responsable=responsableService.findByEmail(login, email);
		if(responsable!=null) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("bgi2018.bgi@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(responsable.getCMPT_EMAIL()));
			message.setSubject("Recuperation de mot de passe");
			code=getSaltString();
			message.setText("Code: "+code);
			Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		}
		return responsable;
	}
	
	@GetMapping("/getcode") 
	public String getCode() {
		return code;
	}
	
	/*******************************random code generation***********************************/
	private String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
