import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA

public class OperacionBasicas {
    public static void main(String[] args) {
        int a, b, suma, resta, multiplicacion; 
        double division; // Declaracion de variables

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero:")); 
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número entero:"));

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = (double) a / b; // Convertimos uno de los operandos a double para obtener la división decimal

        JOptionPane.showMessageDialog(null, "Resultados: \n Suma: " + suma + "\n Resta: " + resta + "\n Multiplicación: " + multiplicacion + "\n División: " + division);
    }
}
