
package autonoma.demosimulador.main;

/*
 * autor : Juan David Arcila Restrepo
 */
import autonoma.demosimulador.models.*;
import autonoma.demosimulador.exepciones.*;
import java.util.Scanner;

public class DemoSimulador {
    public static void main(String[] args) {
        // Crear las llantas y el motor del vehículo
        Llantas llantas = new Llantas("Bonitas", 70);
        Motor motor = new Motor("3000 cc", 220);

        // Crear el vehículo
        Vehiculo vehiculo = new Vehiculo(llantas, motor);

        // Crear el simulador
        Simulador simulador = new Simulador(vehiculo);

        // Iniciar la simulación
        simulador.iniciarSimulacion();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Encender vehículo");
            System.out.println("2. Acelerar vehículo");
            System.out.println("3. Frenar vehículo");
            System.out.println("4. Apagar vehículo");
            System.out.println("5. Mostrar estado del vehículo");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        vehiculo.encender();
                        System.out.println("Vehículo encendido.");
                    } catch (ExcepcionVehiculoEncendido e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Introduce la cantidad de aceleración en Km/h: ");
                    double aceleracion = scanner.nextDouble();
                    simulador.realizarAccion("acelerar", aceleracion);
                    break;

                case 3:
                    System.out.print("Introduce la cantidad de frenado en Km/h: ");
                    double frenado = scanner.nextDouble();
                    simulador.realizarAccion("frenar", frenado);
                    break;

                case 4:
                    try {
                        vehiculo.apagar();
                        System.out.println("Vehículo apagado.");
                    } catch (ExcepcionVehiculoApagado e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    simulador.mostrarEstadoVehiculo();
                    break;

                case 6:
                    salir = true;
                    System.out.println("Saliendo de la simulación...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
