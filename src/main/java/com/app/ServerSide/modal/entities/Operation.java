package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.app.ServerSide.modal.types.TypeOperation;


@Entity
@Table(name="Operation")
@Proxy(lazy=false)
public class Operation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OP_ID")
	private Long OP_ID;
	
	@Temporal(TemporalType.DATE)
	@Column(name="OP_DT")
	private Date OP_DT;
	
	@Temporal(TemporalType.TIME)
	@Column(name="OP_HOUR")
	private Date OP_HOUR;
	
	@Enumerated(EnumType.STRING)
	@Column(name="OP_TYPE")
	private TypeOperation OP_TYPE;
	
	@ManyToOne
	@JoinColumn(name="TOUR_ID")
	private Tournee tourne;

	public Operation() {
		
	}

	public Operation(Long oP_ID, Date oP_DT, Date oP_HOUR, TypeOperation oP_TYPE) {
		OP_ID = oP_ID;
		OP_DT = oP_DT;
		OP_HOUR = oP_HOUR;
		OP_TYPE = oP_TYPE;
	}

	public Long getOP_ID() {
		return OP_ID;
	}

	public void setOP_ID(Long oP_ID) {
		OP_ID = oP_ID;
	}

	public Date getOP_DT() {
		return OP_DT;
	}

	public void setOP_DT(Date oP_DT) {
		OP_DT = oP_DT;
	}

	public Date getOP_HOUR() {
		return OP_HOUR;
	}

	public void setOP_HOUR(Date oP_HOUR) {
		OP_HOUR = oP_HOUR;
	}

	public TypeOperation getOP_TYPE() {
		return OP_TYPE;
	}

	public void setOP_TYPE(TypeOperation oP_TYPE) {
		OP_TYPE = oP_TYPE;
	}

	public Tournee getTournee() {
		return tourne;
	}

	public void setTournee(Tournee tournee) {
		this.tourne = tournee;
	}
	
	

}
