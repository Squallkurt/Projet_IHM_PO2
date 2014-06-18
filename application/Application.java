package application;

import vue.CarnetVue;
import vue.ParticulierVue;
import vue.ProfessionnelVue;
import model.Carnet;
import model.Particulier;
import model.Professionnel;

public class Application {

	public static void main(String[] args) {
		Particulier particulier1 = new Particulier("Durand", "Pierre", "Mr", "7 rue Bisson", "0678767698", "pierre@laposte.net", "0240397675");
		Professionnel professionnel1 = new Professionnel("Dupuis", "Marie", "Mme", "9 avenue Prevert", "0676349876", "Marie@areva.com", "0195673421","Areva","Directeur");
		/*Carnet car1 = new Carnet("Contacts");
		car1.ajoutContactPers(particulier1);
		
		ParticulierVue vuePart1 = new ParticulierVue(particulier1);
		ParticulierVue vuePart2 = new ParticulierVue(new Particulier());
		ProfessionnelVue vuePro1 = new ProfessionnelVue(professionnel1);
		ProfessionnelVue vuePro2 = new ProfessionnelVue(new Professionnel());*/
		CarnetVue carnetVue = new CarnetVue();
		carnetVue.getCarnet().ajoutContactPers(particulier1);
		carnetVue.getCarnet().ajoutContactPro(professionnel1);
		carnetVue.pack();

	}

}
