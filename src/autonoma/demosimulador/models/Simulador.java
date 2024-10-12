///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package autonoma.demosimulador.models;
//
import autonoma.demosimulador.exepciones.*;
//
///**
// *
// * @author theBL
// */
//public class Simulador {
//
////    atributos
//    private Vehiculo vehiculo;
//
////    constructor
//    public Simulador(Vehiculo vehiculo) {
//        this.vehiculo = vehiculo;
//    }
//
////    get velocidad
//    public double getvelocidadVehiculo() {
//        return this.vehiculo.getVelocidad();
//    }
//
////    metodos
//    public void encenderVehiculo() {
//        this.vehiculo.encender();
//    }
//
//    public void apagarVehiculo() {
//        this.vehiculo.apagar();
//    }
//
//    public void acelerarVehiculo(double velocidad) {
//        try {
//            this.vehiculo.acelerar(velocidad);
//        } catch (LimiteMotorException e) {
//            this.vehiculo.accidentarVehiculo();
//            throw e;
//        }
//
//    }
//}

/*
 * autor : Juan David Arcila Restrepo
 */
public class Simulador {
    private Vehiculo vehiculo;

    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void iniciarSimulacion() {
        System.out.println("Simulación iniciada.");
    }

    public void realizarAccion(String accion, double cantidad) {
        try {
            switch (accion) {
                case "acelerar":
                    vehiculo.acelerar(cantidad);
                    break;
                case "frenar":
                    vehiculo.frenar(cantidad);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarEstadoVehiculo() {
        System.out.println("Estado del vehículo: " + vehiculo.obtenerEstado());
        System.out.println("Velocidad actual: " + vehiculo.obtenerVelocidad() + " Km/h");
    }
}
