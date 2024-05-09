package Paquete2;

public class Automotor {
    
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor(String c, String m, int a, double vV){
        cedulaDuenio = c;
        marcaVehiculo = m;
        anioFabricacion = a;
        valorVehiculo = vV;
    }
    
    public Automotor(String m, int a, double vV){
        cedulaDuenio = "1151700968";
        marcaVehiculo = m;
        anioFabricacion = a;
        valorVehiculo = vV;
    }
    
    public void establecerCedula(String x){
        cedulaDuenio = x;
    }
    
    public void establecerMarca(String x){
        marcaVehiculo = x;
    }
    
    public void establecerAnio(int x){
        anioFabricacion = x;
    }
    
    public void establecerValorV(double x){
        valorMatricula = x;
    }
    
    public void establecerValorM(){
        valorMatricula = valorVehiculo * anioFabricacion * (0.00002);
    }
    
    public String obtenerCedula(){
        return cedulaDuenio;
    }
    
    public String obtenerMarca(){
        return marcaVehiculo;
    }
    
    public int obtenerAnio(){
        return anioFabricacion;
    }
    
    public double obtenerValorV(){
        return valorVehiculo;
    }
    
    public double obtenerValorM(){
        return valorMatricula;
    }
    
    public String toString(){
        String cadena = String.format("Vehiculo Automotor\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValorV(),
                obtenerValorM());
        return cadena;
    }
}
