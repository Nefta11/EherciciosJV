package Vehiculo;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Autobus extends Vehiculo {
    private int numPlazas;

    public Autobus(int matricula, String modelo, int potencia, int numPlazas) {
        super(matricula, modelo, potencia);
        this.numPlazas = numPlazas;

    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public void Mostrar1() {
        JOptionPane.showMessageDialog(null, "Los datos del taxi son: " + "\nMatricula: " + getMatricula()
                + "\nModelo: " + getModelo() + "\nPotenciaCV: " + getPotencia() + "\nNumero de Plazas: "
                + getNumPlazas());
    }
}
