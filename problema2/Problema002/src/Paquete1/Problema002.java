package Paquete1;
import Paquete2.Profesores;
public class Problema002 {

    public static void main(String[] args) {
        Profesores profe1 = new Profesores("Andres", "Hinojosa", 500,
                "2262800079");
        Profesores profe2 = new Profesores("David", "Ordoñez", 520);
        
        System.out.printf("%s\n", profe1);
        System.out.printf("%s\n", profe2);
    }
    
}
