package cts.Manea.Laurentiu.Grupa1116.pattern.model;

public class AutobuzLinie {
    private final String modelAutobuz;
    private final String sofer;
    private final boolean opririLaCapat;
    private final boolean deschidereUsiAutomata;
    private final String textEcranDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean opririLaCapat, boolean deschidereUsiAutomata, String textEcranDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.opririLaCapat = opririLaCapat;
        this.deschidereUsiAutomata = deschidereUsiAutomata;
        this.textEcranDerulator = textEcranDerulator;
    }

    // Metode pentru a accesa atributele (getter methods)

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean areOpririLaCapat() {
        return opririLaCapat;
    }

    public boolean areDeschidereUsiAutomata() {
        return deschidereUsiAutomata;
    }

    public String getTextEcranDerulator() {
        return textEcranDerulator;
    }
}