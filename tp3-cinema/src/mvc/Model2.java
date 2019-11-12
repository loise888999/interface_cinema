package mvc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;



public class Model2 {
	
	private JFrame frame;
	private String fichier_de_semain = "1.txt";
	private String client = "client";
	private String liste_clien = client+fichier_de_semain;
	private String[] liste_de_client = new String[50];
	private JList liste_aficher;
	private JToggleButton boutonDimanche;
	
	public void active_menu_liste(JFrame frame) {
		frame.setVisible(true);
		
		
		
	}
	
	public void retour_menuDeDeuximeFrame(JFrame frame) {
		frame.setVisible(false);
	}

	public JFrame getFrame() {
		return frame;
	}

	
	public void faire_liste(JToggleButton boutonDimanche, JList liste_aficher) {
		String paterne ="[^ ]*";
		
		
		int i=0;
		

		if (boutonDimanche.isSelected()) {
			fichier_de_semain = "2.txt";
		} else {
			fichier_de_semain = "1.txt";
		}
		liste_clien = client+fichier_de_semain;
		
		try {
			File fichier = new File(liste_clien);
			Scanner cherc = new Scanner(fichier);
		
			while (cherc.hasNextLine()) {
				
				String valq = cherc.next(paterne);
				liste_de_client[i] = valq.toString();
				
				i++;
			}
			cherc.close();
			
		}catch (Exception e) {
			
		}
		
		liste_aficher.setListData(liste_de_client);
	
	}

	
	
	public void modifier_liste(JList liste_aficher) {
		String[] nouvel_liste_de_client = new String[50];
		
		Integer selectioner=liste_aficher.getSelectedIndex();
	
		
		int pas_prit=0;
		for (int i = 0; i < liste_de_client.length-1; i++) {
			if (i == selectioner) {
				pas_prit=1;
			}
			
			if (i <= 49) {
				
				nouvel_liste_de_client[i] = liste_de_client[i+pas_prit];
			} else {
				nouvel_liste_de_client[i] = null;
			}
			
			
		}
		
		liste_aficher.setListData(nouvel_liste_de_client);
		liste_de_client=nouvel_liste_de_client;
		ecrire_liste_de_client();
	}
	
	
	public void ecrire_liste_de_client() {
		
	
			
		try {
			FileWriter fileWriter = new FileWriter(liste_clien);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
			for (int i = 0; (i < liste_de_client.length) && (liste_de_client[i] != null); i++) {
				printWriter.print(liste_de_client[i]+"\n");
			}
			
			
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		}
				
	}

	
	public JList getListe_aficher() {
		return liste_aficher;
	}
	
	
}
