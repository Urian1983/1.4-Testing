package level2;

import level2.model.Assertions;

public class Ex6Main {

    public static void main(String[] args) {
        Assertions a = new Assertions();
        System.out.println("Introdueix almenys 6 nombres per provocar l'error:");
        try {
            a.toFailArray(); // provocarà IndexOutOfBoundsException després de 5 iteracions
        } catch (Exception e) {
            System.out.println("S'ha capturat excepció: " + e);
        }
    }
    }
