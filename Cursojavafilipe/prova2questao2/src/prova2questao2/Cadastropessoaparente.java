package prova2questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Cadastropessoaparente extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtsobrenome;
	private JTextField txtidade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtcpf;
	private JTextField txtgrauparente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastropessoaparente frame = new Cadastropessoaparente();
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
	public Cadastropessoaparente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome");
		nome.setBounds(10, 11, 48, 14);
		contentPane.add(nome);
		
		JLabel sobrenome = new JLabel("Sobrenome");
		sobrenome.setBounds(10, 41, 94, 14);
		contentPane.add(sobrenome);
		
		JLabel idade = new JLabel("Idade");
		idade.setBounds(10, 71, 48, 14);
		contentPane.add(idade);
		
		JLabel sexo = new JLabel("Sexo");
		sexo.setBounds(10, 101, 48, 14);
		contentPane.add(sexo);
		
		JLabel cpf = new JLabel("Cpf");
		cpf.setBounds(10, 131, 48, 14);
		contentPane.add(cpf);
		
		JLabel grauparente = new JLabel("Grau de parentesco");
		grauparente.setBounds(10, 161, 116, 14);
		contentPane.add(grauparente);
		
		txtnome = new JTextField();
		txtnome.setBounds(136, 8, 276, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtsobrenome = new JTextField();
		txtsobrenome.setBounds(136, 38, 276, 20);
		contentPane.add(txtsobrenome);
		txtsobrenome.setColumns(10);
		
		txtidade = new JTextField();
		txtidade.setBounds(136, 68, 48, 20);
		contentPane.add(txtidade);
		txtidade.setColumns(10);
		
		JRadioButton male = new JRadioButton("M");
		buttonGroup.add(male);
		male.setBounds(136, 97, 109, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("F");
		buttonGroup.add(female);
		female.setBounds(303, 97, 109, 23);
		contentPane.add(female);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(136, 128, 276, 20);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		txtgrauparente = new JTextField();
		txtgrauparente.setBounds(136, 158, 276, 20);
		contentPane.add(txtgrauparente);
		txtgrauparente.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(136, 189, 276, 62);
		contentPane.add(textPane);
		
		JButton criar = new JButton("Cadastrar");
		criar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (male.isSelected()) {
					String troca = txtidade.getText();
					int idade = Integer.parseInt(troca);
					parente alguem = new parente(txtnome.getText(), txtsobrenome.getText(), idade , 'M', txtcpf.getText() , txtgrauparente.getText());
					textPane.setText(alguem.nome +" "+ alguem.sobrenome+" " + idade + " " + alguem.sexo + " " + alguem.cpf + " " + alguem.grauparentesco  );
				}	
				else if (female.isSelected()) {
					String troca = txtidade.getText();
					int idade = Integer.parseInt(troca);
					parente alguem = new parente(txtnome.getText(), txtsobrenome.getText(), idade , 'M', txtcpf.getText() , txtgrauparente.getText());
					textPane.setText(alguem.nome +" "+ alguem.sobrenome+" " + idade + " " + alguem.sexo + " " + alguem.cpf + " " + alguem.grauparentesco  );
				}
				
			}
		});
		criar.setBounds(10, 206, 116, 23);
		contentPane.add(criar);
		
		
	}
}
