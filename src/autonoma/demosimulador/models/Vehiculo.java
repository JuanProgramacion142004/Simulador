///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package autonoma.demosimulador.models;

import autonoma.demosimulador.exepciones.*;
//
///**
// *
// * @author theBL
// */
//public class Vehiculo {
//
////    atributos
//    private double velocidad;
//    private Motor motor;
//
////    constructor
//    public Vehiculo(Motor motor) {
//        this.velocidad = 0;
//        this.motor = motor;
//    }
//
////    metodos de acceso
//    public double getVelocidad() {
//        return velocidad;
//    }
//
//    public void setVelocidad(double velocidad) {
//        this.velocidad = velocidad;
//    }
//
//    public Motor getMotor() {
//        return motor;
//    }
//
//    public void setMotor(Motor motor) {
//        this.motor = motor;
//    }
//
//    
////    metodos
//    public void encender() {
//        this.motor.encender();
//
//    }
//
//    public void apagar() {
//        this.motor.encender();
//
//    }
//
//    public void acelerar(double velocidad) throws LimiteMotorException {
//        double nVelocidad = this.velocidad + velocidad;
//        this.motor.validarVeocidadMaxima(nVelocidad);
//        this.setVelocidad(nVelocidad);
//    }
//
//    public void accidentarVehiculo() {
//        this.setVelocidad(0);
//        this.apagar();
//    }
//}
public class Vehiculo {
    private boolean encendido;
    private double velocidad;
    private boolean detenido;
    private Llantas llantas;
    private Motor motor;

    public Vehiculo(Llantas llantas, Motor motor) {
        this.llantas = llantas;
        this.motor = motor;
        this.velocidad = 0.0;
        this.detenido = true;
        this.encendido = false;
    }

    public void encender() throws ExcepcionVehiculoEncendido {
        if (encendido) {
            throw new ExcepcionVehiculoEncendido("El vehículo ya está encendido.");
        }
        encendido = true;
    }

    public void apagar() throws ExcepcionVehiculoApagado {
        if (!encendido) {
            throw new ExcepcionVehiculoApagado("El vehículo ya está apagado.");
        }
        encendido = false;
    }

    public void acelerar(double cantidad) throws ExcepcionAccidente, ExcepcionVehiculoApagado {
        if (!encendido) {
            throw new ExcepcionVehiculoApagado("No se puede acelerar un vehículo apagado.");
        }
        velocidad += cantidad;
        if (velocidad > motor.getVelocidadMaxima()) {
            throw new ExcepcionAccidente("El vehículo ha excedido la capacidad del motor y se accidentó.");
        }
    }

    public void frenar(double cantidad) throws ExcepcionPatinaje {
        if (cantidad > 30) {
            throw new ExcepcionPatinaje("Frenado brusco, el vehículo podría patinar.");
        }
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0;
    }

    public String obtenerEstado() {
        return encendido ? "Encendido" : "Apagado";
    }

    public double obtenerVelocidad() {
        return velocidad;
    }
}
