
package Institución;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Docente extends Persona {
    private int NumeTrabajador;
    private String rfc;
    private double salario;

    public Docente(String nombre, String apellidos, int edad, int NumeTrabajador, String rfc, double salario) {
        super(nombre, apellidos, edad);
        this.NumeTrabajador = NumeTrabajador;
        this.rfc = rfc;
        this.salario = salario;

    }

    public int getNumeTrabajador() {
        return NumeTrabajador;
    }

    public String getRfc() {
        return rfc;
    }

    public double getSalario() {
        return salario;
    }

    public void Mostrar3() {
        JOptionPane.showMessageDialog(null, "Los datos son: " +
                "\nNOMBRE: " + getNombre() + "\nApellidos: " + getApellidos() + "\nEDAD: " + getEdad()
                + "\nNumero de trabajador: " + getNumeTrabajador() + "\nRFC: " + getRfc() + "\nSalario: "
                + getSalario());
    }

}
