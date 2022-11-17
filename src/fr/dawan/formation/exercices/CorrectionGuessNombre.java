package fr.dawan.formation.exercices;

import java.util.Scanner;

public class CorrectionGuessNombre {

    static int pc_number = (int)( Math.random() * 100) + 1;
    static int user_guess;
    static int previous = -1;

    public static void main(String[] args) {
        start();
    }
    
    static void start() {
        pc_number = 50;
        System.out.println("Devine le nombre auquel je pense ! *Bip boup bap*");
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("(Entre un nombre compris en 0 et 100 )");
            user_guess = scan.nextInt();
        } while(!compare(user_guess));
      
        System.out.println("Rejouer ?  Y: yes, N: no");
        String response = scan.next();
        
        if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            start();
        } else {
            System.out.println("Bisous !");
        }
          
    }
    
    static boolean compare(int user) {
        
        if(user == pc_number) {
            System.out.println("Gagné !");
            return true;
        }
        
        if(user < pc_number) {
            System.out.println("Trop Bas !");
        } else {
            System.out.println("Trop Haut !");
        }
        
        hint(); 
        return false;
        
    }
    
    static void hint() {
        int diff = Math.abs(pc_number - user_guess);
        if(previous != -1) {
            if(diff < previous) {
                System.out.println("On se rapproche !");
            } else if(diff > previous) {
                System.out.println("On s'éloigne");
            } if(diff == previous) {
                System.out.println("On tourne en rond !");
            }
        }
        previous = diff; 
    }

}
