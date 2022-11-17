package fr.dawan.formation.exercices;

import java.util.Arrays;

public class CorrectionTabSimpleMoyenneMediane {
    
    static double average(int[] grades) {
        int sum = 0;
        int good_grades = 0;
        for(int grade : grades) {
            if(grade >= 0 && grade <= 20) {
                sum += grade;
                good_grades++;
            }
            
        } 
        return sum / good_grades;
    }
    
    
    static int mediane(int[] grades) {  
        Arrays.sort(grades);
        if(grades.length % 2 != 0) { // Impaire
            int index = (int) Math.floor(grades.length / 2); 
            System.out.println("Index " + index);
            return grades[index];
        } else { // paire
            int indexUp = grades.length /2;
            int indexDown = indexUp - 1;
            return (indexUp + indexDown) / 2;
        }  
    }
    

    public static void main(String[] args) {
        int[] notes = {  -1, 0, 2, 15, 18, 20, 25,};   
        System.out.println( "Moyenne : " + average(notes) );
        System.out.println("Mediane : " + mediane(notes));
    }

}
