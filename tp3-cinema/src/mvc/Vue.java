package mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class Vue {

	private JFrame frame;
	private JTextField txtMenue;
	private JTextField txtNom;
	private JPanel menu = new JPanel();
	private JButton btnMenue = new JButton("menue2");
	private JLabel lblCeDimanche = new JLabel("Ce dimanche");
	private JPanel panel_cinema = new JPanel();
	private JLabel lblDimancheProchain = new JLabel("Dimanche prochain");
	private JRadioButton rdbtne_1dimanche = new JRadioButton("");
	private JRadioButton radioButton_2dimanche = new JRadioButton("");
	private JLabel lblNobreDePlace = new JLabel("Nombre de place");
	private final JLabel lblTotal = new JLabel("Total");
	private final JLabel lblDisponible = new JLabel("Disponible");
	private final JLabel lblOccuper = new JLabel("Occuper");
	private final JLabel lblTotalPlace = new JLabel("50");
	private final JLabel lblDisponiblePlace = new JLabel("50");
	private final JLabel lblOccuperPlace = new JLabel("0");

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vue window = new Vue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the application.
	 
	public Vue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//private void initialize() {
	Vue(){
		frame = new JFrame();
		frame.setBounds(100, 100, 834, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		frame.getContentPane().add(menu, "name_530398796008400");
		menu.setLayout(null);
		
		txtMenue = new JTextField();
		txtMenue.setText("menu");
		txtMenue.setBounds(425, 230, 116, 22);
		menu.add(txtMenue);
		txtMenue.setColumns(10);
		
		
		btnMenue.setBounds(510, 384, 97, 25);
		menu.add(btnMenue);
		
		
		
		frame.getContentPane().add(panel_cinema, "name_530647735891700");
		panel_cinema.setLayout(null);
		
		txtNom = new JTextField();
		txtNom.setToolTipText("Votre nom");
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setText("Nom");
		txtNom.setBounds(297, 228, 170, 40);
		panel_cinema.add(txtNom);
		txtNom.setColumns(10);
		
		
		lblCeDimanche.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCeDimanche.setBounds(12, 13, 202, 34);
		panel_cinema.add(lblCeDimanche);
		
		
		lblDimancheProchain.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDimancheProchain.setBounds(12, 60, 202, 34);
		panel_cinema.add(lblDimancheProchain);
		rdbtne_1dimanche.setToolTipText("Activer ce dimanche");
		
		
		rdbtne_1dimanche.setBounds(180, 20, 33, 25);
		panel_cinema.add(rdbtne_1dimanche);
		radioButton_2dimanche.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radioButton_2dimanche.setToolTipText("Activer dimanche prochain");
		
		
		radioButton_2dimanche.setBounds(180, 67, 33, 25);
		panel_cinema.add(radioButton_2dimanche);
		
		JPanel panel_info = new JPanel();
		panel_info.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_info.setBackground(Color.GRAY);
		panel_info.setBounds(12, 299, 278, 174);
		panel_cinema.add(panel_info);
		panel_info.setLayout(null);
		lblNobreDePlace.setBounds(23, 0, 222, 40);
		panel_info.add(lblNobreDePlace);
		lblNobreDePlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblNobreDePlace.setBackground(Color.WHITE);
		lblNobreDePlace.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		lblNobreDePlace.setForeground(Color.BLACK);
		lblOccuperPlace.setForeground(Color.BLACK);
		lblOccuperPlace.setBackground(Color.WHITE);
		lblOccuperPlace.setBounds(209, 122, 56, 48);
		panel_info.add(lblOccuperPlace);
		lblOccuperPlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblOccuperPlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblOccuper.setForeground(Color.BLACK);
		lblOccuper.setBounds(199, 84, 74, 25);
		panel_info.add(lblOccuper);
		lblOccuper.setHorizontalAlignment(SwingConstants.CENTER);
		lblOccuper.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDisponible.setForeground(Color.BLACK);
		lblDisponible.setBounds(92, 84, 82, 25);
		panel_info.add(lblDisponible);
		lblDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponible.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDisponiblePlace.setForeground(Color.BLACK);
		lblDisponiblePlace.setBackground(Color.WHITE);
		lblDisponiblePlace.setBounds(102, 122, 56, 48);
		panel_info.add(lblDisponiblePlace);
		lblDisponiblePlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponiblePlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotalPlace.setForeground(Color.BLACK);
		lblTotalPlace.setBackground(Color.WHITE);
		lblTotalPlace.setBounds(6, 122, 56, 48);
		panel_info.add(lblTotalPlace);
		lblTotalPlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setBounds(6, 84, 74, 25);
		panel_info.add(lblTotal);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
	}
	
	 void addCalculateListener(ActionListener listenForCalcButton){
		 
		 btnMenue.addActionListener(listenForCalcButton);
          
	 }

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtMenue() {
		return txtMenue;
	}

	public void setTxtMenue(JTextField txtMenue) {
		this.txtMenue = txtMenue;
	}

	public JTextField getTxtCinema() {
		return txtNom;
	}

	public void setTxtCinema(JTextField txtCinema) {
		this.txtNom = txtCinema;
	}

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
	}

	public JButton getBtnMenue() {
		return btnMenue;
	}

	public void setBtnMenue(JButton btnMenue) {
		this.btnMenue = btnMenue;
	}

	public JLabel getLblCeDimanche() {
		return lblCeDimanche;
	}

	public void setLblCeDimanche(JLabel lblCeDimanche) {
		this.lblCeDimanche = lblCeDimanche;
	}

	public JPanel getPanel_cinema() {
		return panel_cinema;
	}

	public void setPanel_cinema(JPanel panel_cinema) {
		this.panel_cinema = panel_cinema;
	}

	public JLabel getLblDimancheProchain() {
		return lblDimancheProchain;
	}

	public void setLblDimancheProchain(JLabel lblDimancheProchain) {
		this.lblDimancheProchain = lblDimancheProchain;
	}

	public JLabel getLblNobreDePlace() {
		return lblNobreDePlace;
	}

	public void setLblNobreDePlace(JLabel lblNobreDePlace) {
		this.lblNobreDePlace = lblNobreDePlace;
	}

	public JRadioButton getRdbtne_1dimanche() {
		return rdbtne_1dimanche;
	}

	public JRadioButton getRadioButton_2dimanche() {
		return radioButton_2dimanche;
	}
}
