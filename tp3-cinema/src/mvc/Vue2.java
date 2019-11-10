package mvc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JList;

public class Vue2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vue2 frame = new Vue2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vue2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Retirer");
		btnNewButton.setBounds(172, 339, 89, 34);
		contentPane.add(btnNewButton);
		
		JButton btnQuit = new JButton("Quiter");
		btnQuit.setBounds(10, 339, 112, 34);
		contentPane.add(btnQuit);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Dimanche prochain");
		tglbtnNewToggleButton.setBounds(52, 294, 173, 34);
		contentPane.add(tglbtnNewToggleButton);
		
		JList list = new JList();
		list.setBounds(10, 11, 251, 258);
		contentPane.add(list);
	}
}
