
//Clase de metodos constructores.
import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class DatosPersonales {
  int matricula;
  double prom;
  String nombre, grupo;

  // Creacion de metodo constructor.
  public DatosPersonales(int matricula, String nombre, double prom) {

    this.matricula = matricula;
    this.nombre = nombre;
    this.prom = prom;

  }

  // sobre carga de metodos
  public DatosPersonales(String grupo) {
    this.grupo = grupo;
  }

  // sobre carga de metodos promedio
  // public DatosPersonales(float prom){
  // this.prom= prom; // no es funcional por que lo requiere desde el principio y
  // no se sobrecarge
  // }
  // metodo para mostrar datos
  public void ver() {

    JOptionPane.showMessageDialog(null,
        "Los datos del (la) alumno(a) son: \n" + "matricula: " + matricula + "\nNombre: " + nombre);

  }

  public void VerGrupo() {
    JOptionPane.showMessageDialog(null, "Estas asignado al grupo: " + grupo);

  }

}
