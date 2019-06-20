import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class janelinha extends JFrame{
	
	JButton cancelar = new JButton("cancelar");
	JButton ok = new JButton("OK");
	JTextField login = new JTextField();
	JPasswordField senha = new JPasswordField();
	JLabel texto_login = new JLabel("login:");
	JLabel texto_senha = new JLabel("senha:");
	Color minha = new Color(255,25,25);
			
			public janelinha() {
				super("janelinha");
				Container window = getContentPane();
				window.setLayout(new GridLayout(3,2));	 			
				window.add(texto_login);	
				window.add(login);
				window.add(texto_senha);	
				window.add(senha);
				window.add(ok);
				window.add(cancelar);	
				window.setBackground(minha);
				window.setForeground(minha);
				setSize(300,100);								
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
			}
		public static void main(String[] args) {
		new janelinha();	
	}
}
