package autonoma.demosimulador.exepciones;

public class ExcepcionVehiculoEncendido extends RuntimeException {
    public ExcepcionVehiculoEncendido(String mensaje) {
        super(mensaje);
    }
}
