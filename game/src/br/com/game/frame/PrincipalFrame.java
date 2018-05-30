package br.com.game.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PrincipalFrame extends JFrame {

	private PrincipalFrame frame;
	private JPanel contentPane;

	public Frame principalFrame() {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					frame = new PrincipalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return frame;
	}
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PrincipalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}


}
