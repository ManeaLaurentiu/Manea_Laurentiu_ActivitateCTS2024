package cts.Manea.Laurentiu.Grupa1116.pattern.main;

// 8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane
//in autobuz. In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se
//implementeze modul care va permite oprirea in statie a autobuzelor doar daca exista calatori in
//autobuz.//

import cts.Manea.Laurentiu.Grupa1116.pattern.model.Autobuz;
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(); // Creăm o instanță de autobuz

        // Simulăm încărcarea pasagerilor în autobuz
        autobuz.incarcaPasageri();

        // Simulăm oprirea într-o stație
        autobuz.opresteInStatie();
    }
}
