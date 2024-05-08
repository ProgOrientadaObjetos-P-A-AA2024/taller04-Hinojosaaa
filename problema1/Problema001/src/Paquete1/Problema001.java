package Paquete1;
import Paquete2.LibretaNotas;
public class Problema001 {

    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Andres", 10, 10, 10);
        libreta1.calcularPromedio();
        LibretaNotas libreta2 = new LibretaNotas("David", 10, 10, 9);
        libreta2.calcularPromedio();
        
        
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);

    }
    
}
