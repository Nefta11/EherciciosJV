import javax.swing.*;//NEFTALI ARTURO HERNANDEZ VERGARA
	public class rebaja{
		public static void main (String[]args){
			int cant;
			double total,desc,preciouni, preciot;
			
				cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tenis que compro:"));
				preciouni=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio unitaria de los tenis:"));
					
					if(cant<3 && preciouni>=800){
						preciot=preciouni*cant;
						desc=preciot*0.10;
						total=preciot-desc;
						 JOptionPane.showMessageDialog(null,"Cantidad de tennis:"+cant+"\nCosto Unitario:"+preciouni+"\nTotal a pagar:"+total);
					}else if(cant>=3 && preciouni>=800){
						preciot=preciouni*cant;
						desc=preciot*0.30;
						total=preciot-desc;
					 	JOptionPane.showMessageDialog(null,"Cantidad de tennis:"+cant+"\nCosto Unitario:"+preciouni+"\nTotal a pagar:"+total);
					}else if(cant>=1 && preciouni<800){
						preciot=preciouni*cant;
						total=preciot;
						JOptionPane.showMessageDialog(null,"Cantidad de tennis:"+cant+"\nCosto Unitario:"+preciouni+"\nTotal a pagar:"+total);
					}else{
						JOptionPane.showMessageDialog(null,"VALOR NO VALIDO");
					}

		}
}