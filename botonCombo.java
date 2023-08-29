import javax.swing.*; 
    public class botonCombo {
     public static void main(String[] args){
        /*  String operacion[]={"suma","resta","multiplic"};
        
     int seleccion =JOptionPane.showOptionDialog(null, "Seleccione una operacion", "Operaciones basicas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, operacion, operacion[0]);//Esta funcion permite seleccionar algo dentro de un menu.
     
     switch (seleccion){
        
         case 1 :
             int s=10+9;
             JOptionPane.showMessageDialog(null,"La suma 10+9 es: "+s);
         break;
         
         
         case 2:
           int r=100-72;
             JOptionPane.showMessageDialog(null,"La resta100-72 es; "+r);  
             
         break;
         
         
         case 3:
           int m=5*2;
             JOptionPane.showMessageDialog(null,"La multiplicacion 5*2 es: "+m);  
             
          break;
         }*/
     
     String cuentas[]={"Division","Suma","Multiplicacion"};
     String eleccion=(String)(JOptionPane.showInputDialog(null, "Elige una operacion", "cuentas", JOptionPane.DEFAULT_OPTION, null, cuentas, cuentas[2]));//Esta funcion permite preseleccionar algo dentro de un menu.
     
     switch (eleccion){
        
         case "Division" :
             int s=100/9;
             JOptionPane.showMessageDialog(null,"La division de 100/9 es: "+s);
         break;
         
         
         case "Suma":
           int r=100+72;
             JOptionPane.showMessageDialog(null,"La suma de 100+72 es: "+r);  
             
         break;
         
         
         case "Multiplicacion":
           int m=5*2;
             JOptionPane.showMessageDialog(null,"La multiplicacion de 5*2 es: "+m);  
             
          break;
     
     
     }
     }
     
 }