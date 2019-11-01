package mvc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JPanel;

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
	

}
