import javax.swing.*;
public class examen{
    public static void main (String[] args){

        int validacion,nume,adi, totalv=0,veces=0;
        String cadena1 = " ";
    
        do{
         nume= Integer.parseInt(JOptionPane.showInputDialog("***ADIVINA UN NUMERO ENTRE EL 1 Y 10***"));
        adi=(int)(Math.random()*11);//NUMERO QUE SE GENERA ALEATORIAMENTE 
        if (nume>10){
        JOptionPane.showMessageDialog(null, "NO SE PUEDEN INGRESAR DATOS MAYORES A 10");
        }
        else  if(nume==adi){
        JOptionPane.showMessageDialog(null, "ADIVINASTE, EL NUMERO GANADOR ES "+adi);
        }
        else if (nume!=adi){
            veces++;
            totalv=nume;
         cadena1 = cadena1 +"EL NUMERO ALEATORIO FUE: "+ totalv+"\n";
        JOptionPane.showMessageDialog(null, "EL NUMERO ES: "+adi+" Y TU INGRESASTE: "+nume+"\n"+"INTENTALO NUEVAMENTE");
        }
        validacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", null, JOptionPane.YES_NO_OPTION);
       
        } while(validacion == JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "LO INTENTASTE: "+veces+" VECES"+"\n"+cadena1+"\n"+"ADIVINASTE EL NUMERO GANADOR: "+adi);
    }
    
}