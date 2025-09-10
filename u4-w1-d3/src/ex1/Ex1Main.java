package ex1;

import ex1.entities.Rettangolo;

import java.util.Scanner;

import static ex1.entities.Rettangolo.stampaDueRettangoli;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alt1 = 0;
        double l1 = 0;
        double alt2 = 0;
        double l2 = 0;

        System.out.println("Inserisci l'altezza del primo rettangolo: ");
        alt1 = scanner.nextDouble();
        System.out.println("Inserisci la larghezza del primo rettangolo: ");
        l1 = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del secondo rettangolo: ");
        alt2 = scanner.nextDouble();
        System.out.println("Inserisci la larghezza del secondo rettangolo: ");
        l2 = scanner.nextDouble();

        Rettangolo rettangolo1 = new Rettangolo(alt1,l1);
        Rettangolo rettangolo2 = new Rettangolo(alt2,l2);

        // Primo Rettangolo
        rettangolo1.stampaRettangolo(1);
        // Secondo Rettangolo
        rettangolo2.stampaRettangolo(2);

        System.out.println("-------------------------------------------");

        // Entrambi i rettangoli
        stampaDueRettangoli(rettangolo1,rettangolo2);

        scanner.close();
    }
}
