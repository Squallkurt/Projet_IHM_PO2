package model;

public class Particulier extends Personne {
	
	private String numDomicile;

	
	
	public Particulier() {
		super();
	}

	//Constructeur qui crée une entité Personne de type Particulier
	public Particulier(String nom, String prenom, String civilite, 
			String adresse, String portable, String email, String numDomicile) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.adresse = adresse;
		this.portable = portable;
		this.email = email;
		this.numDomicile = numDomicile;
	}

	//Getters et settersdu numéro de Domicile
	public String getNumDomicile() {
		return numDomicile;
	}
	public void setNumDomicile(String numDomicile) {
		this.numDomicile = numDomicile;
	}


	@Override
	public boolean contactValide() {
		if (this.nom ==null || this.prenom==null)
		{
			return false;
		}
		else if (this.nom.trim().equalsIgnoreCase("") || this.prenom.trim().equalsIgnoreCase(""))
		{
			return false;
		}
		else return true;

	}

	

}
