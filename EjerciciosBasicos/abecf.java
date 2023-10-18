import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class abecf {
    public static void main(String[] args) {
        char i = 'A', j = 'a';
        String cadena = " ", cadena1 = " ";

        for (i = 'A'; i <= 'Z'; i++) {

            cadena = cadena + "La letra:  " + i + "  es:  " + (int) i + "  en decimal" + "\n";

        }
        JOptionPane.showMessageDialog(null, cadena);

        for (j = 'a'; j <= 'z'; j++) {

            cadena1 = cadena1 + "La letra:  " + j + "  es:  " + (int) j + "  en decimal" + "\n";

        }
        JOptionPane.showMessageDialog(null, cadena1);

    }
}