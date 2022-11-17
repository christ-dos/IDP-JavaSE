package fr.dawan.formation.exercices;

import java.util.Random;
import java.util.Scanner;

/*
 * 2. Guess the Number
--------------------

A.
- Initialiser un nombre à deviner ( entre 0 et 100
- Dans la console, demander à l'user de deviner le nombre 
    -> User rentre un entier
    
-> Récupérer l'entier entré, le comparer avec le nombre à deviner, et retourner une réponse
à l'user.

-> Trop haut / Trop bas / gagné


B. Tant que user n'a pas gagné, on rejoue, jusqu'à ce qu'iel gagne.


C. On ajoute des indices à user.
-> On lui indique si iel se rapproche, ou s'éloigne


D. Quand user à terminé, on lui proposer de recommencer.

 */

public class ExerciceTrouverNombre {
   
    
    public static void main(String[] args) {
        
        boolean gagne = false;
        Scanner scan = new Scanner(System.in);
        int indexTour = 0;
        char reponse;
        
        
        
        do {
            Random random = new Random();
            int nombreADeviner = random.nextInt(101);
            while (gagne == false) {
                System.out.println(nombreADeviner);
                System.out.println("Veuillez entrer un nombre: ");
                int nombreEntree = scan.nextInt();
               
                int difference = nombreADeviner - nombreEntree;

                if (indexTour == 0 && nombreEntree > nombreADeviner) {
                    System.out.println("Trop Haut!");
                    indexTour++;

                } else if (indexTour == 0 && nombreEntree < nombreADeviner) {
                    System.out.println("Trop Bas!");
                    indexTour++;

                } else if (indexTour >= 0 && nombreEntree == nombreADeviner) {
                    System.out.println("Gagné");
                    gagne = true;
                } else if (indexTour > 0 && (nombreADeviner - nombreEntree) <= 10) {
                    System.out.println("Tu Chauffe!");

                } else if (indexTour > 0 && (nombreADeviner - nombreEntree) > 10) {
                    System.out.println("Tu est encore loin!");

                }

            }
            gagne = false;
            System.out.println("nouvelle partie? O:oui N:non");
            reponse = scan.next().charAt(0);
            
        } while (reponse == 'O');
        
        System.out.println("Bye!");
    }
    
}
