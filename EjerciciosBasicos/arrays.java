import javax.swing.*;
public class arrays {
    public static void main(String[]args){
      
       // char letra[]=new char[5];
       // letra[0]='a';
       // letra[1]='e';
        //letra[2]='i';
        //letra[3]='o';
        //letra[4]='u';
       // for(int i=0;i<letra.length;i++){//length como atributo cuando no lleva parentesis.(hace referencia al tamañño de un arreglo) 
        
       // System.out.println(letra[i]);
   // }
    String cadena="";
     String nombre[]=new String[3];
   
      for(int i=0;i<3;i++){
        nombre[i]=JOptionPane.showInputDialog(null,"INTRODUZCA LOS NOMBRES QUE QUIERA");
        cadena=cadena+nombre[i]+"\n";
         
    }
      JOptionPane.showMessageDialog(null,cadena);
    }
}
