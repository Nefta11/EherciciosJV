package Vehiculo; //NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;

public class Inicio2 {
  public static void main(String[] args) {
    Taxi taxi = new Taxi(5423, "Tsuru", 220,
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de licencia: ")));
    taxi.Mostrar();

    Autobus autobus = new Autobus(5423, "MERCEDES-BENZ", 220,
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de plazas: ")));
    autobus.Mostrar1();
  }

}
