package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import exception.ModificationSelectionException;
import model.Carnet;
import model.Particulier;
import model.Personne;
import model.Professionnel;
import vue.CarnetVue;
import vue.ConsulterVuePart;
import vue.ConsulterVuePro;
import vue.ParticulierVue;
import vue.ProfessionnelVue;

public class CarnetControleur implements ActionListener {
	
	protected CarnetVue carnetVue;
	protected Carnet carnet;
	protected Professionnel contactPro;
	protected Particulier contactPart;
	protected Personne contact;
	protected ProfessionnelVue professionnelVue;
	protected ParticulierVue particulierVue;
	protected ConsulterVuePart consulterVuePart;
	protected ConsulterVuePro consulterVuePro;
	
	public CarnetVue getCarnetVue() {
		return carnetVue;
	}

	public void setCarnetVue(CarnetVue carnetVue) {
		this.carnetVue = carnetVue;
	}

	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}

	public Professionnel getContactPro() {
		return contactPro;
	}

	public void setContactPro(Professionnel contactPro) {
		this.contactPro = contactPro;
	}

	public Particulier getContactPart() {
		return contactPart;
	}

	public void setContactPart(Particulier contactPart) {
		this.contactPart = contactPart;
	}

	public CarnetControleur(CarnetVue carnetVue, Carnet carnet) {
		super();
		this.carnetVue = carnetVue;
		this.carnet = carnet;
	}
	

	public Personne getContact() {
		return contact;
	}

	public void setContact(Personne contact) {
		this.contact = contact;
	}
	

	public ProfessionnelVue getProfessionnelVue() {
		return professionnelVue;
	}

	public void setProfessionnelVue(ProfessionnelVue professionnelVue) {
		this.professionnelVue = professionnelVue;
	}

	public ParticulierVue getParticulierVue() {
		return particulierVue;
	}

	public void setParticulierVue(ParticulierVue particulierVue) {
		this.particulierVue = particulierVue;
	}

	
	public ConsulterVuePart getConsulterVuePart() {
		return consulterVuePart;
	}

	public void setConsulterVuePart(ConsulterVuePart consulterVuePart) {
		this.consulterVuePart = consulterVuePart;
	}
	
	public ConsulterVuePro getConsulterVuePro() {
		return consulterVuePro;
	}

	public void setConsulterVuePro(ConsulterVuePro consulterVuePro) {
		this.consulterVuePro = consulterVuePro;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton s = (JButton)e.getSource();
		if (s.getText().compareTo("Ajouter contact Professionnel")==0)
		{
			contactPro = new Professionnel();
			professionnelVue = new ProfessionnelVue(contactPro);	
			professionnelVue.setVueParent(carnetVue);
		}
		else if (s.getText().compareTo("Ajouter contact Particulier")==0)
		{
			contactPart = new Particulier();
			particulierVue = new ParticulierVue(contactPart);	
			particulierVue.setVueParent(carnetVue);
		}
		
		
		
		
		
		
		
		else if (s.getText().compareTo("Consulter")==0)
		{
			int nbrRows = carnetVue.getContacts().getSelectedRows().length;
			if (nbrRows==0)
			{
				try {
					throw new ModificationSelectionException("Selectionner un contact pour pouvoir consulter");
				} catch (ModificationSelectionException e1) {
						// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (nbrRows>1)
			{
				try {
					throw new ModificationSelectionException("Selectionner un seul contact pour consulter");
				} catch (ModificationSelectionException e1) {
						// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				int row = carnetVue.getContacts().getSelectedRow();
				contact = carnetVue.getCarnet().getContacts().get(row);
				
				if (contact instanceof Particulier)
				{
						contactPart = (Particulier) contact;
						consulterVuePart = new ConsulterVuePart(contactPart);
						consulterVuePart.setVueParent(carnetVue);
				}
				else if (contact instanceof Professionnel)
				{
					contactPro = (Professionnel) contact;
					consulterVuePro = new ConsulterVuePro(contactPro);
					consulterVuePro.setVueParent(carnetVue);
				}
				}
		}
		
		
		
		
		
		
		
		else if (s.getText().compareTo("Supprimer Contact")==0)
		{
			int nbrRows = carnetVue.getContacts().getSelectedRows().length;
			for (int i=0;i<nbrRows;i++)
			{
				carnetVue.getTableModel().removeRow(carnetVue.getContacts().getSelectedRow());
			}

		}
		else if (s.getText().compareTo("Modifier Contact")==0)
		{
			int nbrRows = carnetVue.getContacts().getSelectedRows().length;
			if (nbrRows==0)
			{
				try {
					throw new ModificationSelectionException("Selectionner un contact pour pouvoir modifier");
				} catch (ModificationSelectionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (nbrRows>1)
			{
				try {
					throw new ModificationSelectionException("Selectionner un seul contact pour modifier");
				} catch (ModificationSelectionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				int row = carnetVue.getContacts().getSelectedRow();
				contact = carnetVue.getCarnet().getContacts().get(row);
			
				if (contact instanceof Particulier)
				{
					contactPart = (Particulier) contact;
					particulierVue = new ParticulierVue(contactPart);
					particulierVue.setVueParent(carnetVue);
				}
				else if (contact instanceof Professionnel)
				{
					contactPro = (Professionnel) contact;
					professionnelVue = new ProfessionnelVue(contactPro);
					professionnelVue.setVueParent(carnetVue);
				}
			}
			
		}
		
	}

}
