package cts.Manea.Laurentiu.Grupa1116.pattern.model;


public class Autobuz {
    private String producator;
    private String model;
    private int numarLocuri;

    // Constructor
    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }


    public String getProducator() {
        return producator;
    }

    public String getModel() {
        return model;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }



}






