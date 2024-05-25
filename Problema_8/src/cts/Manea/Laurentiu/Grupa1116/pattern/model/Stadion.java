package cts.Manea.Laurentiu.Grupa1116.pattern.model;

import java.util.LinkedList;
import java.util.Queue;

public class Stadion {
    private Queue<Persoana> coada;

    public Stadion() {
        this.coada = new LinkedList<>();
    }

    public void aseazaLaCoada(Persoana persoana) {
        coada.add(persoana);
        System.out.println(persoana.getNume() + " s-a așezat la coadă.");
    }

    public void prezintaBiletul(Persoana persoana) {
        System.out.println(persoana.getNume() + " prezintă biletul.");
    }

    public void controlCorporal(Persoana persoana) {
        System.out.println(persoana.getNume() + " trece prin controlul corporal.");
    }

    public void intraInStadion(Persoana persoana) {
        System.out.println(persoana.getNume() + " intră în stadion.");
    }

    public void ocupaLocul(Persoana persoana) {
        System.out.println(persoana.getNume() + " își ocupă locul.");
    }

    public void procesareIntrare() {
        boolean primaPersoana = true; // Indicator pentru prima persoană din coadă

        while (!coada.isEmpty()) {
            Persoana persoana = coada.poll();
            prezintaBiletul(persoana);
            controlCorporal(persoana);
            intraInStadion(persoana);
            if (primaPersoana) {
                System.out.println("Mesaj de sustinere pentru echipa gazda: <Mesaj de sustinere>");
                primaPersoana = false; // Setează indicatorul ca fiind fals după ce s-a afișat mesajul pentru prima persoană
            }
            ocupaLocul(persoana);
            System.out.println(persoana.getNume() + " a terminat procesul de intrare.");
        }
    }


}