import javax.swing.*;
public class arrayuni {
    public static void main (String[] args){
        String mostrar="",cadena="";
        int cont=1;
        int[][] numeros = new int[3][3];
        int[][] numeros2 = new int[3][3];
     
        for(int i=0;i<3;i++){
       
           for (int j=0;j<3;j++){
               numeros[i][j]=cont++;
              
               mostrar=mostrar+numeros[i][j];
           }
        mostrar=mostrar+"\n";  
           
        
        
          JOptionPane.showMessageDialog(null,"""
                                             La matriz 1 es: 
                                             """+mostrar);
          
}
    }
}
