package app.cedipro.android;

/**
 * Created by mublan on 26/11/17.
 */

public class FormularioTSL {
    private String fechaEntrada, folio, marca, numEconomico, actMecanica,
            actElectrica, actPaileria, fechaDeseada, fechaReal;

    public FormularioTSL(){

    }

    public FormularioTSL(String fechaEntrada, String folio, String marca, String numEconomico,
                         String actMecanica, String actElectrica, String actPaileria,
                         String fechaDeseada, String fechaReal) {
        this.fechaEntrada = fechaEntrada;
        this.folio = folio;
        this.marca = marca;
        this.numEconomico = numEconomico;
        this.actMecanica = actMecanica;
        this.actElectrica = actElectrica;
        this.actPaileria = actPaileria;
        this.fechaDeseada = fechaDeseada;
        this.fechaReal = fechaReal;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaDeseada() {
        return fechaDeseada;
    }

    public String getFechaReal() {
        return fechaReal;
    }

    public String getFolio() {
        return folio;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumEconomico() {
        return numEconomico;
    }

    public String getActMecanica() {
        return actMecanica;
    }

    public String getActElectrica() {
        return actElectrica;
    }

    public String getActPaileria() {
        return actPaileria;
    }
}