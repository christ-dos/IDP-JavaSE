package fr.dawan.formation;

public class Instructions {

    public static void main(String[] args) {
        
        // Les conditions
        
        int a = 10;
        
        if (a>50) {
            System.out.println("C'est un grand nombre");
        }else if(a == 50 ){
            System.out.println("C'est un nbr moyen");
        }else if(a < 50 && a >= 0){
            System.out.println("c'est un petit nbr");
        }else {
            System.out.println("C'est plus petit que 0");
        }
        
        String day = "lundi";
        
        switch (day) {
        case "lundi":
            System.out.println("Oh no!");
            break;
        case "mardi":
        case "mercredi":
            System.out.println("Demain est un autre jour!");
            break;
        case "jeudi":
            System.out.println("**Dead**");
            break;
        case "vendredi":
            System.out.println("Almost the end!");
            break;
        default:
            System.out.println("Week End!");
            break;
        }
        
        int age = 30;
        
        // le ternaire retourne 2 valeurs possible en fonction d'une condition        
        //WTF ::         What?          True            False
        String ternaire= (true)? "valeur si true ": "valeur si false ";
        
        String message = (age > 140)? "Vous etes vachement vieux / vieille!" : "Ca passe!";
        
        //******boucles********
        
        for(int i = 1; i < 10; i++) {
            
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
        
        for(int i = 1; i < 10; i++) {
                    
            if(i == 3) {// saute l'iteration 3
                continue;
            }
            System.out.println(i);
        }
        
        for (int i = 0; i < 5; i++) { 
            System.out.println("\u001B[34m first boucle:" + i + "\u001B[0m");
            for (int k= 0; k< 5; k++) { 
                if(k == 3) {
                    break; // stop la boucke k
                }
                System.out.println("I : " + i + "------K : " +k );
            }
            
        } 
        
        FIRST_BOUCLE:
        for (int i = 0; i < 5; i++) { 
            System.out.println("\u001B[34m first boucle:" + i + "\u001B[0m");
            for (int k= 0; k< 5; k++) { 
                if(k == 3) {
                    break   FIRST_BOUCLE; // stop la boucke i
                }
                System.out.println("I : " + i + "------K : " +k );
            }
            
        } 
        
        // boucle while
        int l = 0;
        while(l > 0) {
            System.out.println("--while:" + l);
            l--;
        }
        
        // boucle do While
        do {
            System.out.println("--while:" + l);
            l++;
        } while (l < 5);
                
            

    }
    


}
