package vue;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

import model.Particulier;
import controleur.ConsulterControleurPart;

public class ConsulterVuePart {
	protected Particulier particulier;
	protected CarnetVue vueParent;
	private ConsulterControleurPart controleur = new ConsulterControleurPart(this,particulier);;
	private JLabel nom;
	private JLabel nomLabel;
	private JLabel prenom;
	private JLabel prenomLabel;
	private JLabel civilite;
	private ButtonGroup groupCivilite;
	private JRadioButton mr;
	private JRadioButton mme;
	private JLabel adresse;
	private JLabel adresseLabel;
	private JLabel telFixe;
	private JLabel telFixeLabel;
	private JLabel portable;
	private JLabel portableLabel;
	private JLabel email;
	private JLabel emailLabel;



	public ConsulterVuePart(Particulier particulier){
		this.particulier= particulier;
		JFrame fenetrePart = new JFrame("Consulter");
		JPanel panneauPart = new JPanel();
		panneauPart.setLayout(new GridLayout(8,2));
		
		nom = new JLabel("Nom");
		nomLabel = new JLabel(particulier.getNom());
		
		prenom = new JLabel("Prénom");
		prenomLabel = new JLabel(particulier.getPrenom());
		
		civilite = new JLabel("Civilité");
		groupCivilite = new ButtonGroup();
		mr = new JRadioButton("Mr");
		groupCivilite.add(mr);
		mme = new JRadioButton("Mme");
		groupCivilite.add(mme);
		if (particulier.getCivilite()=="Mr")
		{
			mr.setSelected(true);
		}
		else if (particulier.getCivilite()=="Mme")
		{
			mme.setSelected(true);
		}

		
		adresse = new JLabel("Adresse");
		adresseLabel = new JLabel(particulier.getAdresse());
		
		telFixe = new JLabel("Téléphone Fixe");
		telFixeLabel = new JLabel(particulier.getNumDomicile());
		
		portable = new JLabel("Portable");
		portableLabel = new JLabel(particulier.getPortable());
		
		email = new JLabel("Email");
		emailLabel = new JLabel(particulier.getEmail());
		
		//Ajout des composants dans le JPanel
		panneauPart.add(nom);
			panneauPart.add(nomLabel);
		panneauPart.add(prenom);
			panneauPart.add(prenomLabel);
		panneauPart.add(mr);
			panneauPart.add(mme);
		panneauPart.add(adresse);
			panneauPart.add(adresseLabel);
		panneauPart.add(telFixe);
			panneauPart.add(telFixeLabel);
		panneauPart.add(portable);
			panneauPart.add(portableLabel);
		panneauPart.add(email);
			panneauPart.add(emailLabel);
		
		fenetrePart.add(panneauPart);
		
		fenetrePart.pack();
		fenetrePart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetrePart.setVisible(true);
		fenetrePart.setResizable(true);
	}

	public Particulier getParticulier() {
		return particulier;
	}

	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}
	
	public CarnetVue getVueParent() {
		return vueParent;
	}

	public void setVueParent(CarnetVue vueParent) {
		this.vueParent = vueParent;
	}

	public ConsulterControleurPart getControleur() {
		return controleur;
	}

	public void setControleur(ConsulterControleurPart controleur) {
		this.controleur = controleur;
	}

	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getNomLabel() {
		return nomLabel;
	}

	public void setNomLabel(JLabel nomLabel) {
		this.nomLabel = nomLabel;
	}

	public JLabel getPrenom() {
		return prenom;
	}

	public void setPrenom(JLabel prenom) {
		this.prenom = prenom;
	}

	public JLabel getPrenomLabel() {
		return prenomLabel;
	}

	public void setPrenomLabel(JLabel prenomLabel) {
		this.prenomLabel = prenomLabel;
	}

	public JLabel getCivilite() {
		return civilite;
	}

	public void setCivilite(JLabel civilite) {
		this.civilite = civilite;
	}

	public ButtonGroup getGroupCivilite() {
		return groupCivilite;
	}

	public void setGroupCivilite(ButtonGroup groupCivilite) {
		this.groupCivilite = groupCivilite;
	}
	
	

	public JRadioButton getMr() {
		return mr;
	}

	public void setMr(JRadioButton mr) {
		this.mr = mr;
	}

	public JRadioButton getMme() {
		return mme;
	}

	public void setMme(JRadioButton mme) {
		this.mme = mme;
	}

	public JLabel getAdresse() {
		return adresse;
	}

	public void setAdresse(JLabel adresse) {
		this.adresse = adresse;
	}

	public JLabel getAdresseLabel() {
		return adresseLabel;
	}

	public void setAdresseLabel(JLabel adresseLabel) {
		this.adresseLabel = adresseLabel;
	}

	public JLabel getTelFixe() {
		return telFixe;
	}

	public void setTelFixe(JLabel telFixe) {
		this.telFixe = telFixe;
	}

	public JLabel getTelFixeLabel() {
		return telFixeLabel;
	}

	public void setTelFixeLabel(JLabel telFixeLabel) {
		this.telFixeLabel = telFixeLabel;
	}

	public JLabel getPortable() {
		return portable;
	}

	public void setPortable(JLabel portable) {
		this.portable = portable;
	}

	public JLabel getPortableLabel() {
		return portableLabel;
	}

	public void setPortableLabel(JLabel portableLabel) {
		this.portableLabel = portableLabel;
	}

	public JLabel getEmail() {
		return email;
	}

	public void setEmail(JLabel email) {
		this.email = email;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(JLabel emailLabel) {
		this.emailLabel = emailLabel;
	}

}
