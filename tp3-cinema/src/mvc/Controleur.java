package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Controleur {
	
	private Model le_model;
	private Vue la_vue;
	
	
	public Controleur(Model le_model, Vue la_vue) {
		this.le_model = le_model;
		this.la_vue = la_vue;
		
		
		this.la_vue.addCalculateListener(new CalculateListener());

		
		
	}
	
	
	public void menu_cinema() {
		//active_menu_cinema()
		
		
		
	}
	
	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			le_model.active_menu_cinema(la_vue.getPanel_cinema(),la_vue.getMenu());
			String[] listeClien = le_model.charger_liste_clien(1);
			
			
			
		}
	}

	

}
