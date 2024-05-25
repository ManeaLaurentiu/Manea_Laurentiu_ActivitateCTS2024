package cts.Manea.Laurentiu.Grupa1116.pattern.main;

//2. În cadrul aplicației personalul spitalului este de mai multe tipuri.
// Acestea sunt salvate într-unenum { Brancardier, Asistent, Medic}.
// Să se implementeze modulul care pune la dispozițieicrearea de obiecte din familia
// obiectelor PersonalSpital in funcție de tipul primit ca parametru.//


import cts.Manea.Laurentiu.Grupa1116.pattern.model.Pacient;
import cts.Manea.Laurentiu.Grupa1116.pattern.model.PacientBuilder;

public class Main {
   public static void main(String[] args) {
      Pacient pacient1 = new PacientBuilder()
              .setPatRabatabil(true)
              .setMicDejunInclus(true)
              .build();

      Pacient pacient2 = new PacientBuilder()
              .setPapuciCamera(true)
              .setHalatInterior(true)
              .build();

      System.out.println(pacient1);
      System.out.println(pacient2);
   }
}