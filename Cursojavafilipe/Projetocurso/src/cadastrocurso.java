import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class cadastrocurso extends JFrame {

	private JPanel contentPane;
	private JTextField txtdis;
	private JTextField txtprof;
	private JTextField txthor;
	private JTextField txtdir;
	private JTextField txtqtds;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrocurso frame = new cadastrocurso();
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
	public cadastrocurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldis = new JLabel("Nome disciplina");
		lbldis.setBounds(10, 11, 94, 14);
		contentPane.add(lbldis);
		
		JLabel lblprof = new JLabel("Nome professor");
		lblprof.setBounds(10, 56, 89, 14);
		contentPane.add(lblprof);
		
		JLabel lblhor = new JLabel("Carga horaria");
		lblhor.setBounds(10, 106, 89, 14);
		contentPane.add(lblhor);
		
		txtdis = new JTextField();
		txtdis.setBounds(127, 8, 297, 20);
		contentPane.add(txtdis);
		txtdis.setColumns(10);
		
		txtprof = new JTextField();
		txtprof.setBounds(127, 53, 297, 20);
		contentPane.add(txtprof);
		txtprof.setColumns(10);
		
		txthor = new JTextField();
		txthor.setBounds(127, 103, 297, 20);
		contentPane.add(txthor);
		txthor.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(253, 131, 171, 55);
		contentPane.add(textPane);
		
		JRadioButton rdbtnnormal = new JRadioButton("Normal");
		rdbtnnormal.setSelected(true);
		buttonGroup.add(rdbtnnormal);
		rdbtnnormal.setBounds(263, 228, 109, 23);
		contentPane.add(rdbtnnormal);
		
		JRadioButton rdbtnsuperior = new JRadioButton("Superior");
		buttonGroup.add(rdbtnsuperior);
		rdbtnsuperior.setBounds(263, 193, 109, 23);
		contentPane.add(rdbtnsuperior);
		
		JButton btncriar = new JButton("Criar");
		btncriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnnormal.isSelected()) {
				Curso xCurso = new Curso(txtdis.getText(), txtprof.getText(), txthor.getText()); 
				textPane.setText(xCurso.getNome_disciplina() + " " + xCurso.getNome_professor() + " " + xCurso.getCarga_horaria());
				textPane.setText(xCurso.listar_dados());
				}
				else if (rdbtnsuperior.isSelected()){
				String qtd = txtqtds.getText();
				int qtds = Integer.parseInt(qtd);
				Cursosuperior xCurso = new Cursosuperior(txtdis.getText(), txtprof.getText(), txthor.getText(), txtdir.getText(), qtds); 
				textPane.setText(xCurso.getNome_disciplina() + " " + xCurso.getNome_professor() + " " + xCurso.getCarga_horaria() + " " + xCurso.diretoracademico + " " + xCurso.qtdsemestre);
				}
			}
		});
		btncriar.setBounds(10, 228, 89, 23);
		contentPane.add(btncriar);
		
		JButton btnsair = new JButton("Sair");
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnsair.setBounds(10, 194, 89, 23);
		contentPane.add(btnsair);
		
		txtdir = new JTextField();
		txtdir.setBounds(147, 133, 96, 20);
		contentPane.add(txtdir);
		txtdir.setColumns(10);
		
		JLabel lbldiretor = new JLabel("Nome do Diretor");
		lbldiretor.setBounds(10, 136, 89, 14);
		contentPane.add(lbldiretor);
		
		JLabel lblqtdsem = new JLabel("Quantidade de semestres");
		lblqtdsem.setBounds(10, 169, 127, 14);
		contentPane.add(lblqtdsem);
		
		txtqtds = new JTextField();
		txtqtds.setBounds(147, 165, 96, 20);
		contentPane.add(txtqtds);
		txtqtds.setColumns(10);
		
		JLabel lbltipo = new JLabel("tipo de curso");
		lbltipo.setBounds(175, 212, 82, 14);
		contentPane.add(lbltipo);
		
		JCheckBox chckbx1 = new JCheckBox("Op\u00E7\u00E3o1");
		chckbx1.setBounds(7, 259, 97, 23);
		contentPane.add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("Op\u00E7\u00E3o2");
		chckbx2.setBounds(7, 314, 97, 23);
		contentPane.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("Op\u00E7\u00E3o3");
		chckbx3.setBounds(146, 259, 97, 23);
		contentPane.add(chckbx3);
		
		JCheckBox chckbx4 = new JCheckBox("Op\u00E7\u00E3o4");
		chckbx4.setBounds(146, 314, 97, 23);
		contentPane.add(chckbx4);
		
		JButton btnlistar = new JButton("Listar sele\u00E7\u00E3o");
		btnlistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbx1.isSelected()){
					System.out.print("opção 1 selecionada ");
				}				
				if (chckbx2.isSelected()){
					System.out.print("opção 2 selecionada ");
				}
				if (chckbx3.isSelected()){
					System.out.print("opção 3 selecionada ");
				}
				if (chckbx4.isSelected()){
					System.out.print("opção 4 selecionada ");
				}
			}
				
		});
		btnlistar.setBounds(263, 287, 144, 23);
		contentPane.add(btnlistar);
		
		
	}
}
