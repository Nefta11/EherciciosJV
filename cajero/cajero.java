import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERAGARA

public class cajero {
	public static void main(String[] args) {
		int opcion;
		double saldo = 54000, ingre, saldon, reti;

		opcion = Integer.parseInt(JOptionPane.showInputDialog(
				"****CAJERO AUTOMATICO****" + "\nELIGA UNA DE LAS SIGUIENTES OPCIONES: " + "\n(1)Ingresar Saldo "
						+ "\n(2)Retirar Saldo" + "\n(3)Consultar saldo" + "\n(4)Cancelar operacion"));

		switch (opcion) {
			case 1:
				ingre = Double
						.parseDouble(JOptionPane.showInputDialog("INTRODUZCA LA CANTIDAD QUE INGRESARA A SU CUENTA"));
				saldon = saldo + ingre;
				JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES DE : " + "$" + saldon);
				break;

			case 2:
				reti = Double.parseDouble(JOptionPane.showInputDialog("INTRODUZCA LA CANTIDAD QUE QUIERE RETIRAR:"));
				if (reti > saldo) {
					JOptionPane.showMessageDialog(null, "***SALDO INSUFICIENTE***");

				} else {
					saldon = saldo - reti;
					JOptionPane.showMessageDialog(null,
							"RETIRO: " + "$" + reti + "\nSU SALDO ACTUAL ES DE : " + "$" + saldon);
				}
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES DE: " + "$" + saldo);
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "OPERACION CANCELADA");
				break;

			default:
				JOptionPane.showMessageDialog(null, "****LA OPERACION SALIO MAL : ( **** ");
				break;
		}
	}
}
