package fr.dawan.formation;

public class TypeBoolean {

    public static void main(String[] args) {
        
        
        /*
         * Boolean: true / false
         * valeur binaire, qui pe avoir que 2 valeur posible: vair ou faux
         */
        
        boolean bool = true;
        
        /*
         * Les operateur de conditions
         *  == egalite
         *  != difference
         *  
         *  > < superieur à / inferieur à 
         *  
         *  >= <= superieur ou egal / inferieur ou egal
         *   
         *  ||  ou 
         *  && et
         *  ! non logique => retourne true si une condition est fausse et inversement
         * 
         */
        
        bool = !bool;
        
        bool = 4 < 10 ;// true
        
        bool = !false; //true;
        
        bool = !(4 < 10); // false
        
        bool = 10 == 9 || 10 < 20 ;// true
        bool = 10 == 9 && 10 < 20; // false
        
        bool = true == !false; // true
        
        bool = true == !false && !true; // false
        
        System.out.println(bool);
        
        /***************/
        
        String a = "Hello World";
        String b  = "Hello ";
        b+="World"   ;   
        
        System.out.println(a == b); // false : verifie en memoire
        
        System.out.println(a.equals(b)); // true : verifie le contenu de la string
        
        
        
        
        
    }

}
