import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrojframe2 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldusuario;
	private JTextField fieldsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrojframe2 frame = new Cadastrojframe2();
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
	public Cadastrojframe2() {
		setTitle("Usuario e senha");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Noturno\\Desktop\\flat,550x550,075,f.u4.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usuario.setBounds(26, 11, 66, 14);
		contentPane.add(usuario);
		
		JLabel senha = new JLabel("Senha");
		senha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		senha.setBounds(26, 75, 55, 14);
		contentPane.add(senha);
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fieldusuario.getText().length() == 0 || fieldsenha.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "campo vazio");
					}
				else {
					JOptionPane.showMessageDialog(null, "usuario e senha nao conferem");
				}
			}
		});
		ok.setBounds(94, 170, 89, 23);
		contentPane.add(ok);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cancelar.setBounds(237, 170, 89, 23);
		contentPane.add(cancelar);
			
		
		fieldusuario = new JTextField();
		fieldusuario.setBounds(102, 11, 322, 20);
		contentPane.add(fieldusuario);
		fieldusuario.setColumns(10);
		
		fieldsenha = new JPasswordField();
		fieldsenha.setBounds(102, 75, 322, 20);
		contentPane.add(fieldsenha);
		fieldsenha.setColumns(10);
		
	}

}
