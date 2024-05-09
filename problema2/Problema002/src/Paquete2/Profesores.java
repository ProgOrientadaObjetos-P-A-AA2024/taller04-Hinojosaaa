package Paquete2;

public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesores(String n, String a, double sB, String c){
        nombre = n;
        apellido = a;
        sueldoBasico = sB;
        cedula = c;
    }
    
    public Profesores(String n, String a, double sB){
        nombre = n;
        apellido = a;
        sueldoBasico = sB;
        cedula = "1151700968";
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerSueldoB(double x) {
        sueldoBasico = x;
    }

    public void establecerSueldoT() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    String obtenerNombre() {
        return nombre;
    }

    String obtenerApellido() {
        return apellido;
    }

    double obtenerSueldoB() {
        return sueldoBasico;
    }

    double obtenerSueldoT() {
        return sueldoTotal;
    }

    String obtenerCedula() {
        return cedula;
    }

    public String toString(){
        String cadena = String.format("Lista de Profesores\n"
                + "Nombre del Profesor: %s\n"
                + "Apellido del Profesor: %s\n"
                + "Sueldo basico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cedula de Identidad: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoB(),
                obtenerSueldoT(),
                obtenerCedula());
        return cadena;
    }
}
