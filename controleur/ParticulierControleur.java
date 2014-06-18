package controleur;

import exception.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Particulier;
import vue.ParticulierVue;

public class ParticulierControleur implements ActionListener {

	protected ParticulierVue particulierVue;
	protected Particulier particulier;
	


	public ParticulierControleur(ParticulierVue particulierVue,
			Particulier particulier) {
		super();
		this.particulierVue = particulierVue;
		this.particulier = particulier;
	}

	public ParticulierVue getParticulierVue() {
		return particulierVue;
	}

	public void setParticulierVue(ParticulierVue particulierVue) {
		this.particulierVue = particulierVue;
	}

	public Particulier getParticulier() {
		return particulier;
	}

	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton s = (JButton)e.getSource();
		
		if (s.getText().compareTo("Enregistrer")==0)
		{
			particulier = getParticulierVue().getParticulier();
			
			boolean nouveauContact=!particulier.contactValide();
			
			if (!particulierVue.getNomField().getText().trim().equalsIgnoreCase(""))
			{
				particulier.setNom(particulierVue.getNomField().getText());
			}
			if (!particulierVue.getPrenomField().getText().trim().equalsIgnoreCase(""))
			{
				particulier.setPrenom(particulierVue.getPrenomField().getText());
			}
			if (particulierVue.getMr().isSelected())
			{
				particulier.setCivilite("Mr");
			}
			else if (particulierVue.getMme().isSelected())
			{
				particulier.setCivilite("Mme"); 
			}
			particulier.setAdresse(particulierVue.getAdresseField().getText());
			particulier.setPortable(particulierVue.getPortableField().getText());
			particulier.setEmail(particulierVue.getEmailField().getText());
			particulier.setNumDomicile(particulierVue.getTelFixeField().getText());
			System.out.println("taille avant ajout:" + particulierVue.getVueParent().getCarnet().getContacts().size());
			
			if (nouveauContact)
			{
				if (particulier.contactValide())
				{
					particulierVue.getVueParent().getCarnet().ajoutContactPers(particulier);
				}
				else
				{
					try {
						throw new ContactNonValideException("Vous ne pouvez pas ajouter un contact non valide au carnet, renseigner correctement les champs");
					} catch (ContactNonValideException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			System.out.println("taille après ajout:" + particulierVue.getVueParent().getCarnet().getContacts().size());
				particulierVue.dispose();
				particulierVue.getVueParent().getTableModel().fireTableDataChanged();
		}
		
		
	}
	
	
	
	

}
