import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class fortab1 {
	public static void main(String[] args) {
		int mult, i, j;
		String cadena = " ";

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= 10; j++) {

				mult = i * j;
				cadena = cadena + i + "x" + j + "=" + mult + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
}