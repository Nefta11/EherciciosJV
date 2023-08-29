import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA

public class tabla4{
	public static void main(String[] args) {
			int n,mult, i=1,j=1;
			String cadena = " ";
			
		
	while(i<=4){
	
	while(j<=10){
	mult=i*j;
	cadena = cadena +i+"x"+ j+"="+mult+ "\n";
	j++;
	}
	i++;
	j=1;
	}
	
	JOptionPane.showMessageDialog(null, cadena);
	}
}