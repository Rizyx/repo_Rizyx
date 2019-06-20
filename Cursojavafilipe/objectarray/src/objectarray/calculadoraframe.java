package objectarray;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class calculadoraframe extends JFrame {

	private JPanel contentPane;
	String opera = "";
	double num1;
	double num2;
	private JTextField text1;
	private JTextField text2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraframe frame = new calculadoraframe();
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
	public calculadoraframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.PLAIN, 30));
		result.setBackground(new Color(128, 128, 128));
		result.setBounds(208, 15, 216, 37);
		contentPane.add(result);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"1");
			}
		});
		button1.setBounds(10, 70, 89, 23);
		contentPane.add(button1);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"4");
			}
		});
		button4.setBounds(10, 140, 89, 23);
		contentPane.add(button4);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"7");
			}
		});
		button7.setBounds(10, 210, 89, 23);
		contentPane.add(button7);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"2");
			}
		});
		button2.setBounds(150, 70, 89, 23);
		contentPane.add(button2);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"5");
			}
		});
		button5.setBounds(150, 140, 89, 23);
		contentPane.add(button5);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"8");
			}
		});
		button8.setBounds(109, 210, 89, 23);
		contentPane.add(button8);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"3");
			}
		});
		button3.setBounds(290, 70, 89, 23);
		contentPane.add(button3);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"6");
			}
		});
		button6.setBounds(290, 140, 89, 23);
		contentPane.add(button6);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"9");
			}
		});
		button9.setBounds(208, 210, 89, 23);
		contentPane.add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"0");
			}
		});
		button0.setBounds(307, 210, 89, 23);
		contentPane.add(button0);
		
		JButton buttonadd = new JButton("+");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"+");
				
			}
		});
		buttonadd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonadd.setBounds(10, 8, 50, 25);
		contentPane.add(buttonadd);
		
		JButton buttonsub = new JButton("-");
		buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"-");
			}
		});
		buttonsub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonsub.setBounds(10, 39, 50, 25);
		contentPane.add(buttonsub);
		
		JButton buttondiv = new JButton("/");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"/");
			}
		});
		buttondiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttondiv.setBounds(60, 39, 50, 25);
		contentPane.add(buttondiv);
		
		JButton buttonmult = new JButton("x");
		buttonmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"x");
			}
		});
		buttonmult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonmult.setBounds(60, 8, 50, 25);
		contentPane.add(buttonmult);
		
		
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(text1.getText());
				double num2 = Double.parseDouble(text2.getText());
				calculadora minhacalc = new calculadora(num1,result.getText(),num2);
				System.out.println(minhacalc.calcular());
				result.setText(Double.toString(minhacalc.calcular()));
			}
		});
		buttonequal.setBackground(new Color(192, 192, 192));
		buttonequal.setBounds(120, 15, 65, 37);
		contentPane.add(buttonequal);
		
		text1 = new JTextField();
		text1.setBounds(10, 104, 96, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(143, 104, 96, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		
	}
}
