package cts.Manea.Laurentiu.Grupa1116.pattern.model;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    // Constructor cu acces de pachet
    Pacient(PacientBuilder builder) {
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }

    // Getters
    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public boolean isHalatInterior() {
        return halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }
}