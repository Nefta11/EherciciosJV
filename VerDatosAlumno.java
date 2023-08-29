import javax.swing.*;
public class VerDatosAlumno {
    public static void main(String[] args) {
        int validacion;
        DatosAlumno estudiante= new DatosAlumno();
        
         do{
        estudiante.setNombre(JOptionPane.showInputDialog(null, "DIGITE EL NOMBRE DEL ALUMNO: "));
        estudiante.setPromedio(Float.parseFloat(JOptionPane.showInputDialog("***INGRESE SU PROMEDIO CON EL QUE SE GRADUO DE BACHILLERATO:")));
       
        estudiante.setFrase("POR SU PROMEDIO USTED HA SIDO ADMITIDO");
        estudiante.setFrase1("NO HA SIDO ADMITIDO LO LAMENTAMOS");
         
        
        if(estudiante.getPromedio()>=8 && estudiante.getPromedio()<10){
       JOptionPane.showMessageDialog(null,"Los datos del alumno son: "+"\nNombre:"+"\nPromedio: "+estudiante.getPromedio()+"\n"+estudiante.getFrase());
        }else{
            JOptionPane.showMessageDialog(null,"Los datos del alumno son: "+"\nNombre:"+"\nPromedio: "+estudiante.getPromedio()+"\n"+estudiante.getFrase1());
        }
        validacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", null, JOptionPane.YES_NO_OPTION);
        } while(validacion == JOptionPane.YES_NO_OPTION);
   
    }
}
