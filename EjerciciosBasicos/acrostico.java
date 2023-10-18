import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class acrostico {
    public static void main(String[] args) {
        String name, cadena = "", acro, name1;

        name = JOptionPane.showInputDialog(null, "INTRODUZCA SU NOMBRE MENOR A 15 CARACTERES:");

        while (name.length() > 15) {
            JOptionPane.showMessageDialog(null, "Error: el nombre no debe tener más de 15 caracteres.");
            name = JOptionPane.showInputDialog(null, "INTRODUZCA SU NOMBRE MENOR A 15 CARACTERES:");
        }
        name1 = name.replace(" ", "");
        char[] arreglo = name1.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            acro = JOptionPane.showInputDialog("INTRODUZCA EL ACROSTICO PARA LA LETRA " + arreglo[i]);
            cadena = cadena + arreglo[i] + "-- :" + acro.toUpperCase() + "\n";

        }
        JOptionPane.showMessageDialog(null, "EL ACROSTICO DE: " + name + " ES: " + "\n" + cadena);

    }
}
