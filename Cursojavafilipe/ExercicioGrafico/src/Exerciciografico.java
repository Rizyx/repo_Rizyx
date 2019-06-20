import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.sound.midi.ShortMessage;
import javax.swing.ButtonGroup;

public class Exerciciografico extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private final ButtonGroup Direcoes = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exerciciografico frame = new Exerciciografico();
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
	public Exerciciografico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Noturno\\Desktop\\flat,550x550,075,f.u4.jpg"));
		setTitle("Grafico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension max = new Dimension(500,500);
		Dimension min = new Dimension(100,100);
		setMinimumSize(min);
		setMaximumSize(max);
				
		JTextArea areatext = new JTextArea();
		areatext.setBackground(new Color(0, 128, 128));
		areatext.setBounds(10, 11, 187, 240);
		contentPane.add(areatext);
		
		JButton botao1 = new JButton("1");
		botao1.setBounds(335, 20, 89, 23);
		contentPane.add(botao1);
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (areatext.getText().equals("")) {
					areatext.setText(texto1.getText());
				}
				else {
				areatext.setText(areatext.getText() + texto1.getText() + " " + System.lineSeparator());
				texto1.setText(null);
				texto1.grabFocus();
				}
			}

		});

		
		JButton botao2 = new JButton("2");
		botao2.setBounds(335, 54, 89, 23);
		contentPane.add(botao2);
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areatext.setText(areatext.getText() + texto1.getText() + " " + texto2.getText() + System.lineSeparator());
				texto2.setText(null);
				texto1.setText(null);
				texto2.grabFocus();
			}

		});
		
		JButton botao3 = new JButton("3");
		botao3.setBounds(335, 88, 89, 23);
		contentPane.add(botao3);
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areatext.setText(areatext.getText() + texto1.getText() + " " + texto2.getText() + " " + texto3.getText() + " " + System.lineSeparator());
				texto2.setText(null);
				texto1.setText(null);
				texto3.setText(null);
				texto3.grabFocus();
			}

		});
		texto1 = new JTextField();
		texto1.setBounds(206, 21, 96, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(207, 52, 96, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		texto3 = new JTextField();
		texto3.setBounds(206, 83, 96, 20);
		contentPane.add(texto3);
		texto3.setColumns(10);
		
		JRadioButton btnnorte = new JRadioButton("Norte");
		btnnorte.setBackground(new Color(105, 105, 105));
		Direcoes.add(btnnorte);
		btnnorte.setBounds(203, 179, 89, 23);
		contentPane.add(btnnorte);
		
		JRadioButton btnsul = new JRadioButton("Sul");
		btnsul.setBackground(new Color(105, 105, 105));
		Direcoes.add(btnsul);
		btnsul.setBounds(319, 179, 89, 23);
		contentPane.add(btnsul);
		
		JRadioButton btnleste = new JRadioButton("Leste");
		btnleste.setBackground(new Color(105, 105, 105));
		Direcoes.add(btnleste);
		btnleste.setBounds(203, 216, 89, 23);
		contentPane.add(btnleste);
		
		JRadioButton btnoeste = new JRadioButton("Oeste");
		btnoeste.setBackground(new Color(105, 105, 105));
		Direcoes.add(btnoeste);
		btnoeste.setBounds(319, 216, 89, 23);
		contentPane.add(btnoeste);
		
		JButton buttondir = new JButton("Qual direção?");
		buttondir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnoeste.isSelected()){
					JOptionPane.showMessageDialog(null, "Oeste");
				}
				else if (btnleste.isSelected()) {
					JOptionPane.showMessageDialog(null, "Leste");
				}
				else if (btnsul.isSelected()) {
					JOptionPane.showMessageDialog(null, "Sul");
				}
				else if (btnnorte.isSelected()) {
					JOptionPane.showMessageDialog(null, "Norte");
				}
			}
		});
		buttondir.setBounds(227, 132, 125, 23);
		contentPane.add(buttondir);
		
	}
}
