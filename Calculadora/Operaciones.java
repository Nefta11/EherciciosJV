package Calculadora;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Operaciones extends Datos {
    private double suma;
    private double resta;
    private double multiplicaion;
    private double division;
    private double raizc;
    private double raizcu;
    private double potencia;

    public Operaciones(double numero1, double numero2) {
        super(numero1, numero2);

    }

    public double getSuma() {
        suma = getNumero1() + getNumero2();
        return suma;
    }

    public double getResta() {
        resta = getNumero1() - getNumero2();
        return resta;
    }

    public double getMultiplicaion() {
        multiplicaion = getNumero1() * getNumero2();
        return multiplicaion;
    }

    public double getDivision() {
        division = getNumero1() / getNumero2();
        return division;
    }

    public double getRaizc() {
        raizc = (int) Math.sqrt(getNumero1());
        return raizc;
    }

    public double getRaizcu() {
        raizcu = (int) Math.cbrt(getNumero1());
        return raizcu;
    }

    public double getPotencia() {
        potencia = (int) Math.pow(getNumero1(), getNumero2());
        return potencia;
    }

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "Los datos del las operaciones entre los numero: " + getNumero1() + " y "
                + getNumero2() + " Son: " + "\nSUMA: " + getSuma()
                + "\nRESTA: " + getResta() + "\nMULTIPLICACION: " + getMultiplicaion() + "\nDIVISION: " + getDivision()
                + "\nRAIZ CUADRADA: " + getRaizc() + "\nRAIZ CUBICA: " + getRaizcu() + "\nLA POTENCIA DE: "
                + getNumero1() + " ELEVADO A LA: " + getNumero2() + " ES " + getPotencia());
    }

}
