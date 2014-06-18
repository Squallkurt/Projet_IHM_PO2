package vue;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.*;

import controleur.ProfessionnelControleur;
import model.Professionnel;
import model.Professionnel;

public class ProfessionnelVue extends JFrame {
	protected Professionnel professionnel;
	protected CarnetVue vueParent;
	private ProfessionnelControleur controleur = new ProfessionnelControleur(this,professionnel);;
	private JLabel nom;
	private JTextField nomField;
	private JLabel prenom;
	private JTextField prenomField;
	private JLabel civilite;
	private ButtonGroup groupCivilite;
	private JRadioButton mr;
	private JRadioButton mme;
	private JLabel nomEntr;
	private JTextField nomEntrField;
	private JLabel fonction;
	private JTextField fonctionField;
	private JLabel adresse;
	private JTextField adresseField;
	private JLabel numBureau;
	private JTextField numBureauField;
	private JLabel portable;
	private JTextField portableField;
	private JLabel email;
	private JTextField emailField;

	
	public ProfessionnelVue(Professionnel professionnel){
		this.professionnel = professionnel;
		JFrame fenetrePro = new JFrame("Professionnel");
		JPanel panneauPro = new JPanel();
		panneauPro.setLayout(new GridLayout(10,2));
		
		nom = new JLabel("Nom");
		nomField = new JTextField(professionnel.getNom());
		
		prenom = new JLabel("Prénom");
		prenomField = new JTextField(professionnel.getPrenom());
		
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
		nomEntrField = new JTextField(professionnel.getNomEntreprise());
		
		fonction = new JLabel("Fonction");
		fonctionField = new JTextField(professionnel.getFonction());
		
		adresse = new JLabel("Adresse");
		adresseField = new JTextField(professionnel.getAdresse());
		
		numBureau = new JLabel("Téléphone Bureau");
		numBureauField = new JTextField(professionnel.getNumBureau());
		
		portable = new JLabel("Portable");
		portableField = new JTextField(professionnel.getPortable());
		
		email = new JLabel("Email");
		emailField = new JTextField(professionnel.getEmail());
		
		JButton enregistrer = new JButton("Enregistrer");
		enregistrer.addActionListener(controleur);
		
		//Ajout des composants dans le JPanel
		panneauPro.add(nom);
			panneauPro.add(nomField);
		panneauPro.add(prenom);
			panneauPro.add(prenomField);
		panneauPro.add(mr);
			panneauPro.add(mme);
		panneauPro.add(nomEntr);
			panneauPro.add(nomEntrField);
		panneauPro.add(fonction);
			panneauPro.add(fonctionField);
		panneauPro.add(adresse);
			panneauPro.add(adresseField);
		panneauPro.add(numBureau);
			panneauPro.add(numBureauField);
		panneauPro.add(portable);
			panneauPro.add(portableField);
		panneauPro.add(email);
			panneauPro.add(emailField);
		panneauPro.add(enregistrer);
		
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

	public ProfessionnelControleur getControleur() {
		return controleur;
	}

	public void setControleur(ProfessionnelControleur controleur) {
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

	public JLabel getNomEntr() {
		return nomEntr;
	}

	public void setNomEntr(JLabel nomEntr) {
		this.nomEntr = nomEntr;
	}

	public JTextField getNomEntrField() {
		return nomEntrField;
	}

	public void setNomEntrField(JTextField nomEntrField) {
		this.nomEntrField = nomEntrField;
	}

	public JLabel getFonction() {
		return fonction;
	}

	public void setFonction(JLabel fonction) {
		this.fonction = fonction;
	}

	public JTextField getFonctionField() {
		return fonctionField;
	}

	public void setFonctionField(JTextField fonctionField) {
		this.fonctionField = fonctionField;
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

	public JLabel getNumBureau() {
		return numBureau;
	}

	public void setNumBureau(JLabel numBureau) {
		this.numBureau = numBureau;
	}

	public JTextField getNumBureauField() {
		return numBureauField;
	}

	public void setNumBureauField(JTextField numBureauField) {
		this.numBureauField = numBureauField;
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
