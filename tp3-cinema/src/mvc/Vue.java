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
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;

public class Vue {

	private JFrame frame;
	private JTextField txtMenue;
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
	private JTextField txtNom;
	private JPanel panel_info = new JPanel();
	private JPanel panel = new JPanel();
	private JComboBox cBoxNbReservatin = new JComboBox();
	private JLabel lblPlace = new JLabel("Nobre de place que vous vouler reserver");
	private JLabel lblReserverAuNom = new JLabel("Reserver au nom de");
	private JPanel panel_1 = new JPanel();
	private JLabel lblOptionDisponible = new JLabel("Option Disponible");
	private JRadioButton rdbtnDbox = new JRadioButton("D-Box");
	private JRadioButton rdbtnPopcorneInclue = new JRadioButton("Popcorne inclue");
	private JRadioButton rdbtnd = new JRadioButton("3D");
	private JButton btnConfirmerLaReservation = new JButton("Confirmer la reservation");
	private JLabel labelRetourError = new JLabel("");
	

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
		
		
		panel_info.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_info.setBackground(Color.GRAY);
		panel_info.setBounds(12, 299, 423, 174);
		panel_cinema.add(panel_info);
		panel_info.setLayout(null);
		lblNobreDePlace.setBounds(31, 13, 369, 40);
		panel_info.add(lblNobreDePlace);
		lblNobreDePlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblNobreDePlace.setBackground(Color.WHITE);
		lblNobreDePlace.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		
		lblNobreDePlace.setForeground(Color.BLACK);
		lblOccuperPlace.setForeground(Color.BLACK);
		lblOccuperPlace.setBackground(Color.WHITE);
		lblOccuperPlace.setBounds(323, 113, 56, 48);
		panel_info.add(lblOccuperPlace);
		lblOccuperPlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblOccuperPlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblOccuper.setForeground(Color.BLACK);
		lblOccuper.setBounds(313, 84, 74, 25);
		panel_info.add(lblOccuper);
		lblOccuper.setHorizontalAlignment(SwingConstants.CENTER);
		lblOccuper.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDisponible.setForeground(Color.BLACK);
		lblDisponible.setBounds(150, 84, 82, 25);
		panel_info.add(lblDisponible);
		lblDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponible.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDisponiblePlace.setForeground(Color.BLACK);
		lblDisponiblePlace.setBackground(Color.WHITE);
		lblDisponiblePlace.setBounds(160, 113, 56, 48);
		panel_info.add(lblDisponiblePlace);
		lblDisponiblePlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponiblePlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotalPlace.setForeground(Color.BLACK);
		lblTotalPlace.setBackground(Color.WHITE);
		lblTotalPlace.setBounds(16, 113, 56, 48);
		panel_info.add(lblTotalPlace);
		lblTotalPlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPlace.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setBounds(6, 84, 74, 25);
		panel_info.add(lblTotal);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 107, 509, 174);
		panel_cinema.add(panel);
		panel.setLayout(null);
		
		
		cBoxNbReservatin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cBoxNbReservatin.setBackground(Color.WHITE);
		cBoxNbReservatin.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		cBoxNbReservatin.setBounds(412, 14, 62, 41);
		panel.add(cBoxNbReservatin);
		
		
		lblPlace.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPlace.setBounds(12, 13, 388, 41);
		panel.add(lblPlace);
		
		
		lblReserverAuNom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblReserverAuNom.setBounds(12, 99, 181, 41);
		panel.add(lblReserverAuNom);
		
		txtNom = new JTextField();
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtNom.setText("Nom");
		txtNom.setBounds(205, 99, 269, 41);
		panel.add(txtNom);
		txtNom.setColumns(10);
		
		
		panel_1.setBorder(new LineBorder(SystemColor.textInactiveText, 8, true));
		panel_1.setBackground(SystemColor.controlShadow);
		panel_1.setBounds(526, 60, 278, 413);
		panel_cinema.add(panel_1);
		panel_1.setLayout(null);
		
		
		lblOptionDisponible.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblOptionDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionDisponible.setBounds(12, 13, 254, 45);
		panel_1.add(lblOptionDisponible);
		
		
		rdbtnDbox.setBackground(Color.LIGHT_GRAY);
		rdbtnDbox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDbox.setBounds(27, 98, 222, 45);
		panel_1.add(rdbtnDbox);
		
		
		rdbtnPopcorneInclue.setBackground(Color.LIGHT_GRAY);
		rdbtnPopcorneInclue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnPopcorneInclue.setBounds(27, 173, 222, 52);
		panel_1.add(rdbtnPopcorneInclue);
		
		
		rdbtnd.setBackground(Color.LIGHT_GRAY);
		rdbtnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnd.setBounds(27, 256, 222, 52);
		panel_1.add(rdbtnd);
		
		
		btnConfirmerLaReservation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConfirmerLaReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmerLaReservation.setBounds(27, 334, 222, 52);
		panel_1.add(btnConfirmerLaReservation);
		
		JLabel lblReservation = new JLabel("Reservation");
		lblReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservation.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblReservation.setBounds(226, 4, 254, 47);
		panel_cinema.add(lblReservation);
		
		
		labelRetourError.setBounds(236, 71, 243, 25);
		panel_cinema.add(labelRetourError);
		
		
		
	}
	
	 void addCalculateListener(ActionListener listenForCalcButton){
		 
		 btnMenue.addActionListener(listenForCalcButton);
		 
          
	 }
	 
	void addConfirmerReservation(ActionListener confirmerReservation){
			 
		
		btnConfirmerLaReservation.addActionListener(confirmerReservation);
	          
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

	public JTextField getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	public JPanel getPanel_info() {
		return panel_info;
	}

	public void setPanel_info(JPanel panel_info) {
		this.panel_info = panel_info;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JComboBox getCBoxNbReservatin() {
		return cBoxNbReservatin;
	}

	public void setCBoxNbReservatin(JComboBox cBoxNbReservatin) {
		this.cBoxNbReservatin = cBoxNbReservatin;
	}

	public JLabel getLblPlace() {
		return lblPlace;
	}

	public void setLblPlace(JLabel lblPlace) {
		this.lblPlace = lblPlace;
	}

	public JLabel getLblReserverAuNom() {
		return lblReserverAuNom;
	}

	public void setLblReserverAuNom(JLabel lblReserverAuNom) {
		this.lblReserverAuNom = lblReserverAuNom;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JLabel getLblOptionDisponible() {
		return lblOptionDisponible;
	}

	public void setLblOptionDisponible(JLabel lblOptionDisponible) {
		this.lblOptionDisponible = lblOptionDisponible;
	}

	public JRadioButton getRdbtnDbox() {
		return rdbtnDbox;
	}

	public void setRdbtnDbox(JRadioButton rdbtnDbox) {
		this.rdbtnDbox = rdbtnDbox;
	}

	public JRadioButton getRdbtnPopcorneInclue() {
		return rdbtnPopcorneInclue;
	}

	public void setRdbtnPopcorneInclue(JRadioButton rdbtnPopcorneInclue) {
		this.rdbtnPopcorneInclue = rdbtnPopcorneInclue;
	}

	public JRadioButton getRdbtnd() {
		return rdbtnd;
	}

	public void setRdbtnd(JRadioButton rdbtnd) {
		this.rdbtnd = rdbtnd;
	}

	public JButton getBtnConfirmerLaReservation() {
		return btnConfirmerLaReservation;
	}

	public void setBtnConfirmerLaReservation(JButton btnConfirmerLaReservation) {
		this.btnConfirmerLaReservation = btnConfirmerLaReservation;
	}

	public JLabel getLabelRetourError() {
		return labelRetourError;
	}

	public void setLabelRetourError(JLabel labelRetourError) {
		this.labelRetourError = labelRetourError;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public JLabel getLblDisponible() {
		return lblDisponible;
	}

	public JLabel getLblOccuper() {
		return lblOccuper;
	}

	public JLabel getLblTotalPlace() {
		return lblTotalPlace;
	}

	public JLabel getLblDisponiblePlace() {
		return lblDisponiblePlace;
	}

	public JLabel getLblOccuperPlace() {
		return lblOccuperPlace;
	}

	public void setRdbtne_1dimanche(JRadioButton rdbtne_1dimanche) {
		this.rdbtne_1dimanche = rdbtne_1dimanche;
	}

	public void setRadioButton_2dimanche(JRadioButton radioButton_2dimanche) {
		this.radioButton_2dimanche = radioButton_2dimanche;
	}
	
	
	
}
