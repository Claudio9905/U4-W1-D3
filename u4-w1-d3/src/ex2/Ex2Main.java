package ex2;

import ex2.entities.Chiamata;
import ex2.entities.Sim;

import java.util.Random;


public class Ex2Main {
    public static void main(String[] args) {

        Random rdmNumber = new Random();
        Random rdmCredito = new Random();
        Random rdmDurata = new Random();

        int numTelefono = rdmNumber.nextInt(0,1000000000);
        double credito = Math.floor(rdmCredito.nextDouble(0,20)*100)/100;
        int durataCall = rdmDurata.nextInt(0,60);

        Sim cliente1 = new Sim(numTelefono);
        Chiamata cliente1Call = new Chiamata(numTelefono, durataCall);

        cliente1.setCreditoDisponibile(credito);


        cliente1.stampaDatiSim();


    }
}
