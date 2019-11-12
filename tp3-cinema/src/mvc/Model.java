package mvc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//calcule
public class Model {
	private String fichier_de_semain = "1.txt";
	private String client = "client";
	private String liste_clien = client+fichier_de_semain;
	
	
	String[] listeClien= new String[50];
	
	public void active_menu_cinema(JPanel activer, JPanel desactiver) {
		activer.setVisible(true);
		desactiver.setVisible(false);	
	}
	
	public void liste_clien(String[] la_liste, String le_nom, int prix) {
		
		
	}
	
	public Integer charger_liste_clien() {
		
		String paterne ="[^ ]*";
		Integer nb_persone=0;
		char ligne;
		int i=0;
		try {
			File fichier = new File(liste_clien);
			Scanner cherc = new Scanner(fichier);
			while (cherc.hasNextLine()) {
				
				String valq = cherc.next(paterne);
				listeClien[i] = valq.toString();
				System.out.println(listeClien[i]);
				ligne = listeClien[i].charAt(listeClien[i].length()-1);
				nb_persone = nb_persone + Character.getNumericValue(ligne);
				
				i++;
			}
			cherc.close();
			
		}catch (Exception e) {
			
		}
		
		System.out.println(nb_persone);
		
		return nb_persone;
	}
	
	public void incsrire_client(String nom, Integer nobre_de_place  , Boolean popcorn_inc, Boolean dbox_inc, Boolean d3_inc) {
		String texte;
		Double prix_total = 7.00;
		nobre_de_place += 1;
		String nom_char="";
		
		
		for (Integer i = 0  ; i < nom.length(); i++) {
			if (nom.charAt(i) == '/') {
				
			} else {
				nom_char =nom_char + nom.charAt(i);
			}
			
		}
		
		
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
		
		
		texte = nom_char +"/" + prix_total + "/" + nobre_de_place  ;
		System.out.println(texte);
		enregistrer(texte);
		
	}
	
	
	public String preCalcul( Integer nobre_de_place  , Boolean popcorn_inc, Boolean dbox_inc, Boolean d3_inc, JRadioButton semain) {
		String texte;
		Double prix_total = 7.00;
		
		if (semain.isSelected()) {
			prix_total= prix_total-1.00;
		}
		
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
		texte= prix_total.toString()+"$";
		return texte;
		
		
	}
	
	
	
	
	
	public void enregistrer(String enregistrement) {
		String ficier_nom = getListe_clien();
		
		try {
			BufferedWriter fi_ecrir = new BufferedWriter(new FileWriter(ficier_nom, true)); 
			fi_ecrir.write(enregistrement+"\n");
			fi_ecrir.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void choixDuDimanche(Integer bonton_clik,JRadioButton ce_dimanche, JRadioButton dimanche_prochain) {
		String non_fichier;
		if (bonton_clik ==1) {
			
			dimanche_prochain.setSelected(false);
			ce_dimanche.setSelected(true);
			non_fichier = "1.txt";
			setFichier_de_semain(non_fichier);
		}
		if (bonton_clik == 2) {
			System.out.println("choi dimanche2");
			dimanche_prochain.setSelected(true);
			ce_dimanche.setSelected(false);
			non_fichier = "2.txt";
			setFichier_de_semain(non_fichier);
		}
		
		
	}
	
	Integer place_disponible, place_ocuper;
	
	public void placerEnVueLesPlace(Integer no_persone, JLabel lblplace_disponible, JLabel lblplace_ocuper) {
		place_disponible = Integer.valueOf(lblplace_disponible.getText())-no_persone;
		place_ocuper = no_persone;
		
		
	}

	public Integer getPlace_disponible() {
		return place_disponible;
	}

	public Integer getPlace_ocuper() {
		return place_ocuper;
	}

	public String getFichier_de_semain() {
		return fichier_de_semain;
	}

	public void setFichier_de_semain(String fichier_de_semain) {
		this.fichier_de_semain = fichier_de_semain;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getListe_clien() {
		return liste_clien;
	}

	public void setListe_clien(String liste_clien) {
		this.liste_clien = liste_clien;
	}
	
	
	
	
}
