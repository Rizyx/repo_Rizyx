
import javax.swing.JOptionPane;

public class Caixadedialogo {
	public static void main(String[] args) {
		String nome = null;
		int resposta;
		nome = JOptionPane.showInputDialog("qual o seu nome? :");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + " ? ", "pergunta...",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Seu nome é :" + nome);
		} else if (resposta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "o seu nome nao é " + nome);
		}
	}

}
