package cts.Manea.Laurentiu.Grupa1116.patern.main;

//2. Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse. Din acest motiv
//trebuie propusa o varianta prin care daca exista deja un obiect creat, sa fie folosit acest obiect
//pentru viitoarele obiecte, fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz.
//Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.//

import cts.Manea.Laurentiu.Grupa1116.patter.model.Autobuz;

public class Main {
    public static void main(String[] args) {
        // Obținem instanța unică a clasei Autobuz
        Autobuz autobuz1 = Autobuz.getInstance();
        // Folosim aceeași instanță pentru alte operații
        Autobuz autobuz2 = Autobuz.getInstance();

        // Verificăm dacă cele două referințe pointează către aceeași instanță
        if (autobuz1 == autobuz2) {
            System.out.println("Cele două referințe sunt către aceeași instanță de Autobuz.");
        } else {
            System.out.println("Cele două referințe nu sunt către aceeași instanță de Autobuz.");
        }
    }
}