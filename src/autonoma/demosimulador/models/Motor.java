///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package autonoma.demosimulador.models;

import autonoma.demosimulador.exepciones.*;
//
/*
 * autor : Juan David Arcila Restrepo
 */
//public class Motor {
//
////    atributos
//    private boolean encendido;
//    private double velocidadMaxima;
//    private int cilindraje;
//
////    constructor
//    public Motor(double velocidadMaxima, int cilindraje) {
//        this.encendido = false;
//        this.velocidadMaxima = velocidadMaxima;
//        this.cilindraje = cilindraje;
//    }
////    set and get 
//
//    public boolean isEncendido() {
//        return encendido;
//    }
//
//    public void setEncendido(boolean encendido) {
//        this.encendido = encendido;
//    }
//
//    public double getVelocidadMaxima() {
//        return velocidadMaxima;
//    }
//
//    public void setVelocidadMaxima(double velocidadMaxima) {
//        this.velocidadMaxima = velocidadMaxima;
//    }
//
//    public int getCilindraje() {
//        return cilindraje;
//    }
//
//    public void setCilindraje(int cilindraje) {
//        this.cilindraje = cilindraje;
//    }
//
////    metodos
//    public void encender() {
//        this.encendido = true;
//    }
//
//    public void apagar() {
//        this.encendido = false;
//    }
////    Validacion Velocidad Maxima
//
//    public void validarVeocidadMaxima(double velocidad) throws LimiteMotorException{
//        if(velocidad > this.velocidadMaxima){
//            throw new LimiteMotorException();
//        }
//    }
//}

/*
 * autor : Juan David Arcila Restrepo
 */
public class Motor {
    private String cilindraje;
    private double velocidadMaxima;

    public Motor(String cilindraje, double velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
