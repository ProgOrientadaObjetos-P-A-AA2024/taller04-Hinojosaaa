package Paquete1;
import Paquete2.EntidadFinanciera;
public class Problema004 {

    public static void main(String[] args) {
        EntidadFinanciera cheque1 = new EntidadFinanciera("Andres Hinojosa",
        "Banco de Loja", 3000);
        EntidadFinanciera cheque2 = new EntidadFinanciera("Banco de Guayaquil",
                2500);
        
        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
    }
    
}
