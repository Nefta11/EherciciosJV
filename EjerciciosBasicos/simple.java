import javax.swing.*;
	public class simple{
		public static void main (String[]args){
			int calif;
				calif=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificacion de primer cuatrimeste:"));
					if(calif>=9 && calif<=10){
						 JOptionPane.showMessageDialog(null,"Aprobaste con:"+calif);
					}else if(calif==8){
					 	JOptionPane.showMessageDialog(null,"Aprobaste con la minima:"+calif);
					}else if(calif>=0 && calif<=7){
						JOptionPane.showMessageDialog(null,"Reprobado con:"+calif);
					}else{
						JOptionPane.showMessageDialog(null,"VALOR NO VALIDO");
					}

		}
}