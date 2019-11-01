package mvc;

import java.awt.EventQueue;


public class Test {
	public static void main(String[] args) {

		Vue la_vue = new Vue();
		Model le_model = new Model();
		Controleur le_controleur = new Controleur(le_model, la_vue);
		la_vue.getFrame().setVisible(true);
		
	}
}


