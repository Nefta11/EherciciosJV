import javax.swing.*; //Neftali Arturo Hernandez Vergara M:220100
    public class pi {
     public static void main (String[] args){
        double rad=5,area,pi=Math.PI;//PI funcion mate que te da la constante de pi ya cargada en java.
        
       area=pi*Math.pow(rad,2);//MATH.PO funcion que permite elevar la variable(A) a la potencia que quieras (B)
       area = (double)Math.round(area*100)/100;//Funcion que permite redondear al entero mas sercano, con la multp y division se arroja solo los dos decimales de tu funcion, si quieres mas debes mult y div por mas asi sucesivamente.
        JOptionPane.showMessageDialog(null,"El area de su circulo es "+area);
        
    }
}
