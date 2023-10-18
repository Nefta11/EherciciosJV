import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class mayor {
	public static void main(String[] args) {
		int nume, nume2, nume3;

		nume = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
		nume2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
		nume3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));

		if (nume > nume2) {
			if (nume > nume3) {
				JOptionPane.showMessageDialog(null, "El NUMERO MAYOR ES: " + nume);
			}
		} else if (nume2 > nume) {
			if (nume2 > nume3) {
				JOptionPane.showMessageDialog(null, "El NUMERO MAYOR ES: " + nume2);
			}
		}
		if (nume3 > nume) {
			JOptionPane.showMessageDialog(null, "El NUMERO MAYOR ES: " + nume3);

		}
		if (nume3 > nume2) {
			JOptionPane.showMessageDialog(null, "El NUMERO MAYOR ES: " + nume3);
		}

	}
}