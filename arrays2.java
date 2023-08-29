import javax.swing.*;
public class arrays2 {
    public static void main(String[]args){
        int nelement;
         String cadena="";
        nelement=Integer.parseInt(JOptionPane.showInputDialog("DEFINE EL TAMAÑO DEL ARREGLO"));
        
        int arreglo[]=new int[nelement];
        
        for(int i=0;i<nelement;i++){
        arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN VALOR PARA LA POSICION  "+i));
        cadena=cadena+"El valor de la posicion "+i+"  Es :"+arreglo[i]+"\n";
        
        }
         JOptionPane.showMessageDialog(null,cadena);
    }
}
