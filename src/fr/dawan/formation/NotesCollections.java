package fr.dawan.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NotesCollections {
    static void maMethode(int value) {
        value *= 1000;
        System.out.println(value);
    }
    

    public static void main(String[] args) {
        /*
         *  Les collections : des classes permettent de gérer des listes / tableaux
         */
        
        int[] arr_initial = { 20, 30, 40};
        Integer[] arr2 = new Integer[arr_initial.length];
        Arrays.setAll(arr2, i -> arr_initial[i]); 
        List<Integer> collection = Arrays.asList(arr2);
        
        
       List<Integer> notes = new ArrayList<>(Arrays.asList(20, 23, 45, 60));
       notes.add(80);
       
       System.out.println("Taille du tableau " + notes.size());
       
       notes.remove(0); // à l'index
       int index = notes.indexOf(60);
       notes.remove(index);
       String message = "Voici une note : ";

    
       notes.forEach(n -> {
           n *= 200;
           System.out.println(message + n);
       });
       System.out.println("-----------------");

       
       notes.forEach(n -> System.out.println(n));
       System.out.println("-----------------");

       notes.forEach(System.out::println);
       System.out.println("-----------------");
       notes.forEach(NotesCollections::maMethode);
       System.out.println("---------------");
       
       for(int i = 0; i < notes.size(); i++) {
           maMethode(notes.get(i));
       }
       

    }

   
}
