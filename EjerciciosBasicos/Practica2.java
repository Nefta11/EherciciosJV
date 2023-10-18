import javax.swing.*;
	public class Practica2{//El nombre de la clase siempre debe se ser el nombre de tu archivo (Practica2)
		public static void main (String[]args){
			int numero=20;
			double pi=3.1416;
			boolean estado= false;
			String frase="Yo soy chido (a)";
			char letra=164;
			System.out.println("El numero es: "+numero); //ln o \n=salto de linea
			System.out.println("El valor de pi es: "+pi);//System.out.print manda a llamar los datos y los imprime en pantalla
			System.out.println("El estado es: "+estado);
			System.out.println("Neftali dice: "+frase);
			System.out.println("El numero 164 es el caracter: "+letra);
			JOptionPane.showMessageDialog(null,"\u00f10\n"+"numero\n"+"pi\n"+"estado\n"+"frase\n"+"letra\n");//se imprime todo en un cuadro de dialogo
		}
       
}