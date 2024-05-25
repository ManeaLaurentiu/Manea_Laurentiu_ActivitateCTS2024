package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//Pentru obiectele de tipul AutobuzLinie se doreste ca in momentul in care au fost create obiectele
//de acest tip sa nu mai poata fi modificate. De asemenea pentru crearea unui obiect de tipul
//AutobuzLinie trebuie precizat modelul de autobuz folosit, soferul care il va conduce, daca va avea
//opriri la capat de linie, daca deschide usile in fiecare statie fara ca pasagerii sa solicite acest lucru,
//textul afisat de ecranul derulator si alte elemente. Unele atribute sunt optionale avand o valoare
//prestabilita. Se doreste implementarea modulului care se va ocupa de initializarea acestor obiecte,
//nefiind necesara introducerea atributelor optionale, iar obiectul odata creat sa nu mai poata fi
//modificat.//

import cts.Manea.Laurentiu.Grupa1116.pattern.model.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect de tip AutobuzLinie folosind constructorul
        AutobuzLinie autobuz = new AutobuzLinie("Model1", "Sofer1", true, true, "Text1");

        // Accesarea atributelor obiectului creat
        System.out.println("Modelul autobuzului: " + autobuz.getModelAutobuz());
        System.out.println("Soferul autobuzului: " + autobuz.getSofer());
        System.out.println("Are opriri la capăt de linie: " + autobuz.areOpririLaCapat());
        System.out.println("Are deschidere automată a ușilor: " + autobuz.areDeschidereUsiAutomata());
        System.out.println("Textul afișat de ecranul derulator: " + autobuz.getTextEcranDerulator());
    }
}
