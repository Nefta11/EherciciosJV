import javax.swing.*;

public class unidem {// Neftali Arturo Hernandez Vergara.
     public static void main(String[] args) {

          String cadena = "";

          JOptionPane.showMessageDialog(null,
                    "*****PROGRAMA QUE TE MUESTRA NUMEROS NEGATIVOS ALEATORIOS DE 10 A 20 ***** ");
          int numero[] = new int[5];

          for (int i = 0; i < numero.length; i++) {
               numero[i] = -(int) (Math.random() * 11 + 10); // Se genera aleatoriamente el numero dentro del array en
                                                             // negativo.
               cadena = cadena + numero[i] + "\n";
          }

          JOptionPane.showMessageDialog(null, """
                    LOS NUMEROS ALEATORIOS SON:
                    """ + cadena);
     }
}
