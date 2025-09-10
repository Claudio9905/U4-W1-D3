package ex2;

import ex2.entities.Chiamata;
import ex2.entities.Sim;

import java.util.Random;


public class Ex2Main {
    public static void main(String[] args) {

        Random rdmNumber = new Random();
        Random rdmCredito = new Random();
        //Random rdmDurata = new Random();

        int numTelefono = rdmNumber.nextInt(0,1000000000);
        double credito = Math.floor(rdmCredito.nextDouble(0,20)*100)/100;
        //int durataCall = rdmDurata.nextInt(0,60);

        Sim cliente1 = new Sim(numTelefono);

        cliente1.setCreditoDisponibile(credito);

        Chiamata[] cliente1Call = {new Chiamata("3349963080",40),
                new Chiamata("3356789645", 10),
                new Chiamata("0817742330", 2),
                new Chiamata("3356785431", 30),
                new Chiamata("0812347864", 4),
                };

        cliente1.setChiamate(cliente1Call);

        System.out.println(cliente1);


    }
}
