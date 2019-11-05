package mvc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//calcule
public class Model {
	
	
	public void active_menu_cinema(JPanel activer, JPanel desactiver) {
		activer.setVisible(true);
		desactiver.setVisible(false);	
	}
	
	public void liste_clien(String[] la_liste, String le_nom, int prix) {
		
		
	}
	
	public String[] charger_liste_clien(int la_semain) {
		String[] listeClien= {"0"};
		String paterne ="[^ ]*";
		int i=0;
		try {
			File fichier = new File("client"+la_semain+".txt");
			Scanner cherc = new Scanner(fichier);
			while (cherc.hasNextLine()) {
				
				String valq = cherc.next(paterne);
				listeClien[i] = valq.toString();
				System.out.println("ffff");
				i++;
			}
			cherc.close();
			
		}catch (Exception e) {
			
		}
		
		System.out.println(listeClien[0]);
		
		return listeClien;
	}
	
	public void incsrire_client(JTextField jTextField, Integer nobre_de_place  , Boolean popcorn_inc, Boolean dbox_inc, Boolean d3_inc) {
		Double prix_total = 7.00;
		nobre_de_place += 1;
		
		if (popcorn_inc) {
			prix_total += 1.80;
		}
		
		if (dbox_inc) {
			prix_total += 5.00;
		}
		
		if (d3_inc) {
			prix_total += 4.00;
		}
		
		
	
		prix_total = prix_total *nobre_de_place;
		
		System.out.println("allo model   "+prix_total.toString());
	}
	
	
	public void test(Boolean test) {
		System.out.println(test);
		
	}
	
	

}
