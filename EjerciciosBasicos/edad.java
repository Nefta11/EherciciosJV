import javax.swing.*;
public class edad {
    public static void main (String[]args){
       String cadena = " ",cadena1 = " ",cadena2 = " ";
       int validacion,eda,cantp=0;
       int mayor = 0,menor = 0,totalmay=0,totalmen=0,sumamay=0,produc=1,med=0,dias,sumadia=0;
       do{
       eda= Integer.parseInt(JOptionPane.showInputDialog("*** INTRODUCE TU EDAD:***"));
        if(eda>=20 && eda<=110){
        mayor++;
        totalmay=eda;
        sumamay=sumamay+eda;
        produc=produc*totalmay;
        med=sumamay/mayor;
        cadena = cadena+totalmay+" A\u00D1OS"+"\n";
       }
       else if(eda<20 && eda>=1){
       menor++;
       totalmen=eda;
       dias=totalmen*365;
       sumadia=sumadia+dias;
       cadena1 = cadena1+totalmen+" A\u00D1OS"+"\n";
       cadena2 = cadena2+dias+" dias vividos."+"\n";
      }
       else{
          JOptionPane.showMessageDialog(null, "NO CUENTA EL REGISTRO");
       }
       validacion=JOptionPane.showConfirmDialog(null,"¿Desea continuar?",null,JOptionPane.YES_NO_OPTION);
      
       }while(validacion==JOptionPane.YES_NO_OPTION); 
       cantp=mayor+menor;
       
  
       JOptionPane.showMessageDialog(null, "INGRESASTE: "+cantp+" PERSONAS"+"\nHAY: "+mayor+" PERSONAS MAYORES DE 20"+"\nHAY: "+menor+" PERSONAS MENORES DE 20");
       JOptionPane.showMessageDialog(null,"LAS EDADES MAYORES A 20 SON:"+"\n"+ cadena+"\nY SUMAN: "+sumamay+" A\u00D1OS"+"\nEL PRODUCTO DE LAS EDADES ES: "+produc+"\nLA MEDIA DE LA EDAD ES: "+med);
        JOptionPane.showMessageDialog(null,"LAS EDADES MENORES A 20 SON:"+"\n"+ cadena1+"\nLOS DIAS VIVIDOS POR CADA EDAD SON:"+"\n"+cadena2+"\nOBTENIENDO UN TOTAL DE: "+sumadia+" DIAS POR LAS EDADES INGRESADAS");
     

    }
   
}