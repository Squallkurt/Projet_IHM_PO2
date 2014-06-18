package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import exception.*;
import model.Professionnel;
import vue.ProfessionnelVue;

public class ProfessionnelControleur implements ActionListener {

	protected ProfessionnelVue professionnelVue;
	protected Professionnel professionnel;


	public ProfessionnelControleur(ProfessionnelVue professionnelVue,
			Professionnel professionnel) {
		super();
		this.professionnelVue = professionnelVue;
		this.professionnel = professionnel;
	}


	public ProfessionnelVue getProfessionnelVue() {
		return professionnelVue;
	}


	public void setProfessionnelVue(ProfessionnelVue professionnelVue) {
		this.professionnelVue = professionnelVue;
	}


	public Professionnel getProfessionnel() {
		return professionnel;
	}


	public void setProfessionnel(Professionnel professionnel) {
		this.professionnel = professionnel;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton s = (JButton)e.getSource();
		
		if (s.getText().compareTo("Enregistrer")==0)
		{
			professionnel = new Professionnel();
			boolean nouveauContact=!professionnel.contactValide();
			
			if (!professionnelVue.getNomField().getText().trim().equalsIgnoreCase(""))
			{
				professionnel.setNom(professionnelVue.getNomField().getText());
			}
			if (!professionnelVue.getPrenomField().getText().trim().equalsIgnoreCase(""))
			{
				professionnel.setPrenom(professionnelVue.getPrenomField().getText());
			}
			if (!professionnelVue.getNomEntrField().getText().trim().equalsIgnoreCase(""))
			{
				professionnel.setNomEntreprise(professionnelVue.getNomEntrField().getText());
			}
			if (professionnelVue.getMr().isSelected())
			{
				professionnel.setCivilite("Mr");
			}
			else if (professionnelVue.getMme().isSelected())
			{
				professionnel.setCivilite("Mme"); 
			}
			professionnel.setNomEntreprise(professionnelVue.getNomEntrField().getText());
			professionnel.setFonction(professionnelVue.getFonctionField().getText());
			professionnel.setAdresse(professionnelVue.getAdresseField().getText());
			professionnel.setNumBureau(professionnelVue.getNumBureauField().getText());
			professionnel.setPortable(professionnelVue.getPortableField().getText());
			professionnel.setEmail(professionnelVue.getEmailField().getText());
			System.out.println("taille avant ajout:" + professionnelVue.getVueParent().getCarnet().getContacts().size());
			System.out.println("taille après ajout:" + professionnelVue.getVueParent().getCarnet().getContacts().size());
			if (nouveauContact)
			{
				if (professionnel.contactValide())
				{
					professionnelVue.getVueParent().getCarnet().ajoutContactPro(professionnel);
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
			professionnelVue.dispose();
			professionnelVue.getVueParent().getTableModel().fireTableDataChanged();
		}

		
	}
}
