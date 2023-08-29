import javax.swing.*;
	public class eje1{
		public static void main (String[]args){
		int P=5, J=10,M=2,N=10;
		boolean a=P<J && M<N, b=M>N || J==N, c=(!b);
			
			JOptionPane.showMessageDialog(null,"LA CONDICI\u00d3N 5<10 Y 2<10 ES:"+a+"\nLA CONDICI\u00d3N 2>10 || 10=10 ES:"+b+"\nLA CONDICI\u00d3N NOT b ES:"+c);
				
	}
}