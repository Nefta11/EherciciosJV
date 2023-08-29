package Vehiculo;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Vehiculo {
    private int matricula;
    private String modelo;
    private int potencia;

    public Vehiculo(int matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

}
