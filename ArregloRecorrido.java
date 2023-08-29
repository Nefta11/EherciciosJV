import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class ArregloRecorrido {
    public static void main(String[] args) {
        int nelement;
        String cadena = "";
        nelement = Integer.parseInt(JOptionPane.showInputDialog("DEFINE EL TAMAÑO DEL ARREGLO"));

        int arreglo[] = new int[nelement];

        for (int i = 0; i < nelement; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN VALOR PARA LA POSICION  " + i));
            cadena = cadena + "El valor de la posicion " + i + "  Es :" + arreglo[i] + "\n";

        }

        JOptionPane.showMessageDialog(null, cadena);

        // Cambiar la posición del último valor del arreglo y recorrer el arreglo una
        // posición hacia abajo
        int aux = arreglo[nelement - 1];
        for (int i = nelement - 2; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = aux;

        // Imprimir el arreglo modificado
        cadena = "";
        for (int i = 0; i < nelement; i++) {
            cadena = cadena + "El valor de la posicion " + i + "  Es :" + arreglo[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
