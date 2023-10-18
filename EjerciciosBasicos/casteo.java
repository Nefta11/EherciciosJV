import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA
	public class casteo{
		public static void main (String[]args){
		int a=2;
		float b=15f,c;

		JOptionPane.showMessageDialog(null,"DIVISION Y MULTIPLICACION");

		c=a*(int)b;
		JOptionPane.showMessageDialog(null,"Resultado de la multiplicacion es: "+(int)c);
		c=b/a;
		JOptionPane.showMessageDialog(null,"Resultado de la multiplicacion es: "+c);
		}
}