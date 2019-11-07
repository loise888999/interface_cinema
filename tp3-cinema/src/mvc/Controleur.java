package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Controleur {
	
	private Model le_model;
	private Vue la_vue;
	private Integer nobre_reserver;
	
	public Controleur(Model le_model, Vue la_vue) {
		this.le_model = le_model;
		this.la_vue = la_vue;
		
		
		this.la_vue.addCalculateListener(new CalculateListener());
		this.la_vue.addConfirmerReservation(new ConfirmerReservation());
		this.la_vue.addPreCalcul(new PreCalcul());
		
		
		
		
	}
	
	
	public void menu_cinema() {
		//active_menu_cinema()
		
		
		
	}
	
	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			le_model.active_menu_cinema(la_vue.getPanel_cinema(),la_vue.getMenu());
			
			nobre_reserver=le_model.charger_liste_clien(1);
			la_vue.setLblOccuperPlace(nobre_reserver.toString());
			la_vue.setLblDisponiblePlace(String.valueOf(50-nobre_reserver));
			
		}
	}
	class ConfirmerReservation implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Integer nb_place = la_vue.getcBoxNbReservatin().getSelectedIndex();
			Integer nb_dispo = Integer.valueOf(la_vue.getLblDisponiblePlace().getText()) ;
			System.out.println(nb_dispo);
			if(nb_dispo-nb_place > 0 ) {
				le_model.incsrire_client(la_vue.getTxtNom().getText(), nb_place, 
					la_vue.getRdbtPopc().isSelected(), la_vue.getRdbtDbox().isSelected(), la_vue.getRdbt3D().isSelected());
			
				nobre_reserver=le_model.charger_liste_clien(1);
				la_vue.setLblOccuperPlace(nobre_reserver.toString());
				la_vue.setLblDisponiblePlace(String.valueOf(50-nobre_reserver));
			} else {
				la_vue.setLabelRetourError(labelRetourError);
			}
			
			
			
			
		}
	}
	
	
	class PreCalcul implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String prix_calculer;
			
			prix_calculer=le_model.preCalcul( la_vue.getcBoxNbReservatin().getSelectedIndex(), 
					la_vue.getRdbtPopc().isSelected(), la_vue.getRdbtDbox().isSelected(), la_vue.getRdbt3D().isSelected());
			la_vue.setLblPrixCalc(prix_calculer);
			
			
			
			
		}
	}

	

}
