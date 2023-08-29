import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class mul3 {
    public static void main(String[] args) {
        String cadena = " ";
        int nume, sum = 0, acum = 0;

        nume = Integer.parseInt(JOptionPane
                .showInputDialog("PROGRAMA QUE MUESTRA Y SUMA LOS NUMEROS MULTIPLOS DE 3 QUE INGRESE EL USUASIO"
                        + "\n\n*** INTRODUCE LA CANTIDAD DE NUMEROS IMPARES QUE QUIERES QUE SE TE MUESTREN :***"));

        for (int i = 1; i <= nume; i++) {
            acum = acum + 3;
            cadena = cadena + acum + "\n";
            sum = sum + acum;
        }

        JOptionPane.showMessageDialog(null, cadena);
        JOptionPane.showMessageDialog(null, "LA SUMA DE TUS NUMEROS MULTIPLOS DE 3 ES: " + sum);
    }

}