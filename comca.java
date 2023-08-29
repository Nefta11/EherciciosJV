import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
public class comca{
    public static void main (String[] args){
        
         String resp1, resp2;
        resp1=JOptionPane.showInputDialog(null,"INTRODUCE UN TEXTO");
        resp2=JOptionPane.showInputDialog(null,"INTRODUCE EL SEGUNDO TEXTO");
      
         if(resp1.length()==resp2.length()){
        JOptionPane.showMessageDialog(null,"Las cadenas son iguales"); 
        JOptionPane.showMessageDialog(null,resp1.toUpperCase()+"\n"+resp2.toUpperCase()); //convierte string para mayusculas
         }
          else{
            JOptionPane.showMessageDialog(null,"NO SON IGUALES");
          }
       
        }
    }