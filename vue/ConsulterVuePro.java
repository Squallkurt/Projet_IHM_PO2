package vue;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

import model.Professionnel;
import controleur.ConsulterControleurPro;
import controleur.ProfessionnelControleur;

public class ConsulterVuePro {

	
	protected Professionnel professionnel;
	protected CarnetVue vueParent;
	private ConsulterControleurPro controleur = new ConsulterControleurPro(this,professionnel);;
	private JLabel nom;
	private JLabel nomLabel;
	private JLabel prenom;
	private JLabel prenomLabel;
	private JLabel civilite;
	private ButtonGroup groupCivilite;
	private JRadioButton mr;
	private JRadioButton mme;
	private JLabel nomEntr;
	private JLabel nomEntrLabel;
	private JLabel fonction;
	private JLabel fonctionLabel;
	private JLabel adresse;
	private JLabel adresseLabel;
	private JLabel numBureau;
	private JLabel numBureauLabel;
	private JLabel portable;
	private JLabel portableLabel;
	private JLabel email;
	private JLabel emailLabel;

	
	public ConsulterVuePro(Professionnel professionnel){
		this.professionnel = professionnel;
		JFrame fenetrePro = new JFrame("Professionnel");
		JPanel panneauPro = new JPanel();
		panneauPro.setLayout(new GridLayout(10,2));
		
		nom = new JLabel("Nom");
		nomLabel = new JLabel(professionnel.getNom());
		
		prenom = new JLabel("Prénom");
		prenomLabel = new JLabel(professionnel.getPrenom());
		
		civilite = new JLabel("Civilité");
		groupCivilite = new ButtonGroup();
		mr = new JRadioButton("Mr");
		groupCivilite.add(mr);
		mme = new JRadioButton("Mme");
		groupCivilite.add(mme);
		if (professionnel.getCivilite()=="Mr")
		{
			mr.setSelected(true);
		}
		else if (professionnel.getCivilite()=="Mme")
		{
			mme.setSelected(true);
		}

		nomEntr = new JLabel("Nom Entreprise");
		nomEntrLabel = new JLabel(professionnel.getNomEntreprise());
		
		fonction = new JLabel("Fonction");
		fonctionLabel = new JLabel(professionnel.getFonction());
		
		adresse = new JLabel("Adresse");
		adresseLabel = new JLabel(professionnel.getAdresse());
		
		numBureau = new JLabel("Téléphone Bureau");
		numBureauLabel = new JLabel(professionnel.getNumBureau());
		
		portable = new JLabel("Portable");
		portableLabel = new JLabel(professionnel.getPortable());
		
		email = new JLabel("Email");
		emailLabel = new JLabel(professionnel.getEmail());
		
		//Ajout des composants dans le JPanel
		panneauPro.add(nom);
			panneauPro.add(nomLabel);
		panneauPro.add(prenom);
			panneauPro.add(prenomLabel);
		panneauPro.add(mr);
			panneauPro.add(mme);
		panneauPro.add(nomEntr);
			panneauPro.add(nomEntrLabel);
		panneauPro.add(fonction);
			panneauPro.add(fonctionLabel);
		panneauPro.add(adresse);
			panneauPro.add(adresseLabel);
		panneauPro.add(numBureau);
			panneauPro.add(numBureauLabel);
		panneauPro.add(portable);
			panneauPro.add(portableLabel);
		panneauPro.add(email);
			panneauPro.add(emailLabel);
		
		fenetrePro.add(panneauPro);
		
		fenetrePro.pack();
		fenetrePro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetrePro.setVisible(true);
		fenetrePro.setResizable(true);
	}

	public Professionnel getProfessionnel() {
		return professionnel;
	}

	public void setProfessionnel(Professionnel professionnel) {
		this.professionnel = professionnel;
	}

	public CarnetVue getVueParent() {
		return vueParent;
	}

	public void setVueParent(CarnetVue vueParent) {
		this.vueParent = vueParent;
	}

	public ConsulterControleurPro getControleur() {
		return controleur;
	}

	public void setControleur(ConsulterControleurPro controleur) {
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

	public JLabel getNomEntr() {
		return nomEntr;
	}

	public void setNomEntr(JLabel nomEntr) {
		this.nomEntr = nomEntr;
	}

	public JLabel getNomEntrLabel() {
		return nomEntrLabel;
	}

	public void setNomEntrLabel(JLabel nomEntrLabel) {
		this.nomEntrLabel = nomEntrLabel;
	}

	public JLabel getFonction() {
		return fonction;
	}

	public void setFonction(JLabel fonction) {
		this.fonction = fonction;
	}

	public JLabel getFonctionLabel() {
		return fonctionLabel;
	}

	public void setFonctionLabel(JLabel fonctionLabel) {
		this.fonctionLabel = fonctionLabel;
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

	public JLabel getNumBureau() {
		return numBureau;
	}

	public void setNumBureau(JLabel numBureau) {
		this.numBureau = numBureau;
	}

	public JLabel getNumBureauLabel() {
		return numBureauLabel;
	}

	public void setNumBureauLabel(JLabel numBureauLabel) {
		this.numBureauLabel = numBureauLabel;
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
