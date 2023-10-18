import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class abecewhile {
    public static void main(String[] args) {
        char i = 'A', j = 'a';
        String cadena = " ", cadena1 = " ";

        while (i <= 'Z') {

            cadena = cadena + "La letra:  " + i + "  es:  " + (int) i + "  en decimal" + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, cadena);

        while (j <= 'z') {

            cadena1 = cadena1 + "La letra:  " + j + "  es:  " + (int) j + "  en decimal" + "\n";
            j++;
        }
        JOptionPane.showMessageDialog(null, cadena1);

    }
}