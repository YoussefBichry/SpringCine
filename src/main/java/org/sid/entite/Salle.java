package org.sid.entite;


import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Salle {


@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
private String name;
private int nombrePlaces;
@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)
private Cinema cinema;
@OneToMany(mappedBy = "salle")
@JsonProperty(access = Access.WRITE_ONLY)
private Collection<Place>Places;
@OneToMany(mappedBy = "salle")
@JsonProperty(access = Access.WRITE_ONLY)
private Collection <ProjectionFilm> projectionsFilms;
public Salle() {
	super();
	// TODO Auto-generated constructor stub
}
public Salle(Long id, String name, int nombrePlaces, Cinema cinema, Collection<Place> places,
		Collection<ProjectionFilm> projectionsFilms) {
	super();
	this.id = id;
	this.name = name;
	this.nombrePlaces = nombrePlaces;
	this.cinema = cinema;
	Places = places;
	this.projectionsFilms = projectionsFilms;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNombrePlaces() {
	return nombrePlaces;
}
public void setNombrePlaces(int nombrePlaces) {
	this.nombrePlaces = nombrePlaces;
}
public Cinema getCinema() {
	return cinema;
}
public void setCinema(Cinema cinema) {
	this.cinema = cinema;
}
public Collection<Place> getPlaces() {
	return Places;
}
public void setPlaces(Collection<Place> places) {
	Places = places;
}
public Collection<ProjectionFilm> getProjectionsFilms() {
	return projectionsFilms;
}
public void setProjectionsFilms(Collection<ProjectionFilm> projectionsFilms) {
	this.projectionsFilms = projectionsFilms;
}



}
