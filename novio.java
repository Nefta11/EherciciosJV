import javax.swing.*;
	public class novio{
		public static void main (String[]args){
			String resp;
				
				resp=JOptionPane.showInputDialog(null,"¿ QUIERES SER MI NOVIA?");
					if(resp.equals ("SI")||resp.equals("si") ){
						 JOptionPane.showMessageDialog(null,"Te quiero mucho nunca te fallare");
					}else if(resp.equals ("NO")||resp.equals("no")){
					 	JOptionPane.showMessageDialog(null,"Al fin que ni queria");
					}else if(resp.equals ("TAL VEZ")||resp.equals("tal vez")){
						JOptionPane.showMessageDialog(null,"Dame la oportunidad de demostrarte lo bien que te la pasarias conmigo");
					}else{
						JOptionPane.showMessageDialog(null,"NO SABES LO QUE QUIERES ;(");
					}

		}
}