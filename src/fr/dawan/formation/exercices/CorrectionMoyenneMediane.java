package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectionMoyenneMediane {
    
  // 3. Tableaux Simples : 
//      ---------------------
//
//
//      - Soit un tableau de notes
//      A. Calculer la moyenne des notes
//
//      B. Attention, pour calculer la moyenne, les notes doivent être comprise 0 et 20
//      -> Ne calculer la moyenne que des notes correctes.
//
//
//      C. Trouver la médiane.
//
//

    static List<Integer> clean(List<Integer> grades_dirty) {
        List<Integer> cleaned = new ArrayList<>();
        for(int g : grades_dirty) {
            if(g >= 0 && g <= 20) {
                cleaned.add(g);
            }
        }
        return cleaned;
    }
    
    static double average(List<Integer> grades) {
        int sum = 0;
        int good_grades = 0;
        for(int grade : grades) {
            sum += grade;
            good_grades++;
        } 
        return sum / good_grades;
    }
    
    static int mediane(List<Integer> grades) {  
        java.util.Collections.sort(grades);
        if(grades.size() % 2 != 0) { // Impaire
            int index = (int) Math.floor(grades.size() / 2); 
            System.out.println("Index " + index);
            return grades.get(index);
        } else { // paire
            int indexUp = grades.size() /2;
            int indexDown = indexUp - 1;
            return (indexUp + indexDown) / 2;
        }  
    }
 

    public static void main(String[] args) {
  
       List<Integer> grades = new ArrayList<>(Arrays.asList(-1, 0, 2, 15, 18, 20, 25));
       List<Integer> cleaned_grades = clean(grades);
       double moyenne = average(cleaned_grades);
       System.out.println(moyenne);
       
    }

}
