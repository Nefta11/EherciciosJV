import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class promed {
    public static void main(String[] args) {
        int numeM, i;
        float calif, totalc = 0;
        String cadena = " ", asig;

        numeM = Integer.parseInt(JOptionPane.showInputDialog("***PROGRAMA QUE DETERMINA EL PROMEDIO DE CALIFICACION***"
                + "\n\n*** INTRODUCE LA CANTIDAD DE MATERIAS :***"));

        for (i = 1; i <= numeM; i++) {
            asig = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DE LA ASIGNATURA NUMERO " + i + " :");
            calif = Float.parseFloat(JOptionPane.showInputDialog("***INGRESE LA CALIFICACION " + i + " :"));
            totalc = totalc + calif;

            cadena = cadena + asig + " :  " + calif + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "Calificacion de las " + numeM + " materias:" + "\n" + cadena + "\nPromedio final:  "
                        + totalc / numeM);
    }
}