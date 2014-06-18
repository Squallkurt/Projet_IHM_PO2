package controleur;


import model.Particulier;
import vue.ConsulterVuePart;

public class ConsulterControleurPart {

	protected ConsulterVuePart consulterVuePart;
	protected Particulier particulier;
	


	public ConsulterControleurPart(ConsulterVuePart consulterVuePart,
			Particulier particulier) {
		super();
		this.consulterVuePart = consulterVuePart;
		this.particulier = particulier;
	}

	public ConsulterVuePart getParticulierVue() {
		return consulterVuePart;
	}

	public void setParticulierVue(ConsulterVuePart consulterVuePart) {
		this.consulterVuePart = consulterVuePart;
	}

	public Particulier getParticulier() {
		return particulier;
	}

	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}

}
