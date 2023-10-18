import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class numd {
	public static void main(String[] args) {
		String cadena = " ";

		for (int i = 100; i >= 0; i = i - 10) {

			cadena = cadena + i + "\n";
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
}