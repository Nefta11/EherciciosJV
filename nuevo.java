import javax.swing.*;
import java.util.Arrays;//libreria de java que trabaja con arreglos. 
    public class nuevo {
     public static void main(String[] args){
         String muebles[]={"cama","mesa","comedor"};
         
         for(String i:muebles){
             Arrays.sort(muebles);//este metodo ordena una lista ya sea de datos int o string.
             System.out.println(i);
         }
         
         char iniciales[]={'h','o','l','a'};
         for(char i:iniciales){
             System.out.println(Arrays.toString(iniciales));//convertir caracteres a cadena de texto.
         }
     
        }
     }