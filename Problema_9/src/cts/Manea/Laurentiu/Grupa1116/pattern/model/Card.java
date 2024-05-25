package cts.Manea.Laurentiu.Grupa1116.pattern.model;

public class Card {
    private String numarCard;
    private String pin;
    private double sold;

    public Card(String numarCard, String pin, double sold) {
        this.numarCard = numarCard;
        this.pin = pin;
        this.sold = sold;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public String getPin() {
        return pin;
    }

    public double getSold() {
        return sold;
    }

    public void retrageSold(double suma) {
        if (suma <= sold) {
            sold -= suma;
        } else {
            System.out.println("Fonduri insuficiente.");
        }
    }
}
