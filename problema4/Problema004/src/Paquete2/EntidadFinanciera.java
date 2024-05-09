package Paquete2;

public class EntidadFinanciera {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public EntidadFinanciera(String nC, String nB, double vC){
        nombreCliente = nC;
        nombreBanco = nB;
        valorCheque = vC;
    }
    
    public EntidadFinanciera(String nB, double vC){
        nombreCliente = "David Ordoñez";
        nombreBanco = nB;
        valorCheque = vC;
    }
    
    public void establecerNombreC(String x){
        nombreCliente = x;
    }
    
    public void establecerNombreB(String x){
        nombreBanco = x;
    }
    
    public void establecerCheque(double x){
        valorCheque = x;
    }
    
    public void calcularComision(){
        comisionBanco = valorCheque * 0.00003;
    }
    
    String obtenerNombreC(){
        return nombreCliente;
    }
    
    String obtenerNombreB(){
        return nombreBanco;
    }
    
    double obtenerCheque(){
        return valorCheque;
    }
    
    double obtenerComision(){
        return comisionBanco;
    }
    
   public String toString(){
       String cadena = String.format("Datos del cheque\n"
               + "Nombre del cliente: %s\n"
               + "Nombre del banco: %s\n"
               + "Valor del cheque: %.2f\n"
               + "Comision del banco: %.2f\n",
               obtenerNombreC(),
               obtenerNombreB(),
               obtenerCheque(),
               obtenerComision());
       return cadena;
   }
}
