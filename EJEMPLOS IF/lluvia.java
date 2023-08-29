import javax.swing.*; 
	public class lluvia{
		public static void main (String[]args){
			String resp;
				
				resp=JOptionPane.showInputDialog(null,"DE ACUERDO A SU RESPUESTA SOBRE SI EL CLIMA ES LLUVIOSO O NO SE LE DARA UN CONSEJO" +"\n¿ ESTA LLOVIENDO ? ");
					if(resp.equals ("SI")||resp.equals("si")|resp.equals("Si")){
						 JOptionPane.showMessageDialog(null,"Para salir carga una sombrilla o un impermeable");
					}else{
						JOptionPane.showMessageDialog(null,"Puedes salir con tranquilidad y sin sombrilla");
					}

		}
}