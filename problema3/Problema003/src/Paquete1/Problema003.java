package Paquete1;
import Paquete2.Automotor;
public class Problema003 {

    public static void main(String[] args) {
        Automotor auto1 = new Automotor("1151700968", "Nissan", 2006,
        12000);
        Automotor auto2 = new Automotor("Toyota", 2011,16000);
        
        System.out.printf("%s\n", auto1);
        System.out.printf("%s\n", auto2);
    }
    
}
