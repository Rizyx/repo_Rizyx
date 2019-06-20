import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class CadastroJframe3 extends JFrame {

	private JPanel contentPane;
	private JTextField palavra;
	private JLabel labellinha;
	private JTextField fieldtroca1;
	private JTextField fieldtroca2;
	private JButton botaotroca;
	String fieldtroca = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroJframe3 frame = new CadastroJframe3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroJframe3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				fieldtroca = fieldtroca1.getText();
				fieldtroca1.setText(fieldtroca2.getText());
				fieldtroca2.setText(fieldtroca);
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		palavra = new JTextField();
		palavra.setBounds(10, 11, 138, 20);
		contentPane.add(palavra);
		palavra.setColumns(10);

		JTextArea areaadd = new JTextArea();
		areaadd.setLineWrap(true);
		areaadd.setBackground(new Color(128, 128, 128));
		areaadd.setBounds(277, 11, 128, 215);
		contentPane.add(areaadd);

		JButton buttonadd = new JButton("Add");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaadd.setText(areaadd.getText() + palavra.getText() + " " + System.lineSeparator());
				palavra.setText(null);
				palavra.grabFocus();
				labellinha.setText((areaadd.getLineCount() - 1) + " linhas");
			}

		});
		buttonadd.setBounds(158, 10, 89, 23);
		contentPane.add(buttonadd);

		labellinha = new JLabel("0 linhas");
		labellinha.setBounds(10, 42, 48, 14);
		contentPane.add(labellinha);
		
		fieldtroca1 = new JTextField();
		fieldtroca1.setBounds(10, 111, 96, 20);
		contentPane.add(fieldtroca1);
		fieldtroca1.setColumns(10);
		
		fieldtroca2 = new JTextField();
		fieldtroca2.setBounds(151, 111, 96, 20);
		contentPane.add(fieldtroca2);
		fieldtroca2.setColumns(10);
		
		botaotroca = new JButton("Trocar");
	
	
		botaotroca.setBounds(82, 184, 89, 23);
		contentPane.add(botaotroca);
	}
}
