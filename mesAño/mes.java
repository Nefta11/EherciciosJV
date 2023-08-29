import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
	public class mes{
		public static void main (String[]args){
			String mes;
		
		mes=JOptionPane.showInputDialog(null,"INGRESA EL MES PARA VER SU NUMERO DE DIAS");

		if(mes.equals ("enero")||mes.equals ("Enero")||mes.equals ("marzo")||mes.equals("Marzo")||mes.equals("mayo")||mes.equals("Mayo")||mes.equals("julio")||mes.equals("Julio")||mes.equals("agosto")||mes.equals("Agosto")||mes.equals("octubre")||mes.equals("Octubre")||mes.equals("diciembre")||mes.equals("Diciembre")) {
						 JOptionPane.showMessageDialog(null,"El mes selecionado es: "+mes+" Y TIENE 31 DIAS");
		}else if(mes.equals ("abril")||mes.equals("Abril")||mes.equals("junio")||mes.equals("Junio")||mes.equals("septiembre")||mes.equals("Septiembre")||mes.equals("noviembre")||mes.equals("Noviembre") ){
						 JOptionPane.showMessageDialog(null,"El mes selecionado es: "+mes+" Y TIENE 30 DIAS");
		}else if(mes.equals ("febrero")||mes.equals("Febrero")){
			 JOptionPane.showMessageDialog(null,"El mes selecionado es: "+mes+" Y TIENE 28 DIAS");
			}

		}
	}	
