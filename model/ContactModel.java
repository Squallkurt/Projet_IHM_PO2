package model;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ContactModel extends AbstractTableModel {
	
	protected Carnet carnet;

	public ContactModel(Carnet carnet) {
		super();
		this.carnet = carnet;
	}

	@Override
	public int getColumnCount(){
		return 5;
	}

	@Override
	public int getRowCount() {
		return carnet.getContacts().size();
	}

	@Override
	public Object getValueAt(int i, int arg) {
		if (arg==0)
		{
			return carnet.getContacts().get(i).getNom();
		}
		else if (arg==1)
		{
			return carnet.getContacts().get(i).getPrenom();
		}
		else if (arg==2)
		{
			return carnet.getContacts().get(i).getPortable();
		}
		else if (arg==3)
		{
			return carnet.getContacts().get(i).getEmail();
		}
		else if (arg==4)
		{
			if (carnet.getContacts().get(i) instanceof Particulier)
			{
				return ("Particulier");
			}
			else if (carnet.getContacts().get(i) instanceof Professionnel)
			{
				return ("Professionnel");
			}
		}
		return ("");
	}
	//Suppression d'une ligne du carnet
	public void removeRow(int row) {
	    carnet.getContacts().remove(row);
	    fireTableRowsDeleted(row, row);
	}

}
