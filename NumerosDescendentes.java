import javax.swing.*;// NEFTALI ARTURO HERNANDEZ VERGARA

public class NumerosDescendentes {
    public static void main(String args[]) {
        int i;
        String cadena = " ";

        for (i = 20; i >= 10; i--) {
            cadena = cadena + "\n" + i;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
