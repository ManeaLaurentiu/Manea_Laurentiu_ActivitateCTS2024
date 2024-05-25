package cts.Manea.Laurentiu.Grupa1116.pattern.model;//F. Companie de transport in comun STB - Problema 8//

public class Autobuz {
    private boolean arePasageri;

    // Constructor și alte metode...

    // Metoda pentru încărcarea pasagerilor în autobuz
    public void incarcaPasageri() {
        // Implementați logica pentru încărcarea pasagerilor în autobuz
        arePasageri = true; // Setăm flagul arePasageri la true
    }

    // Metoda pentru descărcarea pasagerilor din autobuz
    public void descarcaPasageri() {
        // Implementați logica pentru descărcarea pasagerilor din autobuz
        arePasageri = false; // Setăm flagul arePasageri la false atunci când nu mai există pasageri la bord
    }

    // Metoda pentru oprirea într-o stație
    public void opresteInStatie() {
        // Verificăm dacă autobuzul are pasageri la bord
        if (arePasageri) {
            System.out.println("Autobuzul oprește în stație pentru încărcare/descărcare pasageri.");
            // Implementați logica pentru oprirea în stație
        } else {
            System.out.println("Autobuzul nu are pasageri la bord, se retrage la autobază fără a opri în stație.");
            // Implementați logica pentru întoarcerea la autobază fără oprire în stație
        }
    }
}
