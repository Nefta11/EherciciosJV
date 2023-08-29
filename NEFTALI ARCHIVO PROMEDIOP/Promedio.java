import javax.swing.*;
//NEFTALI ARTURO HERNANDEZ Profa mi codigo esta mal pero si corre, tuve varios errores.
public class Promedio{
    //Metodo con retorno con parametros 
    public static float promedio(String nom, float[] calif){
        float promedio = 0;
        for(int i = 0; i < 5; i++){
            calif[i]= Float.parseFloat(JOptionPane.showInputDialog("***INGRESE LA CALIFICACION " + (i+1) + " :"));
            promedio += calif[i];
        }
        promedio /= 5;
        return promedio;
    }
    public static void Mostrar(){
        String nom = "Neftali";
        float[] calif = new float[5];
        float promedio = promedio(nom, calif);
        JOptionPane.showMessageDialog(null, nom + " | " + promedio);
    }
    
    public static void main(String[] args) {
        Mostrar();
    }
}


