import javax.swing.*;
	public class ejemunoel{
		public static void main (String[]args){
	int calif;
	calif=Integer.parseInt(JOptionPane.showInputDialog("***PROGRAMA QUE DETERMINA SI TU CALIFICACION ES EXCELENTE, BUENA O MALA***"+"\nINGRESA TU CALIFICACION: "));
		
		if (calif>9 && calif<11){
		JOptionPane.showMessageDialog(null,"TU CALIFICACION ES EXCELENTE:  "+calif);
		}else if (calif>=8 && calif<10){
		JOptionPane.showMessageDialog(null,"TU CALIFICACION ES BUENA:  "+calif);
		}else if (calif>=0 && calif<=7){
		JOptionPane.showMessageDialog(null,"TU CALIFICACION ES MALA REPROBASTE:  "+calif);
		}else {
		JOptionPane.showMessageDialog(null,"VALOR INVALIDO");
		}
		
	}
}
