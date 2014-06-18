package controleur;

import model.Professionnel;
import vue.ConsulterVuePro;

public class ConsulterControleurPro {

	protected ConsulterVuePro consulterVuePro;
	protected Professionnel professionnel;


	public ConsulterControleurPro(ConsulterVuePro consulterVuePro,
			Professionnel professionnel) {
		super();
		this.consulterVuePro = consulterVuePro;
		this.professionnel = professionnel;
	}


	public ConsulterVuePro getConsulterVuePro() {
		return consulterVuePro;
	}


	public void setConsulterVuePro(ConsulterVuePro consulterVuePro) {
		this.consulterVuePro = consulterVuePro;
	}


	public Professionnel getProfessionnel() {
		return professionnel;
	}


	public void setProfessionnel(Professionnel professionnel) {
		this.professionnel = professionnel;
	}

}
