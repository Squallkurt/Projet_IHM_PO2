package vue;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;





import controleur.CarnetControleur;
import model.Carnet;
import model.ContactModel;

public class CarnetVue extends JFrame {

	private Carnet carnet;
	protected CarnetControleur controleur = new CarnetControleur(this,carnet);
	protected ContactModel tableModel;
	protected JTable contacts;
	
	public CarnetVue (){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JFrame fenetreCarn = new JFrame("Carnet d'adresse");
		JPanel panneauCarn1 = new JPanel();
		JPanel panneauCarn2 = new JPanel();
		carnet = new Carnet("");
		
		
		
		
		
		
		
		tableModel = new ContactModel(carnet);
		contacts = new JTable(tableModel);
		String[] entetes = {"Nom", "Prénom", "Portable", "Email", "Type","Consulter","Modifier","Supprimer"};
		//Object[][] don = carnet.convertToArray();
		//contacts = new JTable(don, entetes);
		getContentPane().add(new JScrollPane(contacts), BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		
		JButton ajoutContactPro = new JButton("Ajouter contact Professionnel");
		ajoutContactPro.addActionListener(controleur);
		JButton ajoutContactPart = new JButton("Ajouter contact Particulier");
		ajoutContactPart.addActionListener(controleur);
		
		JButton consulter= new JButton("Consulter Contact");
		consulter.addActionListener(controleur);
		
		JButton modifier= new JButton("Modifier Contact");
		modifier.addActionListener(controleur);
		
		JButton supprime = new JButton("Supprimer Contact");
		supprime.addActionListener(controleur);
		
		
		
		panneauCarn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		fenetreCarn.setLayout(new GridLayout(2,1));
		
		
		//Ajout des composants dans les JPanels
		panneauCarn1.add(contacts);
		
		
		panneauCarn2.add(ajoutContactPro);
		panneauCarn2.add(ajoutContactPart);

		panneauCarn2.add(consulter);
		panneauCarn2.add(modifier);
		panneauCarn2.add(supprime);
		
		fenetreCarn.add(panneauCarn1);
		fenetreCarn.add(panneauCarn2);
		
		
		//fenetreCarn.pack();
		fenetreCarn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetreCarn.setVisible(true);
		fenetreCarn.setResizable(true);
		
	}

	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}

	public CarnetControleur getControleur() {
		return controleur;
	}

	public void setControleur(CarnetControleur controleur) {
		this.controleur = controleur;
	}

	public ContactModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(ContactModel tableModel) {
		this.tableModel = tableModel;
	}

	public JTable getContacts() {
		return contacts;
	}

	public void setContacts(JTable contacts) {
		this.contacts = contacts;
	}
	

}
