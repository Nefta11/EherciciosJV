import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class bidimen {
    public static void main(String[] args) {
        String mostrar = "", cadena = "";
        int matriz[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                mostrar = mostrar + matriz[i][j];

            }

            mostrar = mostrar + "\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}
