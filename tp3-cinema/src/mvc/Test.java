package mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class Test {
	public static void main(String[] args) {

		Vue la_vue = new Vue();
		Vue2 la_vue2 = new Vue2();
		Model le_model = new Model();
		Model2 le_model2 = new Model2();
		
		
		la_vue.getFrame().setVisible(true);
		la_vue2.getFrame().setVisible(false);
		
		
		
		Controleur le_controleur = new Controleur(le_model,le_model2, la_vue, la_vue2);
		//JFrame fram2 = la_vue2.getFrame();
		
		
		
		
		
		
		
	}
}


