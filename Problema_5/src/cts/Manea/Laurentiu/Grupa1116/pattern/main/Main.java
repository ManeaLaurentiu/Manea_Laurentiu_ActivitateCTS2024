package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS.
//Trebuie implementat modulul dintr-un validator calatorie care sa permita plata calatoriei printruna din cele trei metode. Calatorul va decide modul de plata atunci cand se urca in mijlocul de
//transport.//

import cts.Manea.Laurentiu.Grupa1116.patter.model.MetodaPlata;
import cts.Manea.Laurentiu.Grupa1116.patter.model.ValidatorCalatorie;
public class Main {
    public static void main(String[] args) {
        // Creăm un obiect de tip ValidatorCalatorie
        ValidatorCalatorie validator = new ValidatorCalatorie();

        // Călătorul alege metoda de plată la urcarea în mijlocul de transport
        MetodaPlata metodaPlataAleasa = MetodaPlata.CARD_BANCAR;

        // Călătorul plătește călătoria folosind metoda aleasă
        validator.platesteCalatoria(metodaPlataAleasa);
    }
}
