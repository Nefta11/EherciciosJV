import javax.swing.*;
	public class ejemuno{
		public static void main (String[]args){
	int edad;
	edad=Integer.parseInt(JOptionPane.showInputDialog("***PROGRAMA QUE DETERMINA SI ERES MAYOR O MENOR DE EDAD***"+"\nIngrese tu edad:"));
		
		if (edad>=18){
		JOptionPane.showMessageDialog(null,"USTED ES MAYO DE EDAD CON "+edad+" A\u00d1OS");
		}else{
		JOptionPane.showMessageDialog(null,"USTED ES MENOR DE EDAD");
		}
	}
}