package br.com.game;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private Principal principal;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String name = "";
	private String vocacao = "";
	private List<JRadioButton> btn = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Main");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(66, 22, 67, 14);
		contentPane.add(lblNome);

		textField = new JTextField();
		textField.setBounds(148, 19, 84, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblVocao = new JLabel("Voca\u00E7\u00E3o");
		lblVocao.setBounds(157, 66, 75, 20);
		contentPane.add(lblVocao);

		JRadioButton rdbtnMago = new JRadioButton("Mago");
		buttonGroup.add(rdbtnMago);
		rdbtnMago.setBounds(66, 118, 67, 23);
		contentPane.add(rdbtnMago);
		btn.add(rdbtnMago);

		JRadioButton rdbtnArqueiro = new JRadioButton("Arqueiro");
		buttonGroup.add(rdbtnArqueiro);
		rdbtnArqueiro.setBounds(239, 216, 102, 23);
		contentPane.add(rdbtnArqueiro);
		btn.add(rdbtnArqueiro);

		JRadioButton rdbtnSacerdote = new JRadioButton("Sacerdote");
		buttonGroup.add(rdbtnSacerdote);
		rdbtnSacerdote.setBounds(66, 165, 94, 23);
		contentPane.add(rdbtnSacerdote);
		btn.add(rdbtnSacerdote);

		JRadioButton rdbtnAnao = new JRadioButton("An\u00E3o");
		buttonGroup.add(rdbtnAnao);
		rdbtnAnao.setBounds(239, 165, 71, 23);
		contentPane.add(rdbtnAnao);
		btn.add(rdbtnAnao);

		JRadioButton rdbtnElfo = new JRadioButton("Elfo");
		buttonGroup.add(rdbtnElfo);
		rdbtnElfo.setBounds(66, 216, 63, 23);
		contentPane.add(rdbtnElfo);
		btn.add(rdbtnElfo);

		JRadioButton rdbtnGuerreiro = new JRadioButton("Guerreiro");
		buttonGroup.add(rdbtnGuerreiro);
		rdbtnGuerreiro.setBounds(239, 118, 102, 23);
		contentPane.add(rdbtnGuerreiro);
		btn.add(rdbtnGuerreiro);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(265, 18, 111, 23);
		contentPane.add(btnConfirmar);
		btnConfirmar.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				name = textField.getText();
				
				for (JRadioButton button : btn) {
					if (button.isSelected() && (name.length() > 0)) {
						vocacao = button.getText();
						principal = new Principal(name, vocacao);
						break;
					}
				}

				
			}
		});

	}

}
