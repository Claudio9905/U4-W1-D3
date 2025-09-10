package ex1.entities;

public class Rettangolo {

    // Attributi
    private final double altezza;
    private final double larghezza;


    // Costruttori
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;

    }

    // Metodi
    public double areaRettangolo (){
        return this.larghezza * this.altezza;
    }

    public double perimetroRettangolo (){
        return 2*(this.altezza+this.larghezza);
    }

    public void stampaRettangolo(int numRet){
        System.out.println("Area [" + numRet + "] : " + areaRettangolo());
        System.out.println("Perimetro [" + numRet + "] : " + perimetroRettangolo());
    }

    // Metodi Statici
    public static void stampaDueRettangoli(Rettangolo rt1, Rettangolo rt2){
        System.out.println("Area del primo rettangolo: " + rt1.areaRettangolo());
        System.out.println("Perimetro del primo rettangolo: " + rt1.perimetroRettangolo());
        System.out.println("Area del secondo rettangolo: " + rt2.areaRettangolo());
        System.out.println("Perimetro del secondo rettangolo: " + rt2.perimetroRettangolo());

        double sommaArea = rt1.areaRettangolo() + rt2.areaRettangolo();
        double sommaPerimetro = rt1.perimetroRettangolo() + rt2.perimetroRettangolo();
        System.out.println("--------------------------------------------------");
        System.out.println("La somma totale dell'area dei due rettangoli è: [" + sommaArea + "], mentre, la somma totale" +
                " dei perimetri dei due rettangoli è: [" + sommaPerimetro + "]");

    }
}
