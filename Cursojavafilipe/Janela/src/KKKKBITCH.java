import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class KKKKBITCH extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KKKKBITCH frame = new KKKKBITCH();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public KKKKBITCH() {
		super("Bitch Please");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel cadastro = new JLabel("cadastro");
		cadastro.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		cadastro.setBounds(180, 11, 75, 27);
		contentPane.add(cadastro);
		
		JLabel login = new JLabel("Login");
		login.setBounds(194, 34, 33, 14);
		contentPane.add(login);
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds(194, 89, 40, 14);
		contentPane.add(senha);
		
		JButton ok = new JButton("Ok");
		ok.setBounds(94, 170, 89, 23);
		contentPane.add(ok);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(237, 170, 89, 23);
		contentPane.add(cancelar);
		
		textField = new JTextField();
		textField.setBounds(163, 47, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 103, 96, 17);
		contentPane.add(passwordField);

		
	}
}
