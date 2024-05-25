package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//Intrarea pe stadion si ocuparea locurilor se face pentru toata lumea la fel urmând pașii: Se
//așază la coada, Se prezinta biletul, Se face controlul corporal, Se intra in stadion, Se ocupa locul.
//Sa se realizeze modulul care simulează în aplicație procesul de intrare pe stadion și de ocupare a
//locurilor.//

import cts.Manea.Laurentiu.Grupa1116.pattern.model.Persoana;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.Stadion;

public class Main {
    public static void main(String[] args) {
        Stadion stadion = new Stadion();

        Persoana persoana1 = new Persoana("Ion Popescu");
        Persoana persoana2 = new Persoana("Maria Ionescu");
        Persoana persoana3 = new Persoana("George Vasile");

        stadion.aseazaLaCoada(persoana1);
        stadion.aseazaLaCoada(persoana2);
        stadion.aseazaLaCoada(persoana3);

        stadion.procesareIntrare();
    }
}
