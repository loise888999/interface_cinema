package mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;
import javax.swing.JList;

public class Vue2 {

	private JFrame frame;
	private JButton btnRetirer = new JButton("Retirer");
	private JButton btnRetour = new JButton("Retour");
	private JToggleButton tglbtnDimancheProchain = new JToggleButton("Dimanche prochain");
	private JList listPlace = new JList();
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vue2 window = new Vue2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the application.
	
	public Vue2() {
		initialize();
	}

	/
	 * Initialize the contents of the frame.
	 */
	Vue2(){
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnRetirer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRetirer.setBounds(207, 389, 162, 55);
		frame.getContentPane().add(btnRetirer);
		
		
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRetour.setBounds(10, 389, 162, 55);
		frame.getContentPane().add(btnRetour);
		
		
		tglbtnDimancheProchain.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tglbtnDimancheProchain.setBounds(43, 325, 290, 53);
		frame.getContentPane().add(tglbtnDimancheProchain);
		listPlace.setBounds(10, 11, 359, 289);
		
		frame.getContentPane().add(listPlace);
	}
	
	
	void addModifierListe(ActionListener ModifierListe){
			 
		
		btnRetirer.addActionListener(ModifierListe);
	          
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnRetirer() {
		return btnRetirer;
	}

	public void setBtnRetirer(JButton btnRetirer) {
		this.btnRetirer = btnRetirer;
	}

	public JButton getBtnRetour() {
		return btnRetour;
	}

	public void setBtnRetour(JButton btnRetour) {
		this.btnRetour = btnRetour;
	}

	public JToggleButton getTglbtnDimancheProchain() {
		return tglbtnDimancheProchain;
	}

	public void setTglbtnDimancheProchain(JToggleButton tglbtnDimancheProchain) {
		this.tglbtnDimancheProchain = tglbtnDimancheProchain;
	}

	public JList getListPlace() {
		return listPlace;
	}

	public void setListPlace(JList listPlace) {
		this.listPlace = listPlace;
	}
	
	

}
