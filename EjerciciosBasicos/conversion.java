import javax.swing.*;
public class conversion {//Neftali Arturo Hernandez Vergara 2A DSM
    public static void main (String []args){
        int validacion;
        
        do{ 
         String operacion[]={"Longitud","Masa","Distancia","Moneda"};
        int elecc =JOptionPane.showOptionDialog(null, "***Eliga el tipo de conversion que decea realizar***", "Conversiones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, operacion, operacion[0]);
        
        switch (elecc){
        case 0 :
       String conv1[]={"Metros a centimetros","Pies a metros"};
      String case0=(String)(JOptionPane.showInputDialog(null, "Elige una operacion", "Unidad de medida", JOptionPane.DEFAULT_OPTION, null, conv1, conv1[0]));//Esta funcion permite preseleccionar algo dentro de un menu.
     
        switch (case0){
        
         case "Metros a centimetros" :
         float met,cen=100,conv;
        met=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LOS METROS QUE SE CONVERTIRAN A CENTIMETROS ***"));
        conv=met/cen;
        JOptionPane.showMessageDialog(null,"Los: "+met+" metros"+"\n"+"En centimetros son: "+conv); 
         break;
         
         case "Pies a metros" :
         float tot,pie,metr=3.281f;
        pie=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LOS PIES QUE SE CONVERTIRAN A METROS ***"));
        tot=pie/metr;
        JOptionPane.showMessageDialog(null,"Los: "+pie+" pies"+"\n"+"En metros son: "+tot); 
         break;
               }
         break;

         
         
         case 1:
         String conv2[]={"Libras a Kilogramos", "Kilogramos a Libras", "Toneladas a Kilogramos"};
      String case1=(String)(JOptionPane.showInputDialog(null, "Elige una operacion", "Unidad de medida", JOptionPane.DEFAULT_OPTION, null, conv2, conv2[0]));
     
        switch (case1){
        
         case "Libras a Kilogramos" :
         float result,libra,kg=2.205f;
        libra=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LAS LIBRAS QUE SE CONVERTIRAN A KILOGRAMOS ***"));
        result=libra/kg;
        JOptionPane.showMessageDialog(null,"Las: "+libra+" libras"+"\n"+"Convertidas a kilogramos son: "+result); 
         break;
         
         case "Kilogramos a Libras" :
         float conver,kilo,librast=2.205f;
        kilo=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LOS KILOGRAMOS QUE SE CONVERTIRAN A LIBRAS ***"));
        conver=kilo*librast;
        JOptionPane.showMessageDialog(null,"Los: "+kilo+" kilos"+"\n"+"Convertidas a libras son: "+conver); 
         break;
         
         case "Toneladas a Kilogramos" :
         float ton,cnv,kilg=1000;
        ton=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LAS TONELADAS QUE SE CONVERTIRAN A KILOGRAMOS ***"));
        cnv=ton*kilg;
        JOptionPane.showMessageDialog(null,"Las: "+ton+" toneladas"+"\n"+"Convertidas a kilogramos son: "+cnv); 
         break;
                } 
         break;
         
         case 2:
           
          String conv3[]={"Millas a Kilómetros","Metros a Kilómetros"};
      String case2=(String)(JOptionPane.showInputDialog(null, "Elige una operacion","Unidad de medida" , JOptionPane.DEFAULT_OPTION, null, conv3, conv3[0]));
     
        switch (case2){
        
         case "Millas a Kilómetros" :
        float mill,total,km=1.609f;
        mill=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LAS MILLAS QUE SE CONVERTIRAN A KILOMETROS ***"));
        total=mill*km;
        JOptionPane.showMessageDialog(null,"Las: "+mill+" millas"+"\n"+"Convertidas a kilometros son: "+total); 
         break;
         
         case "Metros a Kilómetros" :
        float met,tot,kmt=1000;
        met=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LAS METROS QUE SE CONVERTIRAN A KILOMETROS ***"));
        tot=met/kmt;
        JOptionPane.showMessageDialog(null,"Los: "+met+" metros"+"\n"+"Convertidas a kilometros son: "+tot); 
         break;
               }
             
          break;
         
          case 3:
           
          String Tipodecambio[]={"Dólares a pesos mexicanos", "Euros a pesos mexicanos"};
      String case3=(String)(JOptionPane.showInputDialog(null, "Elige una operacion", "CONVERSION DE MONEDAS", JOptionPane.DEFAULT_OPTION, null, Tipodecambio, Tipodecambio[0]));
     
        switch (case3){
        
         case "Dólares a pesos mexicanos" :
        float dolar,tota,peso=18.30f;
        dolar=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LOS DOLARES QUE SE CONVERTIRAN A PESOS MEXICANOS ***"));
        tota=dolar*peso;
        JOptionPane.showMessageDialog(null,"Los: "+dolar+" dolares"+"\n"+"Convertidas a pesos mexicanos equivalen a: "+"$"+tota); 
         break;
         
         case "Euros a pesos mexicanos" :
        float euro,convertidos,pes=19.46f;
        euro=Float.parseFloat(JOptionPane.showInputDialog("*** INTRODUCE LOS EUROS QUE SE CONVERTIRAN A PESOS MEXICANOS ***"));
        convertidos=euro*pes;
        JOptionPane.showMessageDialog(null,"Los: "+euro+" euros"+"\n"+"Convertidas a pesos mexicanos equivalen a: "+"$"+convertidos); 
         break;
               }
             
          break;
     
     }
      validacion=JOptionPane.showConfirmDialog(null,"¿Desea continuar?",null,JOptionPane.YES_NO_OPTION);
      
       }while(validacion==JOptionPane.YES_NO_OPTION);   
        
    }
    
}
