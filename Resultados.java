import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA

public class Resultados {
   // METODO SIN RETORNO SIN ARGUMENTOS
   public static void Suma() {
      int a = 100, b = 35, c;
      c = a + b;
      JOptionPane.showMessageDialog(null, "LA SUMA ES " + c);
   }

   // Metodo con retorno sin argumentos.
   public static int Div() {
      int a = 100, b = 35;
      return a / b;
   }

   // Metodo sin retorno con argumentos
   public static void resta(int a, int b) {
      int c = a - b;
      JOptionPane.showMessageDialog(null, "LA RESTA ES " + c);
   }

   // Metodo con retorno con argumentos
   public static int Mult(int a, int b) {
      int c = a * b;
      return a * b;

   }

   // METODO SIN RETORNO SIN ARGUMENTOS
   public static void ecu() {
      int a = 4, b = 6, c;
      c = a + b;
      JOptionPane.showMessageDialog(null, "LA Ecuacion de y -4 =6: " + c);
   }

   public static void main(String[] args) {
      Suma();
      resta(100, 35);
      JOptionPane.showMessageDialog(null, "La division es: " + Div());
      JOptionPane.showMessageDialog(null, Mult(100, 35));
      ecu();
   }
}