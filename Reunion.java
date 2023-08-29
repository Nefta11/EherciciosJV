
public class Reunion {
    int dia,mes,año;
    
   public static void main (String []args){
       //creacion de objeto
       Reunion fecha= new Reunion();
       fecha.dia=3;
       fecha.mes=3;
       fecha.año=2023;
       Reunion fecha2 = new Reunion();
       fecha2.dia=9;
       fecha2.mes=3;
       fecha2.año=2023;
       System.out.println("Fecha "+fecha.dia+" "+fecha.mes+" "+fecha.año);
      System.out.println("Fecha "+fecha2.dia+" "+fecha2.mes+" "+fecha2.año);
   



    }
}
