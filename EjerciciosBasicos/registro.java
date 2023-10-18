import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
public class registro{
    public static void main (String[] args){
        
        String user;
       int validacion;
       
        do{
         user=JOptionPane.showInputDialog(null,"DIGITE EL NOMBRE CON EL QUE QUEDARA REGISTRADO");
         
         if(user.length()<=8){
          
         JOptionPane.showMessageDialog(null,"EL USUARIO ES: "+user.toLowerCase()+"\n"+"LA CONTRASE\u00d1A ES: "+(int)user.charAt(5)+user.charAt(0)+(int)user.charAt(2)+user.charAt(3));
        
         }
         
         else {
            
           JOptionPane.showMessageDialog(null, "SOBREPASASTE EL LIMTE DE 8 CARACTERES");
         }
          validacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", null, JOptionPane.YES_NO_OPTION);
         
        }while  (validacion == JOptionPane.YES_NO_OPTION);
            
              
          }
   }
        
        
    
    
