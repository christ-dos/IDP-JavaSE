package fr.dawan.formation;

public class Arrays {

    public static void main(String[] args) {
        
        double[] tab = new double[3];
        System.out.println( tab[0]); // les valeurs sont initialées par defaut

        /*
         * Initialisation par defaut:
         * 
         * double: 0.0
         * int: 0
         * char: \u0000  correspond à caratere null
         * boolean: false
         * reference : null
         */
        
        tab[0] = 1.5;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab de "  +  i +  "= " +  tab[i]);
        }
        
        for (double el : tab) {
            System.out.println("Foreach: " + el);// [0.0, 0.0, 0.0]
            el++;// ne modifie pas dans le tableau : el est une varible locale
        }
        
        int entiers []= {1,2,3}; //  int entier[] === int [] entiers
        
        //System.out.println(entiers[3]); // exception out of bound exception
        
        
        int tablo[][] = new int[3][3]; //tableau de 3 lignes contanant chacun un taleau de 3 zeros
        
        int tabloooo[][] = {
                {1,2,3},// index 1
                {4,5,6},// index 2
                {7,8,9}// index 3
                };
        int cinq = tabloooo[1][1];
        int sept = tabloooo[2][0];
        
        int tabloooooo[][] = {
                {1,2,3}, // on peut avoir un tableau enft de differentes tailles sur chaques lignes
                {4},
                {7,8}
                };
        int cinq1 = tabloooo[2][0];
        int sept1 = tabloooo[3][0];
        
        // double boucle foreach pour afficher un tableau de 2 dimensions
        for (int[] subtablo : tabloooooo) { // on recupere les tableau de chaque lignes
            for (int value : subtablo) { //on boucles sur les tableaux de chaque ligne stocke dans la variable subtablo
                System.out.println(value);
            }
        }
        
        
        
    }

}
