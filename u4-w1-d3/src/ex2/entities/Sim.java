package ex2.entities;

import java.util.Arrays;

public class Sim {

    // Attributi
    private int numTelefono;
    private double creditoDisponibile;
    private Chiamata[] chiamate;


    //Costruttori
    public Sim(int numTelefono) {
        this.numTelefono = numTelefono;
        this.creditoDisponibile = 0;
        this.chiamate = new Chiamata[]{};
    }

    //Metodi


    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaDatiSim(){
        System.out.println("Dati della Sim: ");
        System.out.println("Numero di telefono: [" + this.numTelefono + "]");
        System.out.println("Credito Disponibile: [€ " + this.creditoDisponibile + "]");
        System.out.println("Credito Disponibile: [" + Arrays.toString(this.chiamate) + "]");
    }
}