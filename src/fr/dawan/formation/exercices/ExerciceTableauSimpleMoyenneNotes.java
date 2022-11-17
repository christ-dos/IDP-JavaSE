package fr.dawan.formation.exercices;

import java.util.Arrays;

public class ExerciceTableauSimpleMoyenneNotes {
//    3. Tableaux Simples : 
//        ---------------------
//
//
//        - Soit un tableau de notes
//        A. Calculer la moyenne des notes
//
//        B. Attention, pour calculer la moyenne, les notes doivent être comprise 0 et 20
//        -> Ne calculer la moyenne que des notes correctes.
//
//
//        C. Trouver la médiane.
//
//
//        

    public static void main(String[] args) {
        int [] tabNotes = {5,10,-1};
        double moyenne = 0D;
        double somme = 0;
       
        
        moyenne = somme(tabNotes) / compteurNotes(tabNotes);
        System.out.println("la moyenne des notes: " + (double)Math.round(moyenne * 100) /100);
        
        
        System.out.println("notes: " + mediane(tabNotes));
    }
    
    public static double mediane(int[] tabNotes) {
        int IndexMoitie = tabNotes.length /2;
    
        Arrays.sort(tabNotes);
                if (tabNotes.length%2 != 0) {
                    System.out.println("position notes"  + IndexMoitie); 
                    return tabNotes[IndexMoitie];
                } else {
                    System.out.println("position notes"  + IndexMoitie); 
                    return (tabNotes[IndexMoitie-1] + tabNotes[IndexMoitie]) / 2.0;
                }
    }
    
    public static double somme(int[] tabNotes) {
        double somme = 0;
    
        for (int i = 0; i < tabNotes.length; i++) {
            if(tabNotes[i] >= 0 && tabNotes[i] <= 20) {
                somme += tabNotes[i];
            }
        }
        return somme;
    }
    
    public static int compteurNotes(int[] tabNotes) {
        int compteurNotes =0;
        for (int i = 0; i < tabNotes.length; i++) {
            if(tabNotes[i] >= 0 && tabNotes[i] <= 20) {
                compteurNotes++;
            }
        }
        return compteurNotes;
    }
    
    
    
}
