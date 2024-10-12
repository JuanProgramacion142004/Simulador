package autonoma.demosimulador.models;

import autonoma.demosimulador.exepciones.*;


public class Llantas {
    private String tipo;
    private double limitePermitido;

    public Llantas(String tipo, double limitePermitido) {
        this.tipo = tipo;
        this.limitePermitido = limitePermitido;
    }

    public String getTipo() {
        return tipo;
    }

    public double getLimitePermitido() {
        return limitePermitido;
    }
}
