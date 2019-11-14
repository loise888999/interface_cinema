package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controleur {
	
	private Model le_model;
	private Model2 le_model2;
	private Vue la_vue;
	private Vue2 la_vue2;
	
	private JFrame frame;
	private JList liste_aficher;
	
	
	public Controleur(Model le_model,Model2 le_model2 , Vue la_vue, Vue2 la_vue2) {
		this.le_model = le_model;
		this.le_model2 = le_model2;
		this.la_vue = la_vue;
		this.la_vue2 = la_vue2;
		
		
		this.la_vue.addCalculateListener(new CalculateListener());
		this.la_vue.addConfirmerReservation(new ConfirmerReservation());
		this.la_vue.addPreCalcul(new PreCalcul());
		this.la_vue.addChoixDimanche(new ChoixDimanche(1));
		this.la_vue.addChoixDimancheProc(new ChoixDimanche(2));
		this.la_vue.addRetourAuMenu(new RetourAuMenu());
		this.la_vue.addAllerVue2(new AllerVue2());
		this.la_vue2.addModifierListe(new ModifierListe());
		this.la_vue2.addRetourMenuDeDeuximeFrame(new RetourMenuDeDeuximeFrame());
		this.la_vue2.addRetirerDesClientList(new RetirerDesClientList());
	}
	
	
	
	
	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			le_model.active_menu_cinema(la_vue.getPanel_cinema(),la_vue.getMenu());
			
			le_model.charger_liste_clien();
			
			la_vue.setLblOccuperPlace(le_model.getPlace_ocuper().toString());
			la_vue.setLblDisponiblePlace(String.valueOf(le_model.getPlace_disponible()));
			
		}
	}
	class ConfirmerReservation implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Integer nb_place = la_vue.getcBoxNbReservatin().getSelectedIndex();
			Integer nb_dispo = Integer.valueOf(la_vue.getLblDisponiblePlace().getText()) ;
			
			
			Boolean popcorn = la_vue.getRdbtPopc().isSelected();
			String nom_client = la_vue.getTxtNom().getText();
			Boolean d_box = la_vue.getRdbtDbox().isSelected();
			Boolean film_3d = la_vue.getRdbt3D().isSelected(); 
			JRadioButton semain = la_vue.getRadioButton_2dimanche();
			
			if(nb_dispo-nb_place > 0 ) {
				le_model.incsrire_client(nom_client, nb_place, 
						popcorn, d_box, film_3d,semain);
			
				le_model.charger_liste_clien();
				
				
				
				JLabel lblplace_ocuper = la_vue.getLblOccuperPlace();
				JLabel lblplace_disponible = la_vue.getLblDisponiblePlace();
				JLabel lbltext_erreur = la_vue.getLabelRetourError();
				
				le_model.placerEnVueLesPlace( lblplace_disponible, lblplace_ocuper );
				
				la_vue.setLblOccuperPlace(le_model.getPlace_ocuper().toString());
				la_vue.setLblDisponiblePlace(String.valueOf(50-le_model.getPlace_ocuper()));
				la_vue.setLabelRetourError("");
				
			} else {

				la_vue.setLabelRetourError("place insufisante");
			}
			
			
			
			
		}
	}
	
	
	class PreCalcul implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {
			String prix_calculer;
			int nobre_de_persone = la_vue.getcBoxNbReservatin().getSelectedIndex();
			boolean popcorn = la_vue.getRdbtPopc().isSelected();
			boolean dbox = la_vue.getRdbtDbox().isSelected();
			boolean d3 = la_vue.getRdbt3D().isSelected();
			JRadioButton la_semain2 = la_vue.getRadioButton_2dimanche();
			
			prix_calculer=le_model.preCalcul(nobre_de_persone , popcorn, dbox, d3, la_semain2);
			la_vue.setLblPrixCalc(prix_calculer);
			
			
			
			
		}
	}
	
	class ChoixDimanche implements ActionListener {
		Integer val;
		public ChoixDimanche(int i) {
			val = i;
		}

		public void actionPerformed(ActionEvent e) {
			JLabel lblplace_ocuper = la_vue.getLblOccuperPlace();
			JLabel lblplace_disponible = la_vue.getLblDisponiblePlace();
			JLabel lbltext_erreur = la_vue.getLabelRetourError();
			
			le_model.choixDuDimanche(val,la_vue.getRdbtne_1dimanche(), la_vue.getRdbtnDimancheProchain());
			
			
			
			
			le_model.placerEnVueLesPlace( lblplace_disponible, lblplace_ocuper );
			
			la_vue.setLblOccuperPlace(le_model.getPlace_ocuper().toString());
			la_vue.setLblDisponiblePlace(String.valueOf(50-le_model.getPlace_ocuper()));
			la_vue.setLabelRetourError("");
			
			
			
			
		}

		
	}
	
	
	
	class RetourAuMenu implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {
			
			JPanel menu_cinema = la_vue.getPanel_cinema();
			JPanel menu =la_vue.getMenu();
			
			le_model.active_menu_cinema(menu, menu_cinema);
			
		}
		
	}
	
	
	
	class AllerVue2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			JFrame frame = la_vue2.getFrame();
			JToggleButton boutonDimanche = la_vue2.getTglbtnDimancheProchain();
			liste_aficher = la_vue2.getListPlace();
			
			le_model2.faire_liste(boutonDimanche, liste_aficher);
			le_model2.active_menu_liste(frame);
			frame = le_model2.getFrame();
			liste_aficher = le_model2.getListe_aficher();
			
			
			
			
		}
	}
	
	
	
	class ModifierListe implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			JToggleButton boutonDimanche = la_vue2.getTglbtnDimancheProchain();
			
			
		}
	}
	
	
	
	class RetourMenuDeDeuximeFrame implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			frame = la_vue2.getFrame();
			
			le_model2.retour_menuDeDeuximeFrame(frame);
			frame = le_model2.getFrame();
			
			
		}
	}
	
	
	class RetirerDesClientList implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			JToggleButton boutonDimanche = la_vue2.getTglbtnDimancheProchain();
			liste_aficher = la_vue2.getListPlace();
			le_model2.modifier_liste(liste_aficher,boutonDimanche);
			
			
			liste_aficher= le_model2.getListe_aficher();
			
		}
	}

	

}
