package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercice2Dimensions {

 //   4. Tableau à 2 dimensions
//  -----------------------
//
//  A. Une variable classe, qui contient, pour chacun des éléves la liste des notes
//
//
//  => Afficher la moyenne de chaque élève 
//  => Afficher la moyenne la + haute, la moyenne la + basse
//  => Calculer la moyenne de la classe complète.
    
    
    public static void main(String[] args) {
        List<List<Integer>> eleves = new ArrayList<>();
        List<Double> moyennes = new ArrayList<>();
        double moyenneEleve = 0D;
        int index = 1;
        
        List<Integer> notesEleve1 = new ArrayList<>(Arrays.asList(10,15,18));
        List<Integer> notesEleve2 = new ArrayList<>(Arrays.asList(1,10,20));
        List<Integer> notesEleve3 = new ArrayList<>(Arrays.asList(10,5,18));
        
        eleves.add(notesEleve1);
        eleves.add(notesEleve2);
        eleves.add(notesEleve3);
        
        for (List<Integer> notesEleve : eleves) {
            moyenneEleve = moyenne(notesEleve);
            moyennes.add(moyenneEleve);
            System.out.println("La moyenne de l'eleve " + index +" :" + (double)Math.round(moyenneEleve * 100) /100);
            index++;
        }
        System.out.println("*************************************************************");
        System.out.println("La moyenne la plus haute est: " + (double)Math.round(Collections.max(moyennes)*100)/100);
        System.out.println("La moyenne la plus basse est: " + (double)Math.round(Collections.min(moyennes)*100)/100);
        System.out.println("************************************************************");
        System.out.println("moyenne de classe: " + moyenneClasse(moyennes));
    }
    
    public static double moyenne(List<Integer> notes) {
        double somme = 0;
        for (Integer note: notes) {
            somme += note;
        }
        return somme / notes.size();
    }
    
    public static double moyenne2(List<Double> notes) {
        double somme = 0;
        for (Double note: notes) {
            somme += note;
        }
        return somme / notes.size();
    }
    
    
    
    public static double moyenneClasse(List<Double> moyennes) {
        double sommeMoyennes = 0;
        sommeMoyennes =moyenne2(moyennes);
        return (double)Math.round(sommeMoyennes*100)/100;
    }
    
}
