import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA
public class Operaciones {
    //METODO SIN RETORNO SIN PARAMETROS
     public static void suma() {//creacion del metodo sin retorno llamado suma
    int a=9 ,b=10,c;
      c=a+b;  
    JOptionPane.showMessageDialog(null,"LA SUMA ES"+c);
    
     }
     //Metodo sin retorno con parametros
    public static void Suma2(int a, int b){
     int c=a+b;   
       JOptionPane.showMessageDialog(null,"LA SUMA ES"+c);  
    }
    //Metodo con retorno sin parametros.
    public static int Suma3(){
       int a=9, b=19;
        return a+b; 
        
        
    }
    
    //Metodo con retorno con parametros
    public static int Suma4(int a, int b){
        int c=a+b;
        return a+b;
        
    }
    
    public static void main(String []args){
    suma();
    Suma2(9,2);
    JOptionPane.showMessageDialog(null,Suma3()); 
    JOptionPane.showMessageDialog(null,Suma4(10,20)); 
    }
        
    }

