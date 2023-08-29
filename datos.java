import javax.swing.*;
	public class datos{
		public static void main (String[]args){
		String nombre,carrera,fechn,sex;
		float estatura;

			nombre=JOptionPane.showInputDialog("Ingresa tu nombre completo:");
			fechn=JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento:");
			carrera=JOptionPane.showInputDialog("Ingresa la carrera que cursas:");
			estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura:"));
			sex=JOptionPane.showInputDialog("Ingresa tu sexo:");

	
		JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre+"\nFecha de nacimiento:"+fechn+"\nCarrera que cursas:"+carrera+"\nEstatura:"+estatura+"\nSexo:"+sex);//se imprime todo en un cuadro de dialogo
		}
			}