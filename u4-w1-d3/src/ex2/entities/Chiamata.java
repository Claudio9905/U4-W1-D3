package ex2.entities;

public class Chiamata {
    // Attributi
    private String numChiamato;
    private int durata;

    //Costruttori
    public Chiamata(String numChiamato, int durata){
        this.numChiamato = numChiamato;
        this.durata = durata;
    }

    //Metodi

    @Override
    public String toString() {
        return "Chiamata: { " +
                " Numero Chiamato : " + numChiamato +
                ", Durata della chiamata : " + durata +
                " m" + " }";
    }
}
