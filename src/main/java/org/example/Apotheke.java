package org.example;

import java.util.HashMap;
import java.util.Map;

public class Apotheke {
    private Map<String, Medication> medicationMap;

    public Apotheke() {
        medicationMap = new HashMap<>();
    }

    public void addMedication(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public Medication getMedication(String name) {
        return medicationMap.get(name);
    }

        public int getCount() {
            return medicationMap.size();
        }

        public void save(Medication medication) {
            medicationMap.put(medication.getName(), medication);
        }

        public Medication find(String medicationName) {
            return medicationMap.get(medicationName);
        }

        public void delete(String medicationName) {
            medicationMap.remove(medicationName);
        }

        public void printAllMedications() {
            for (Medication medication : medicationMap.values()) {
                System.out.println("Name: " + medication.getName());
                System.out.println("Price: " + medication.getPrice());
                System.out.println("Availability: " + medication.getAvailability());
                System.out.println("---------------");
            }
        }
    }


