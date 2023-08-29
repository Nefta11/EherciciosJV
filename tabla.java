import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class tabla{
	public static void main(String[] args) {
			int nume, i=1,mult;
			String cadena = " ";
			nume=Integer.parseInt(JOptionPane.showInputDialog("*** INTRODUCE EL NUMERO DE QUE QUIERES QUE SEA MULTIPLICADO***"));
		
	while(i<=10 ){
	mult=i*nume;
	cadena = cadena +nume+"x"+ i+"="+mult+ "\n";
	i++;
	}
	
	JOptionPane.showMessageDialog(null, cadena);
	}
}