import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastrojframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrojframe frame = new cadastrojframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public cadastrojframe() {
		super ("Cadastro de aluno");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Noturno\\Desktop\\flat,550x550,075,f.u4.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setForeground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5,5,5,5));		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Aluno = new JLabel("Aluno");
		Aluno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Aluno.setBounds(10, 9, 45, 14);
		contentPane.add(Aluno);
		
		textField = new JTextField();
		textField.setBounds(65, 8, 359, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Sexo = new JLabel("Sexo");
		Sexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sexo.setBounds(10, 45, 48, 14);
		contentPane.add(Sexo);
		
		JRadioButton Masculino = new JRadioButton("M");
		buttonGroup1.add(Masculino);
		Masculino.setBounds(65, 44, 38, 23);
		contentPane.add(Masculino);
		
		JRadioButton Feminino = new JRadioButton("F");
		buttonGroup1.add(Feminino);
		Feminino.setBounds(196, 44, 38, 23);
		contentPane.add(Feminino);
		
		JLabel Idade = new JLabel("Idade");
		Idade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Idade.setBounds(10, 90, 48, 14);
		contentPane.add(Idade);
		
		JLabel Email = new JLabel("E-mail");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Email.setBounds(10, 135, 48, 14);
		contentPane.add(Email);
		
		JLabel Telefone = new JLabel("Telefone");
		Telefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Telefone.setBounds(10, 180, 69, 14);
		contentPane.add(Telefone);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("Informe a idade do aluno");
		spinner.setModel(new SpinnerNumberModel(0, 0, 150, 1));
		spinner.setBounds(65, 89, 38, 20);
		contentPane.add(spinner);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 134, 359, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 179, 317, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
	}
}
