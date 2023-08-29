package Vehiculo;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Taxi extends Vehiculo {
    private int numeroLicencia;

    public Taxi(int matricula, String modelo, int potencia, int numeroLicencia) {
        super(matricula, modelo, potencia);

        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "Los datos del taxi son: " + "\nMatricula: " + getMatricula()
                + "\nModelo: " + getModelo() + "\nPotenciaCV: " + getPotencia() + "\nNumero de Licencia: "
                + getNumeroLicencia());
    }
}
