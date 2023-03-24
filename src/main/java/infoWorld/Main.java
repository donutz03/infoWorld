package infoWorld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bazaDeDatePacienti b = new bazaDeDatePacienti();
        Pacient p = new Pacient("Laurentiu", "Denis", 021212212, 0757575775, "Str. Valea Oltului nr 11", "Str Merisor nr 11, Parc Pipera");
        b.adaugarePacient(p);
        b.modificareCnpPacient(p, 2332);
        Pacient p2 = new Pacient("Mircea", "Mihai", 199221212, 0747444444, "Str Oituz", "Parc Lake");
        b.adaugarePacient(p2);
        System.out.println(b);

        Medicament m = new Medicament("Nurofen", 110, "rotunda", "descriere pastila nurofen", 1234, "20/05/2025", 100);
        Medicament m2 = new Medicament("Xanax", 205, "lunga", "descriere pastila xanax", 9876, "1/1/2026", 1);
        bazaDeDateMedicamente bMedicamente = new bazaDeDateMedicamente();

        bMedicamente.adaugareMedicament(m);
        bMedicamente.adaugareMedicament(m2);
        bMedicamente.modificareDenumireM(m2, "paracetamol");
        System.out.println(bMedicamente);

        Comanda c = new Comanda(p, m);
        Comanda c2 = new Comanda(p, m2);
        Comanda c3 = new Comanda(p2, m2);
        BazaDeDateComenzi comenzi = new BazaDeDateComenzi();
        comenzi.adaugareComanda(c);
        comenzi.adaugareComanda(c2);
        comenzi.adaugareComanda(c3);
        System.out.println(comenzi);




    }
}