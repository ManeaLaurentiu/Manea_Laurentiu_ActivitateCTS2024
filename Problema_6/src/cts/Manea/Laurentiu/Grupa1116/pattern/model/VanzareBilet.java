package cts.Manea.Laurentiu.Grupa1116.pattern.model;//E. Sportiv - Problema 8//



public class VanzareBilet {
    // Metoda pentru vânzarea biletului condiționată de vârsta clientului
    public void vindeBilet(Client client) {
        if (client.getVarsta() >= 14) {
            System.out.println("Bilet vandut cu succes!");
        } else {
            System.out.println("Vânzarea biletului este restricționată persoanelor sub 14 ani.");
        }
    }
}