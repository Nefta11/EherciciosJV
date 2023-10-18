import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class numimp {
	public static void main(String[] args) {
		String cadena = " ";
		int num, sum = 0, acum = -1;

		num = Integer.parseInt(JOptionPane
				.showInputDialog("*** INTRODUCE LA CANTIDAD DE NUMEROS IMPARES QUE QUIERES QUE SE TE MUESTREN :***"));

		for (int i = 1; i <= num; i++) {
			acum = acum + 2;
			cadena = cadena + acum + "\n";
			sum = sum + acum;

		}

		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, "LA SUMA DE TUS NUMEROS IMPARES ES: " + sum);
	}

}