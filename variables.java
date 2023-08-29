import javax.swing.*;

public class variables {
	public static void main(String args[]) {
		int i;
		String cadena = " ";

		for (i = 1; i < 11; i++)
			cadena = cadena + "\n" + i;
		JOptionPane.showMessageDialog(null, cadena);

	}
}