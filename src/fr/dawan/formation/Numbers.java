package fr.dawan.formation;

public class Numbers {

    public static void main(String[] args) {

        /*
         * Numbers: type primitfs
         * 
         *   Nom:       taille             valeur           defaut
         *  Entier      
         *  -byte       8bits / 1 octet       -128 à 127           0
         *  -short      16 bits / 2 octets   -2(15) à +2(15) -1    0         
         *  -int        32 bits / 4octets    -2(31) à +2(31) -1    0
         *  -long,       64 bits / 8octets    -2(63) à 2(63) -1    0L
         *  
         *  
         *  Flottant( nrb a virgule)
         *  -float      32 bits/ 4 octets         -1.4*10(-45) à 3.5*10(38)    0.0f
         *  -long       64 bits / 8 octets        -4.9*10(-324) à 1.7 *10(308)  0.0d
          *  
         *  
         */
        
        byte by = 125;
        byte by2 = (byte) 129; // -127
        System.out.println(by2);
        
        byte by3 = (byte) 130; // -126
        System.out.println(by3);
        
        int a=10;
        int b = by; // cast automatique de la valeur de by en integer
        System.out.println(b); // out : 125
        
       //byte b3 = (byte)b ;// impossible
        /*
         * on peut caster sans soucie vers un type plus grd mais pas le contraire
         * on peut caster un entier en decimal pas de perte de precisison
         * => on dit que le castage est implicite
         */
        
        double db = b;
        System.out.println(db); // out: 125.0
        
        float f = 123.5f;
        int c = (int)f;
        System.out.println(c); // 125 on pert en precision on pert le nbr apres la virguel
        
        /**
         * Operateurs de calcul 
         * + addition
         * - soustraction
         * * multiplication
         * / division
         *  % modulo
         * 
         * le resultat d'une operation est considére comme une valeur
         * => on enregistre le reusltat et on travail avec le reusltat
         */
        
        System.out.println(1 +1 ); // 2
        
        int d = 321*12 / 78 * 3 -1 ; // 
        System.out.println(d); // on obtient le resultat 320
        
        
        d=(1+1) *2; // 6
        
        // les claculs fonctioinne comme sur calculette le mm ordre de priorité
        d= d +1; d++; // incrementation 
        d= d-1; d--; // decrementation
        
        d= d*1; d*=1;
        d+= 1;
        d-= 2;
        d/= 2;
        d%= 1;
        
        System.out.println(d++); // 10 affiche dabord d pouis fait incrementation
        System.out.println(d);//11
        
        System.out.println(++d); //12 il incremente d  d'abord puis fait l'affichage
        
        
        
        /*
         * on pe faire des operation entre les types ms il fo caster 
         * le resultat vers le type le plus grd et precis
         * 
         * ds le cas contraire il faudra caster explicitemennt 
         * et on prend un risque de perte de precision
         */
        double unDouble = d + 1.5;
        int unInt = (int) (d + 1.5);
        
        int z = 3;
        int y = z;
        z=2;
        
        System.out.println(y); // out: 3
        
         
    }

}
