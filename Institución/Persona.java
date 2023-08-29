package Institución;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    // creacion de metodo constructor
    public Persona(String nombre, String apellidos, int edad) {
        // Asignacion del parametro recibido desde el main para asignarlo al atributo.
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

}
