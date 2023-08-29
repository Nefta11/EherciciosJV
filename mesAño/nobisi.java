import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
	public class nobisi{
		public static void main (String[]args){
		int mes;
		int year,div=4,divi=100,divis=400;
		mes=Integer.parseInt(JOptionPane.showInputDialog("****INGRESE EL MES QUE USTED QUIERA****"+"\nELIGA UNA DE LAS SIGUIENTES OPCIONES: "+"\n(1)Enero "+"\n(2)FEBRERO"+"\n(3)Marzo"+"\n(4)Abril"+"\n(5)Mayo "+"\n(6)Junio"+"\n(7)Julio"+"\n(8)Agosto"+"\n(9)Septiembre "+"\n(10)Octubre"+"\n(11)Noviembre"+"\n(12)Diciembre"));		
		
			switch(mes)
		{
		case 1:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Enero  y tiene 31 dias."+"\nLa estaci\u00f3n es Invierno, el clima es muy frio, abrigate");	
		break;
		case 2: 
		year=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN A\u00d1O:"));	
		if((year%div ==0) && (year%divi != 0 || year%divis == 0)){
		JOptionPane.showMessageDialog(null," *******EL A\u00d1O ES BISIESTO****** ");
		}else{
		JOptionPane.showMessageDialog(null," ******EL A\u00d1O NO ES BISIESTO***** ");
		}
		break;
			
		case 3:  
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Marzo  y tiene 31 dias"+"\nLa estaci\u00f3n es invierno iniciando el mes y a mediados inicia primavera, donde predomino un clima calido " );	
		break;
		case 4:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Abril  y tiene 30 dias"+"\nLa estaci\u00f3n es primavera, predomino un clima calido");	
		break;
		case 5:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Mayo  y tiene 31 dias"+"\nLa estaci\u00f3n es primavera, predomino un clima calido");	
		break;
		case 6:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Junio  y tiene 30 dias"+"\nLa estaci\u00f3n es primavera, predomino un clima calido");	
		break;
		case 7:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Julio  y tiene 31 dias"+"\nLa estaci\u00f3n es Verano, el clima es muy calido");	
		break;
		case 8: 
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Agosto  y tiene 31 dias"+"\nLa estaci\u00f3n es Verano, el clima es muy calido");	
		break;
		case 9:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Septiembre  y tiene 30 dias"+"\nLa estaci\u00f3n es Verano a inicios y Oto\u00f1o a mediados de mes, el clima es muy calido");	
		break;
		case 10:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Octubre  y tiene 31 dias"+"\nLa estaci\u00f3n es Oto\u00f1o, el clima comienza a enfriarse y a hacerse inestable.");	
		break;
		case 11:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Noviembre  y tiene 31 dias"+"\nLa estaci\u00f3n es Oto\u00f1o, el clima comienza a enfriarse y a hacerse inestable.");	
		break;
		case 12:
		JOptionPane.showMessageDialog(null,"El mes selecionado es: Diciembre  y tiene 31 dias"+"\nLa estaci\u00f3n es Oto\u00f1o a inicios e Invierno a mediados de mes, el clima es frio, abrigate");		
		break;
				
		default:
		JOptionPane.showMessageDialog(null," USTED INGRESO UN VALOR INVALIDO ");
		break;
		}

	}
}