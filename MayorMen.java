import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class MayorMen {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Los números son iguales.");
        }
    }
}
