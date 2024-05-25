package cts.Manea.Laurentiu.Grupa1116.pattern.model;//D.Banca - Problema 14//

import java.util.Scanner;

public class Bancomat {
    private Card cardCurent;

    public void introduceCard(Card card) {
        this.cardCurent = card;
        System.out.println("Cardul a fost introdus.");
    }

    public boolean introducePin(String pin) {
        if (cardCurent != null && cardCurent.getPin().equals(pin)) {
            System.out.println("PIN corect.");
            return true;
        } else {
            System.out.println("PIN incorect.");
            return false;
        }
    }

    public boolean specificaSuma(double suma) {
        if (cardCurent != null && suma <= cardCurent.getSold()) {
            System.out.println("Suma solicitata: " + suma);
            return true;
        } else {
            System.out.println("Fonduri insuficiente sau card inexistent.");
            return false;
        }
    }

    public void retrageBani(double suma) {
        if (cardCurent != null && suma <= cardCurent.getSold()) {
            cardCurent.retrageSold(suma);
            System.out.println("Retragere realizata: " + suma + " lei.");
        } else {
            System.out.println("Fonduri insuficiente sau card inexistent.");
        }
    }

    public void retrageCard() {
        if (cardCurent != null) {
            System.out.println("Cardul a fost retras.");
            cardCurent = null;
        } else {
            System.out.println("Nu există card de retras.");
        }
    }

    public void procesRetragere(Card card, String pin, double suma) {
        introduceCard(card);

        if (introducePin(pin)) {
            if (specificaSuma(suma)) {
                retrageBani(suma);
                System.out.println("Tranzacție finalizată. Vă rugăm retrageți cardul.");
            } else {
                System.out.println("Tranzacție eșuată. Fonduri insuficiente sau card inexistent.");
            }
        } else {
            System.out.println("Tranzacție eșuată. PIN incorect.");
        }

        retrageCard();
    }
}
