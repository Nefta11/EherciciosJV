
//clase principal
import javax.swing.*;//NEFTALI ARTUOR HERNANDEZ VERGARA.

public class VerDatos {
  public static void main(String[] args) {

    DatosPersonales Alumno1 = new DatosPersonales(220100, "NEFTALI ARTURO HERNANDEZ VERGARA", 8.2);
    DatosPersonales asignacion = new DatosPersonales("A");
    Alumno1.ver();
    asignacion.prom = 7.2;
    asignacion.grupo = "B";
    asignacion.VerGrupo();

    if (asignacion.prom >= 8) {
      JOptionPane.showMessageDialog(null, "Aprobaste el curso con: " + asignacion.prom);
    } else {
      JOptionPane.showMessageDialog(null, "reprobaste el curso tontin");
    }

    if (asignacion.grupo.equals("A")) {

      JOptionPane.showMessageDialog(null, "Cursar idioma Frances");
    } else
      JOptionPane.showMessageDialog(null, "Cursar idioma Ingles");
  }
}
