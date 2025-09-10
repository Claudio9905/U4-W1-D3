package ex3;

import ex3.entities.Articolo;
import ex3.entities.Carrello;
import ex3.entities.Cliente;

public class Ex3Main {
    public static void main(String[] args) {

        Articolo articolo1 = new Articolo("FS345ER2", "Tv", 450, 1 );
        Cliente cliente1 = new Cliente("FR342GT4", "Claudio", "Postiglione","cloudpost10@gmail.com","26/05/2025");
        double totPrezzoArt = articolo1.totPrezzo(articolo1.getPrezzo());

        Carrello carrello1 = new Carrello(cliente1, new Articolo[]{articolo1});
        carrello1.setTotCostoArticoli(totPrezzoArt);
        System.out.println(carrello1);
    }
}
