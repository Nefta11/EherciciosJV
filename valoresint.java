import javax.swing.*;//NEFTALI ARTUTO HERNANDEZ VERGARA

public class valoresint {
    public static void main(String[] args) {
        String cadena = " ", cadena2 = " ";
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            cadena = cadena + numeros[i] + "\n";
        }
        for (int i = 3; i >= 0; i--) {
            cadena2 = cadena2 + numeros[i] + "\n";
        }

        // Imprime los números en orden
        JOptionPane.showMessageDialog(null, """
                N\u00fameros ingresados en orden:
                """ + cadena);

        // Imprime los números en orden inverso
        JOptionPane.showMessageDialog(null, """
                N\u00fameros ingresados en orden inverso:
                """ + cadena2);

    }
}