package vue;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.*;

import controleur.CarnetControleur;
import controleur.ParticulierControleur;
import model.Particulier;

public class ParticulierVue extends JFrame{
	protected Particulier particulier;
	protected CarnetVue vueParent;
	private ParticulierControleur controleur = new ParticulierControleur(this,particulier);;
	private JLabel nom;
	private JTextField nomField;
	private JLabel prenom;
	private JTextField prenomField;
	private JLabel civilite;
	private ButtonGroup groupCivilite;
	private JRadioButton mr;
	private JRadioButton mme;
	private JLabel adresse;
	private JTextField adresseField;
	private JLabel telFixe;
	private JTextField telFixeField;
	private JLabel portable;
	private JTextField portableField;
	private JLabel email;
	private JTextField emailField;



	public ParticulierVue(Particulier particulier){
		this.particulier= particulier;
		JFrame fenetrePart = new JFrame("Particulier");
		JPanel panneauPart = new JPanel();
		panneauPart.setLayout(new GridLayout(8,2));
		
		nom = new JLabel("Nom");
		nomField = new JTextField(particulier.getNom());
		
		prenom = new JLabel("Prénom");
		prenomField = new JTextField(particulier.getPrenom());
		
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
		adresseField = new JTextField(particulier.getAdresse());
		
		telFixe = new JLabel("Téléphone Fixe");
		telFixeField = new JTextField(particulier.getNumDomicile());
		
		portable = new JLabel("Portable");
		portableField = new JTextField(particulier.getPortable());
		
		email = new JLabel("Email");
		emailField = new JTextField(particulier.getEmail());
		
		JButton enregistrer = new JButton("Enregistrer");
		enregistrer.addActionListener(controleur);
		
		//Ajout des composants dans le JPanel
		panneauPart.add(nom);
			panneauPart.add(nomField);
		panneauPart.add(prenom);
			panneauPart.add(prenomField);
		panneauPart.add(mr);
			panneauPart.add(mme);
		panneauPart.add(adresse);
			panneauPart.add(adresseField);
		panneauPart.add(telFixe);
			panneauPart.add(telFixeField);
		panneauPart.add(portable);
			panneauPart.add(portableField);
		panneauPart.add(email);
			panneauPart.add(emailField);
		panneauPart.add(enregistrer);
		
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

	public ParticulierControleur getControleur() {
		return controleur;
	}

	public void setControleur(ParticulierControleur controleur) {
		this.controleur = controleur;
	}

	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JTextField getNomField() {
		return nomField;
	}

	public void setNomField(JTextField nomField) {
		this.nomField = nomField;
	}

	public JLabel getPrenom() {
		return prenom;
	}

	public void setPrenom(JLabel prenom) {
		this.prenom = prenom;
	}

	public JTextField getPrenomField() {
		return prenomField;
	}

	public void setPrenomField(JTextField prenomField) {
		this.prenomField = prenomField;
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

	public JTextField getAdresseField() {
		return adresseField;
	}

	public void setAdresseField(JTextField adresseField) {
		this.adresseField = adresseField;
	}

	public JLabel getTelFixe() {
		return telFixe;
	}

	public void setTelFixe(JLabel telFixe) {
		this.telFixe = telFixe;
	}

	public JTextField getTelFixeField() {
		return telFixeField;
	}

	public void setTelFixeField(JTextField telFixeField) {
		this.telFixeField = telFixeField;
	}

	public JLabel getPortable() {
		return portable;
	}

	public void setPortable(JLabel portable) {
		this.portable = portable;
	}

	public JTextField getPortableField() {
		return portableField;
	}

	public void setPortableField(JTextField portableField) {
		this.portableField = portableField;
	}

	public JLabel getEmail() {
		return email;
	}

	public void setEmail(JLabel email) {
		this.email = email;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}
	


}
