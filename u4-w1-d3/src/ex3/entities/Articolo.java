package ex3.entities;

public class Articolo {

    // Attributi
    private  String codArticolo;
    private  String descArticolo;
    private  double prezzo;
    private  int numPezzi;

    // Costruttori
    public Articolo(String codArticolo, String descArticolo, double prezzo, int numPezzi){
        this.codArticolo = codArticolo;
        this.descArticolo = descArticolo;
        this.prezzo = prezzo;
        this.numPezzi = numPezzi;
    }

    // Metodi


    public double getPrezzo() {
        return prezzo;
    }

    public double totPrezzo(double prezzo){
        double tot = 0;
        tot += prezzo;
        return tot;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codArticolo='" + codArticolo + '\'' +
                ", descArticolo='" + descArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", numPezzi=" + numPezzi +
                '}' + "\n";
    }
}
