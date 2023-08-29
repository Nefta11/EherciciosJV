import javax.swing.*;
	public class edad{
		public static void main (String[]args){
	int edad;
	edad=Integer.parseInt(JOptionPane.showInputDialog("***ESTE PROGRAMA DETERMINA MEDIANTE TU EDAD A QUE GRUPO PERTENCES NI\u00d1O, JOVEN, ADULTO O ANCIANO***"+"\nINGRESA TU EDAD: "));
		
		if (edad<=14){
		JOptionPane.showMessageDialog(null,"SU EDAD ES : "+edad+" A\u00d1OS"+"\n *****USTED ES UN NI\u00d1O***");
		}else if (edad>14 && edad<=18){
		JOptionPane.showMessageDialog(null,"SU EDAD ES : "+edad+" A\u00d1OS"+"\n *****USTED ES UN JOVEN***");
		}else if (edad>=19 && edad<60){
		JOptionPane.showMessageDialog(null,"SU EDAD ES : "+edad+" A\u00d1OS"+"\n *****USTED ES UN ADULTO***");
		}else if (edad>=60 && edad<=100){
		JOptionPane.showMessageDialog(null,"SU EDAD ES : "+edad+" A\u00d1OS"+"\n *****USTED ES UN ANCIANO***");
		}else {
		JOptionPane.showMessageDialog(null,"VALOR INVALIDO");
		}
		
	}
}