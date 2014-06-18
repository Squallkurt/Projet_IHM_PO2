package model;

public class Professionnel extends Personne {
	
	private String numBureau;
	private String nomEntreprise;
	private String fonction;
	
	
	

	public Professionnel() {
		super();
	}


	//Constructeur qui crée une entité de Personne de type Professionnel
	public Professionnel(String nom, String prenom, String civilite, 
			String adresse, String portable, String email, String numBureau, 
			String nomEntreprise, String fonction) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.adresse = adresse;
		this.portable = portable;
		this.email = email;
		this.numBureau = numBureau;
		this.nomEntreprise = nomEntreprise;
		this.fonction = fonction;
	}
	
	
	//Getters et setters du numéro de Bureau
	public String getNumBureau() {
		return numBureau;
	}
	public void setNumBureau(String numBureau) {
		this.numBureau = numBureau;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


		@Override
		public boolean contactValide() {
			if (this.nom ==null || this.prenom==null || this.nomEntreprise==null)
			{
				return false;
			}
			else if (this.nom.trim().equalsIgnoreCase("") || this.prenom.trim().equalsIgnoreCase("") || this.nomEntreprise.trim().equalsIgnoreCase(""))
			{
				return false;
			}
			else return true;

		}


}
