package org.sid.entite;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Ticket {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nomClient;
private double prix;
//accepter les valeurs null
@Column(unique =false,nullable =true)
private Integer codePayement;
private boolean reservee ;
@ManyToOne
private ProjectionFilm projectionFilm;
@ManyToOne 
private Place place;
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}
public Ticket(Long id, String nomClient, double prix, Integer codePayement, boolean reservee,
		ProjectionFilm projectionFilm, Place place) {
	super();
	this.id = id;
	this.nomClient = nomClient;
	this.prix = prix;
	this.codePayement = codePayement;
	this.reservee = reservee;
	this.projectionFilm = projectionFilm;
	this.place = place;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNomClient() {
	return nomClient;
}
public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Integer getCodePayement() {
	return codePayement;
}
public void setCodePayement(Integer codePayement) {
	this.codePayement = codePayement;
}
public boolean isReservee() {
	return reservee;
}
public void setReservee(boolean reservee) {
	this.reservee = reservee;
}
public ProjectionFilm getProjectionFilm() {
	return projectionFilm;
}
public void setProjectionFilm(ProjectionFilm projectionFilm) {
	this.projectionFilm = projectionFilm;
}
public Place getPlace() {
	return place;
}
public void setPlace(Place place) {
	this.place = place;
}



}
