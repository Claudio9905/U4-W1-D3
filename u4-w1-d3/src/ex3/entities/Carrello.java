package ex3.entities;

import java.util.Arrays;

public class Carrello {

    // Attributi
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totCostoArticoli;

    //Costruttori
    public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli){
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totCostoArticoli = 0.0;
    }

    // Metodi
    public void setTotCostoArticoli(double totCostoArticoli) {
        this.totCostoArticoli = totCostoArticoli;
    }

    @Override
    public String toString() {
        return "Carrello: { " +
                "clienteAssociato=" + clienteAssociato +
                "elencoArticoli=" + Arrays.toString(elencoArticoli) +
                "\n totCostoArticoli=" + totCostoArticoli +
                " }" + "\n";
    }
}
