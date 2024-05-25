package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//Pentru un meci de fotbal se ia decizia ca biletele sa fie vândute doar pentru persoanele care au
//minim 14 ani. Sa se implementeze un modul intermediar pentru clasa VanzareBilet prin care
//vânzarea de bilete sa fie condiționată de vârsta clientului. //

import cts.Manea.Laurentiu.Grupa1116.pattern.model.VanzareBilet;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.Client;
public class Main {
    public static void main(String[] args) {
        // Creăm un client cu vârsta de 16 ani
        Client client1 = new Client(16);

        // Creăm un client cu vârsta de 12 ani
        Client client2 = new Client(12);

        // Creăm un obiect de tip VanzareBilet
        VanzareBilet vanzareBilet = new VanzareBilet();

        // Vânzăm bilete pentru cei doi clienți
        vanzareBilet.vindeBilet(client1); // Ar trebui să reușim vânzarea biletului pentru clientul cu vârsta de 16 ani
        vanzareBilet.vindeBilet(client2); // Ar trebui să primim un mesaj de restricționare pentru clientul cu vârsta de 12 ani
    }
}
