import javax.swing.*;

public class ejemnumero {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(
				"*****ESTE PROGRAMA DETERMINA SI UN NUMERO ES PAR O IMPAR*****" + "\nINTRODUZCA UN NUMERO: "));

		if (numero == 0) {
			JOptionPane.showMessageDialog(null, "El numero es cero  " + numero);
		} else if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "------El numero es par-----  " + numero);
		} else {
			JOptionPane.showMessageDialog(null, "°°°°°El numero es impar°°°°°  " + numero);
		}

	}
}