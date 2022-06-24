package org.sid.entite;



import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ ToString
public class ProjectionFilm {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateProjection;
	private double prix;
@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)
private Salle salle;
@ManyToOne
private Film film;
@OneToMany(mappedBy = "projectionFilm")
@JsonProperty(access = Access.WRITE_ONLY)
private Collection<Ticket> tickets;
@ManyToOne
private Seance seance;
public ProjectionFilm() {
	super();
	// TODO Auto-generated constructor stub
}
public ProjectionFilm(Long id, Date dateProjection, double prix, Salle salle, Film film, Collection<Ticket> tickets,
		Seance seance) {
	super();
	this.id = id;
	this.dateProjection = dateProjection;
	this.prix = prix;
	this.salle = salle;
	this.film = film;
	this.tickets = tickets;
	this.seance = seance;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDateProjection() {
	return dateProjection;
}
public void setDateProjection(Date dateProjection) {
	this.dateProjection = dateProjection;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Salle getSalle() {
	return salle;
}
public void setSalle(Salle salle) {
	this.salle = salle;
}
public Film getFilm() {
	return film;
}
public void setFilm(Film film) {
	this.film = film;
}
public Collection<Ticket> getTickets() {
	return tickets;
}
public void setTickets(Collection<Ticket> tickets) {
	this.tickets = tickets;
}
public Seance getSeance() {
	return seance;
}
public void setSeance(Seance seance) {
	this.seance = seance;
}




	

}
