import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA
	public class perimetro{
		public static void main (String[]args){

	int lado1,base,perimetrorec,arearec,altut=15;
	float pi=3.1416f,rad,pericir,arecir,peritri,ladot,trianare,baset;

		lado1=Integer.parseInt(JOptionPane.showInputDialog("Programa que determina el area y perimetro de un rectangulo"+"\nIngresa el valor del Lado 1 del rectangulo:"));
		base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la base del rectangulo:"));
		perimetrorec=lado1+base+lado1+base;
		arearec=lado1*base;
		JOptionPane.showMessageDialog(null,"El perimetro del rectangulo es:"+perimetrorec+"cm"+"\nEl area del rectangulo es:"+arearec+"cm²");	
		
			rad=Float.parseFloat(JOptionPane.showInputDialog("Programa que determina el area y perimetro de un circulo"+"\nIngresa el radio del circulo:"));		
			pericir=2*pi*rad;
			arecir=pi*rad*rad;
			JOptionPane.showMessageDialog(null,"El perimetro del circulo esi:"+pericir+"cm"+"\nEl area del circulo es:"+arecir+"cm²");	

						
				ladot=Float.parseFloat(JOptionPane.showInputDialog("Programa que determina el area y perimetro de un triangulo"+"\nIngresa el lado del triangulo:"));		
				baset=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de la base del triangulo:"));
				peritri=baset+ladot+ladot;
				trianare=baset*altut/2;
				JOptionPane.showMessageDialog(null,"El perimetro del triangulo esi:"+peritri+"cm"+"\nEl area del triangulo es:"+trianare+"cm²");	

	}
		}