package org.example;

public class Main {
    public static void main(String[] args) {
        Apotheke apotheke = new Apotheke();

        Medication med1 = new Medication("Aspirin", 5.99, 100);
        Medication med2 = new Medication("Paracetamol", 4.49, 50);

        apotheke.addMedication(med1);
        apotheke.addMedication(med2);


        int count = apotheke.getCount();
        System.out.println("Anzahl der Medication in der Apotheke: " + count);

        Medication med3 = new Medication("Ibuprofen", 7.99, 75);
        apotheke.save(med3);

        Medication foundMedication = apotheke.find("Aspirin");
        if (foundMedication != null) {
            System.out.println("Gefundene Medication: " + foundMedication.getName());
        } else {
            System.out.println("Medication nicht gefunden.");
        }

        apotheke.delete("Paracetamol");

        System.out.println("Alle Medication in der Apotheke:");
        apotheke.printAllMedications();
    }
}