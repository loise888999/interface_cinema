package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Model2 {
	
	private String fichier_de_semain = "1.txt";
	private String client = "client";
	private String liste_clien = client+fichier_de_semain;
	private JFrame frame;
	
	public void active_menu_liste(JFrame frame) {
		frame.setVisible(true);
		
		
		
	}
	
	public void retour_menuDeDeuximeFrame() {
		frame.setVisible(false);
	}

	public JFrame getFrame() {
		return frame;
	}


}
