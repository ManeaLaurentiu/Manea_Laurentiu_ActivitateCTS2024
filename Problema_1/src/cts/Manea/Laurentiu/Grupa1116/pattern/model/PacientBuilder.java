package cts.Manea.Laurentiu.Grupa1116.pattern.model;

public class PacientBuilder {
    boolean patRabatabil = false;
    boolean micDejunInclus = false;
    boolean papuciCamera = false;
    boolean halatInterior = false;

    public PacientBuilder() {
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    public Pacient build() {
        return new Pacient(this);
    }
}