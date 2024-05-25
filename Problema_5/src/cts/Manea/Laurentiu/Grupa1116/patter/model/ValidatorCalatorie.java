package cts.Manea.Laurentiu.Grupa1116.patter.model;//F. Companie de transport in comun STB - Problema 10//


public class ValidatorCalatorie {
    // Metoda pentru plata călătoriei
    public void platesteCalatoria(MetodaPlata metodaPlata) {
        switch (metodaPlata) {
            case CARD_CALATORII:
                // Implementați logica pentru plata cu cardul de călătorii
                System.out.println("Plata călătoriei efectuată cu succes folosind cardul de călătorii.");
                break;
            case CARD_BANCAR:
                // Implementați logica pentru plata cu cardul bancar
                System.out.println("Plata călătoriei efectuată cu succes folosind cardul bancar.");
                break;
            case PLATA_SMS:
                // Implementați logica pentru plata prin SMS
                System.out.println("Plata călătoriei efectuată cu succes folosind plata prin SMS.");
                break;
            default:
                System.out.println("Metoda de plată aleasă nu este validă.");
        }
    }
}