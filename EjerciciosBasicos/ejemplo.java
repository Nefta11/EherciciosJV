import javax.swing.*;
public class ejemplo {
    public static void main (String[]args){
        
       int validacion;
       
       do{
       validacion=JOptionPane.showConfirmDialog(null,"¿Desea continuar?",null,JOptionPane.YES_NO_OPTION);
        
       }while(validacion==JOptionPane.YES_OPTION);    
    }
}
