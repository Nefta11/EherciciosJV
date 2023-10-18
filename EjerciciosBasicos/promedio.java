import javax.swing.*; //Neftali Arturo Hernandez Vergara
public class promedio {
    public static void main(String[] args) {
        String cadena = "";
        float[][] calif = new float[3][2];
        String name[] = {"Abigail","Alfonso", "Neftali"};
        
        for (int i = 0; i < 3; i++) {
            cadena += "\n" + name[i] + "";
            
            float suma = 0;
            for (int j = 0; j < 2; j++) {
                calif[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion " + (j + 1) + " de " + name[i]));
                
                while (calif[i][j] > 10) {
                    JOptionPane.showMessageDialog(null, "CALIFICACION NO VALIDA ");
                    calif[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion " + (j + 1) + " de " + name[i]));
                }
                
                suma += calif[i][j];
                cadena = cadena + "    |    " + calif[i][j];
            }
            
            float prom = suma / 2;
            cadena = cadena + "    |    " + prom;
            cadena = cadena + "\n";
        }
        
        JOptionPane.showMessageDialog(null, "NOMBRE   REDES   POO   PROMEDIO" + "\n" + cadena);
    }
}
