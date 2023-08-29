import javax.swing.*;
	public class eje2{
		public static void main (String[]args){
		int A=33;
		boolean b=! ((A>10) && (A<20));
		boolean c=! ((A>10) || !(A<20));
		boolean d= A>10 && A>=20;
			
			JOptionPane.showMessageDialog(null,"LA CONDICI\u00d3N NOT ((A>10) && (a<20)) :"+b+"\nLA CONDICI\u00d3N NOT (a>10) || !(a<20)) ES:"+c+"\nLA CONDICI\u00d3N a>10 && a>=20 ES:"+d);
				
	}
}