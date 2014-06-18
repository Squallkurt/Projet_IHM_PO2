package model;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;

public class Carnet implements CarnetInt {
	
	private String identifiant;

	
	//Constructeur du Carnet d'adresse
	public Carnet(String identifiant) {
		super();
		this.identifiant = identifiant;
		this.contacts = new ArrayList<Personne>();
		this.contactPro = new ArrayList<Professionnel>();
		this.contactPers = new ArrayList<Particulier>();
	}

	
	//Getters et Setters
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
	//Création des ArrayLists
	private ArrayList<Personne> contacts;
	
	private ArrayList<Particulier> contactPers;
	
	private ArrayList<Professionnel> contactPro;

	//Getters et Setters des ArrayLists
	public ArrayList<Personne> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<Personne> contacts) {
		this.contacts = contacts;
	}

	public ArrayList<Particulier> getContactPers() {
		return contactPers;
	}

	public void setContactPers(ArrayList<Particulier> contactPers) {
		this.contactPers = contactPers;
	}

	public ArrayList<Professionnel> getContactPro() {
		return contactPro;
	}

	public void setContactPro(ArrayList<Professionnel> contactPro) {
		this.contactPro = contactPro;
	}
	
	
	//Ajout d'un contact professionnel ou particulier
	public void ajoutContactPro(Professionnel contactPro) {
		this.getContactPro().add(contactPro);
		this.getContacts().add(contactPro);
	}
	
	public void ajoutContactPers(Particulier contactPers) {
		this.getContactPers().add(contactPers);
		this.getContacts().add(contactPers);
	}
	
	
	//Suppression d'un contact professionnel ou particulier
	public void supprContactPro(Professionnel contactPro) {
		this.getContactPro().remove(contactPro);
		this.getContacts().remove(contactPro);
	}
	
	public void supprContactPers(Particulier contactPers) {
		this.getContactPers().remove(contactPers);
		this.getContacts().remove(contactPers);
	}	
	
	public Object[][] convertToArray() {
		Object[][] table = new String[][]{};
		for(int i=0;i<contacts.size();i++){
			table[i][0] = contacts.get(i).getNom();
			table[i][1] = contacts.get(i).getPrenom();
			table[i][2] = contacts.get(i).getPortable();
			table[i][3] = contacts.get(i).getEmail();
		}
		return table;
	}
}
