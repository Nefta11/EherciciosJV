import javax.swing.*;
	public class ejemdos{
		public static void main (String[]args){
	int num;
	num=Integer.parseInt(JOptionPane.showInputDialog("***ESCRIBE UN NUMERO DEL 1 AL 10 :***"));
		
		if (num>=0 && num<=10){
		JOptionPane.showMessageDialog(null,"CUMPLISTE LA CONDICION TU NUMERO ES:  "+num);
		}else{
		JOptionPane.showMessageDialog(null,"NO HAS CUMPLIDO CON LA CONDICION");
		}
	}
}