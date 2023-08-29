import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
public class nombre{
    public static void main (String[] args){
        
        String nomb;
        nomb=JOptionPane.showInputDialog(null,"INTRODUCE TU NOMBRE");
        
        if(nomb.length()<=5){
            JOptionPane.showMessageDialog(null,"El nombre es "+nomb);
          }
        
        else {
            JOptionPane.showMessageDialog(null,"DATO INVALIDO");
          }
        
        }
    }
