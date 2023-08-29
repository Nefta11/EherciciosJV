import javax.swing.*;
public class Matrissuma {
    public static void main (String[] args){
        String mostrar="",mostrar2="",mostrar3="";
        int cont=1,cont2=1;
        int[][] numeros = new int[3][3];
        int[][] numeros2 = new int[3][3];
        for(int i=0;i<3;i++){
       
           for (int j=0;j<3;j++){
               numeros[i][j]=cont++;
                mostrar=mostrar+numeros[i][j];
           }
        mostrar=mostrar+"\n";  
        }
        for(int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               numeros2[i][j]=cont2++;
               mostrar2+=numeros2[i][j];
            
               mostrar3+=numeros[i][j]+numeros2[i][j];
           }
           
           mostrar2=mostrar2+"\n"; 
           mostrar3=mostrar3+"\n";
        }
         
        
          JOptionPane.showMessageDialog(null,"La matriz 1 es: "+"\n"+mostrar+"\nLa matriz 2 es: "+"\n"+mostrar2+"\nLa suma de las matrices es: "+"\n"+mostrar3);
}
    }