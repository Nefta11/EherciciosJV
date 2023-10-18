import javax.swing.*;
	public class ejemfor{
		public static void main (String[]args){
		
		int acum=0;
		String cadena=" ";

		for(int i=0;i<=10;i++){
		acum=acum+i;
		cadena=cadena+acum+"\n";
		}
	JOptionPane.showMessageDialog(null,cadena);
		}
}