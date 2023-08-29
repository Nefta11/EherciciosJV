import javax.swing.*; //NEFTALI ARTURO HERNANDEZ VERGARA
public class cadenas {
    public static void main (String[] args){
        String nombre="Neftali Hernandez", saludo="-   HOLA BOBO";
        String nombre2=nombre.replace("a", "e");//Remplazo del espacio para que no quede el espacio y no lo cuente en el de abajo.
        
        // Metodo .length que define la longitud(TAMAÑO) de una cadena(contando el espacio)
        JOptionPane.showMessageDialog(null,nombre2.length()+nombre.replaceAll(nombre, "Arturo Vergara")); //.REPLACEALL ESTE METODO REMPLAZA LA CADENA DE TEXTO POR OTRO
         JOptionPane.showMessageDialog(null,nombre.toUpperCase()); //convierte string para mayusculas
         JOptionPane.showMessageDialog(null,nombre.toLowerCase()); //convierte string para minusculas
          
         JOptionPane.showMessageDialog(null,nombre.charAt(0)+nombre.charAt(1)+"*"+nombre.charAt(2));//muestra la suma de los caracteres en codigo aski, si pones espacio("") ya te muestra la letra.
         JOptionPane.showMessageDialog(null,nombre.indexOf('e'));//Este sirve para mostrar el numero que tiene asignado en posicion en la letra.
        JOptionPane.showMessageDialog(null,saludo.trim());// sirve para eliminar espacios(1) del principio de texto y el final.
    }
    
}
