package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//Retragerile de bani de la bancomat se fac după următorii pași: se introduce cardul, se introduce
//pinul, se specifica suma solicitata, se retrag banii din bancomat și la final se retrage cardul. Sa se
//implementeze modulul care realizează acest algoritm.//


import cts.Manea.Laurentiu.Grupa1116.pattern.model.Bancomat;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.Card;

public class Main {
    public static void main(String[] args) {
        // Creăm un obiect de tip card
        Card card = new Card("1234-5678-9012-3456", "1234", 1000.0);

        // Creăm un obiect de tip bancomat
        Bancomat bancomat = new Bancomat();

        // Simulăm procesul de retragere a banilor de la bancomat
        bancomat.procesRetragere(card, "1234", 500.0);
    }
}
