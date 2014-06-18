package model;

public abstract class Personne {
	
	protected String nom;
	protected String prenom;
	protected String civilite;
	protected String adresse;
	protected String portable;
	protected String email;
	

	
	//Les getters et setters des différents attributs de la classe Personne
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public abstract boolean contactValide();
	
	
	

}
