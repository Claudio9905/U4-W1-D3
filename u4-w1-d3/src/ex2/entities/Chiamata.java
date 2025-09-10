package ex2.entities;

public class Chiamata {
    // Attributi
    private int numChiamato;
    private int durata;

    //Costruttori
    public Chiamata(int numChiamato, int durata){
        this.numChiamato = numChiamato;
        this.durata = durata;
    }

    //Metodi

    @Override
    public String toString() {
        return "Chiamata: " +
                "numChiamato=" + numChiamato +
                ", durata=" + durata +
                " m";
    }
}
