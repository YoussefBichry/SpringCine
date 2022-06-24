package org.sid.entite;

import java.util.Collection;
import java.util.Date;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString 

public class Film {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private double duree;
	private String realisateur;
	private String Description;
	private String photo;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateSortie;	
	@OneToMany(mappedBy = "film")
	
//dans la consultation il va  pas donne la liste des projections
@JsonProperty( access = Access.WRITE_ONLY)
	private Collection <ProjectionFilm> pojectionsFilms;
	@ManyToOne
	private Categorie categorie;
	public String getPhoto() {
		// TODO Auto-generated method stub
		return null;
	}
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Film(Long id, String titre, double duree, String realisateur, String description, String photo,
			Date dateSortie, Collection<ProjectionFilm> pojectionsFilms, Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.duree = duree;
		this.realisateur = realisateur;
		Description = description;
		this.photo = photo;
		this.dateSortie = dateSortie;
		this.pojectionsFilms = pojectionsFilms;
		this.categorie = categorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Collection<ProjectionFilm> getPojectionsFilms() {
		return pojectionsFilms;
	}
	public void setPojectionsFilms(Collection<ProjectionFilm> pojectionsFilms) {
		this.pojectionsFilms = pojectionsFilms;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

	}


