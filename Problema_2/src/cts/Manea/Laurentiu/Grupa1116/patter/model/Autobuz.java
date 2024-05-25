package cts.Manea.Laurentiu.Grupa1116.patter.model;
public class Autobuz {
    // Instanța unică a clasei
    private static Autobuz instance;

    // Constructor privat pentru a împiedica crearea de instanțe directe
    private Autobuz() {
        // Inițializare
    }

    // Metodă statică pentru obținerea instanței unice
    public static Autobuz getInstance() {
        // Dacă instanța nu există, o creăm
        if (instance == null) {
            instance = new Autobuz();
        }
        // Returnăm instanța existentă sau nou creată
        return instance;
    }

    // Metodele clasei Autobuz
    public void incarcaPasageri() {
        // Logica pentru încărcarea pasagerilor
    }

    // Alte metode specifice autobuzului
}