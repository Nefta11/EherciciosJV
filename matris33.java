import javax.swing.*;
public class matris33 {
    public static void main (String[] args){
        String mostrar="",cadena="";
        int cont=1;
        int[][] numeros = new int[5][4];
    
     
        for(int i=0;i<5;i++){
       
           for (int j=0;j<4;j++){
               numeros[i][j]=cont++;
              
               mostrar=mostrar+numeros[i][j];
           }
       
        mostrar=mostrar+"\n";  
           
        }
        
          JOptionPane.showMessageDialog(null,"La matriz es: "+"\n"+mostrar);
}
    }