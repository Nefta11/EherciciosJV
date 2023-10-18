import javax.swing.*;

public class DatosPer {// Neftali Arturo Hernandez Vergara 2A DSM
    // METODO SIN RETORNO SIN PARAMETROS
    public static void NomAp() {// creacion del metodo sin retorno llamado suma
        String nom, ap;// Variables nom se refiere a nombre y ap para apellido.
        nom = JOptionPane.showInputDialog(null, "INTRODUCE TU NOMBRE");
        ap = JOptionPane.showInputDialog(null, "INTRODUCE TU APELLIDO");
        JOptionPane.showMessageDialog(null, "Los nombres y apellidos son:" + nom + " " + " " + ap);
    }

    // Metodo sin retorno con parametros
    public static void NomAp2(String nom, String ap) {
        JOptionPane.showMessageDialog(null, "(SNR/con P)Los nombres y apellidos son:" + nom + " " + " " + ap);
    }

    // Metodo con retorno sin parametros.
    public static String NomAp3() {
        String nom, ap;
        nom = JOptionPane.showInputDialog(null, "INTRODUCE TU NOMBRE");
        ap = JOptionPane.showInputDialog(null, "INTRODUCE TU APELLIDO");
        return nom + " " + ap;
    }

    // Metodo con retorno con parametros
    public static String NomAp4(String nom, String ap) {
        return nom + " " + ap;
    }

    public static void main(String[] args) {
        String nom, ap;
        NomAp();
        nom = JOptionPane.showInputDialog(null, "INTRODUCE TU NOMBRE");
        ap = JOptionPane.showInputDialog(null, "INTRODUCE TU APELLIDO");
        NomAp2(nom, ap);
        JOptionPane.showMessageDialog(null, NomAp3());
        JOptionPane.showMessageDialog(null, NomAp4(nom, ap));
    }
}
