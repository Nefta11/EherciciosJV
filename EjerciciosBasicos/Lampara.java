
import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class Lampara {
    String color, tamaño;

    public static void main(String[] args) {
        // creacion de objeto
        Lampara atributo = new Lampara();
        atributo.color = JOptionPane.showInputDialog(null, "INTRODUCE EL COLOR");
        atributo.tamaño = JOptionPane.showInputDialog(null, "INTRODUCE EL TAMAÑO");

        JOptionPane.showMessageDialog(null,
                "LAMPARA" + "\nColor: " + atributo.color + "\n" + "Tamaño: " + atributo.tamaño);

    }
}
