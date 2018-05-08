package com.app.ServerSide;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ServerSideApplication implements CommandLineRunner{

	/*@Autowired
	private ICompteService compteService;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private IResponsableService responsableService;*/
	
	public static void main(String[] args) {
		SpringApplication.run(ServerSideApplication.class, args);
	}
	
	
	@Override
	public void run(String ...args)throws Exception{
		/*AppRole role1=new AppRole();
		role1.setNAME_ROLE("RESPONSABLE");
		AppRole role2=new AppRole();
		role2.setNAME_ROLE("RELEVEUR");
		roleRepository.save(role1);
		roleRepository.save(role2);
		Responsable resp=new Responsable();
		resp.setCMPT_LOGIN("admin");
		resp.setCMPT_PWD("admin");
		responsableService.save(resp);*/
	}
	
	@Bean //will be executed when the application is running
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

}
