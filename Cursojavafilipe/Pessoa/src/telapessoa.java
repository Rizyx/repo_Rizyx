import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class telapessoa extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup fisoujur = new ButtonGroup();
	private JTextField nome;
	private JTextField txtCpf;
	private JTextField txtcnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telapessoa frame = new telapessoa();
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
	public telapessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(227, 11, 197, 198);
		contentPane.add(textPane);
		
		JRadioButton btnjur = new JRadioButton("Juridica");
		fisoujur.add(btnjur);
		btnjur.setBounds(6, 49, 109, 23);
		contentPane.add(btnjur);
		
		JRadioButton btnfis = new JRadioButton("Fisica");
		fisoujur.add(btnfis);
		btnfis.setBounds(6, 86, 109, 23);
		contentPane.add(btnfis);
		
		JButton buttonadd = new JButton("Cadastrar");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnjur.isSelected()){
					textPane.setText(txtcnpj.getText() + nome.getText());
				}
				else if (btnfis.isSelected()){
					textPane.setText(txtCpf.getText() + nome.getText());
				}
			}
		});
		buttonadd.setBounds(10, 11, 89, 23);
		contentPane.add(buttonadd);
		
		nome = new JTextField();
		nome.setBounds(6, 130, 96, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(6, 161, 96, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtcnpj = new JTextField();
		txtcnpj.setBounds(6, 192, 96, 20);
		contentPane.add(txtcnpj);
		txtcnpj.setColumns(10);
				
	}
}		
		


