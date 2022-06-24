package org.sid.entite;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 
	//garder seulement le temp																			
	@Temporal(TemporalType.TIME)
private Date heureDebut;
	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seance(Long id, Date heureDebut) {
		super();
		this.id = id;
		this.heureDebut = heureDebut;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}



}
