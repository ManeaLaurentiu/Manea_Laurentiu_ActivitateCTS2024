package cts.Manea.Laurentiu.Grupa1116.pattern.model;

public class AutobuzGrupMic extends Autobuz {
    public AutobuzGrupMic(String producator, String model) {
        super(producator, model, 10); // Setăm implicit numărul de locuri pentru grupul mic
    }
}
