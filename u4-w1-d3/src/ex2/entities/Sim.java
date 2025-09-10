package ex2.entities;

import java.util.Arrays;

public class Sim {

    // Attributi
    private int numTelefono;
    private double creditoDisponibile;
    private Chiamata[] chiamate;
    private int chiamateInserite;



    //Costruttori
    public Sim(int numTelefono) {
        this.numTelefono = numTelefono;
        this.creditoDisponibile = 0;
        this.chiamate = new Chiamata[5];
    }

    //Metodi
    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numTelefono=" + numTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }
}