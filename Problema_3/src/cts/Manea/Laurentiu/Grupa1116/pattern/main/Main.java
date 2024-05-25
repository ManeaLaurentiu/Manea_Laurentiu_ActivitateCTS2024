package cts.Manea.Laurentiu.Grupa1116.pattern.main;

// 6. Pentru a gestiona garanția asigurată pentru fiecare autobuz disponibil în cadrul flotei companiei,
//se dorește implementrea unei soluții ce permite vizualizarea fiecărui autobuz în funcție de tipul
//acestuia si grupul pentru care este destinat. Structura definește o ierarhie între tipurile de autobuze
//din flotă, grupate pe dimensiunea acestora (grupuri mici – 10 locuri, grupuri medii – 30 locuri,
//grupuri mari – 50 locuri). Fiecare autobuz este descris de producător, model si număr de locuri.


import cts.Manea.Laurentiu.Grupa1116.pattern.model.Autobuz;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.AutobuzGrupMic;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.AutobuzGrupMediu;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.AutobuzGrupMare;
public class Main {
    public static void main(String[] args) {
        // Creăm autobuze de diferite dimensiuni
        Autobuz autobuzMic = new AutobuzGrupMic("Mercedes", "Sprinter");
        Autobuz autobuzMediu = new AutobuzGrupMediu("Volvo", "XC90");
        Autobuz autobuzMare = new AutobuzGrupMare("MAN", "Lion's Coach");

        // Putem accesa informațiile comune și specifice pentru fiecare tip de autobuz
        System.out.println("Detalii autobuz mic: " + autobuzMic.getProducator() + ", " + autobuzMic.getModel() + ", " + autobuzMic.getNumarLocuri());
        System.out.println("Detalii autobuz mediu: " + autobuzMediu.getProducator() + ", " + autobuzMediu.getModel() + ", " + autobuzMediu.getNumarLocuri());
        System.out.println("Detalii autobuz mare: " + autobuzMare.getProducator() + ", " + autobuzMare.getModel() + ", " + autobuzMare.getNumarLocuri());
    }
}
