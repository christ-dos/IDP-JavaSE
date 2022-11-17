package fr.dawan.formation.exercices;

import java.util.Scanner;

public class ExerciceCalculette {
    /*
     * 1. Calculatrice ---------------
     * 
     * Demander à user de rentrer un calcul -> nombre_A opérateur nombre_B
     * 
     * => Retourner le résultat du calcul en fonction de l'opérateur.
     * 
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean rejouer = true;

        do {
            System.out.println("Veuillez entrer un calcul: ");
            int a = Integer.parseInt(scan.next());
            String operateur = scan.next();
            int b = Integer.parseInt(scan.next());
            int result = 0;
            String nomOp = "";
            switch (operateur) {
            case "+":
                result = a + b;
                nomOp = "addition";
                break;
            case "-":
                result = a - b;
                nomOp = "soustraction";
                break;
            case "*":
                result = a * b;
                nomOp = "multiplication";
                break;
            case "/":
                result = a / b;
                nomOp = "division";
                break;
            case "%":
                result = a % b;
                nomOp = "modulo";
                break;

            default:
                System.out.println("Impossible de faire ce calcul!");
                break;
            }
            System.out.println("Le resultat de votre: " + nomOp + " entre " + a + " et " + b + " vaut " + result);

            System.out.println("Voulez vous rejouer:  O ou  N: ");
            char reponse = scan.next().charAt(0);
            if (reponse == 'O') {
                rejouer = true;
            } else if (reponse == 'N') {
                rejouer = false;
                System.out.println("Vous avez terminé le jeux");
                break;
            }
        } while (rejouer = true);

    }

}
