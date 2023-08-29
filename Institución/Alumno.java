
package Institución;//NEFTALI ARTURO HERNANDEZ VERGARA

import javax.swing.*;
public class Alumno extends Persona { //Herencia de la clase Persona
 private int matricula;
 private String carrera;
 private float promedio;
    
    
  public Alumno(String nombre, String apellidos, int edad, int matricula, String carrera, float promedio){
      super(nombre,apellidos,edad);
      this.matricula=matricula;
      this.carrera=carrera;
      this.promedio=promedio;
  }

    public int getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public float getPromedio() {
        return promedio;
    }
  
    public void  Mostrar(){
        JOptionPane.showMessageDialog(null, "Los datos son: "+
                "\nNOMBRE: "+getNombre()+"\nApellidos: "+getApellidos()+"\nEDAD: "+getEdad()
           +"\nMatricula: "+getMatricula()+"\nCarrera: "+getCarrera()+"\nPromedio: "+getPromedio());
    }
    
    public void Mostrar2(){
      String cadena="" ;
      cadena+=super.getNombre()+"\n"+super.getApellidos()+"\n"+super.getEdad()+"\n"+getMatricula()+"\n"+getCarrera()+"\n"+getPromedio();
        
      JOptionPane.showMessageDialog(null,cadena); 
        
    }
 
    
    
}
