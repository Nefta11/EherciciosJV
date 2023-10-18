import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class multiplo {
	public static void main(String[] args) {
		String cadena = " ";
		int nume, sum = 0;

		nume = Integer.parseInt(JOptionPane
				.showInputDialog("PROGRAMA QUE MUESTRA Y SUMA LOS NUMEROS MULTIPLOS DE 3 QUE INGRESE EL USUASIO"
						+ "\n\n*** INTRODUCE LA CANTIDAD DE NUMEROS QUE QUIERES QUE SE TE MUESTREN :***"));

		for (int i = 1; i <= nume; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
				cadena = cadena + i + "\n";
			}
		}

		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, "LA SUMA DE TUS NUMEROS MULTIPLOS DE 3 ES: " + sum);
	}

}