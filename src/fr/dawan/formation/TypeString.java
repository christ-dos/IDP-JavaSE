package fr.dawan.formation;

import java.util.Scanner;

public class TypeString {

    public static void main(String[] args) {
        
        /*
         * les catacteres : type primitif
         * type char
         *  - 16 bits / 2 oectets
         *  - accepte une lettre (un caractere)
         *  - caratcter uniciode
         *  -  hexadecimal
         *  
         *  - valeur par defaut: 'a'
         */
        
        char a = 'a'; // on utilise des simples quotes
        System.out.println(a);
        
        a= 0x00061; // 'a' en hexadecimal
        
        a='\u0061'; // 'a' en unicode
        
        System.out.println(a); // affiche 'a'
        a++;
        System.out.println(a);//pres incrementation affiche 'b'
        
        // Caracteres d'échappement
        /*
         * certains caracteres servent à passer des instructions particulières au compilateur
         * ces caracteres sont précedé d'un backslash \ qui sert à les échapper
         * Echapper: modifier son sens classqiue pr le compilateur
         */
        
        char quote= '\''; // le caractere'
        
        String gullemet = "\""; // le caractere "
        
        char backlash = '\\'; // le caracter \
        
        char esc = 'n'; // le caracter n
        esc = '\n'; // suat de ligne
        
        /*
         * \n new line
         * 
         * \t tabulation
         */
        
        
        //les Strings
        
        //Chaine de caracteres 
        String name = "Jane Doe";
        String greeting = "Bonjour";
        
        //Concatenation
        
        System.out.println(greeting + " " + name);
        
        int age =121;
        
        System.out.println(name + "a" + age + "ans");
        //le cast d'un int vers un String est implicite
        
        
        // int nope = (int) name;
        //on ne peut pas caster une String en int 
        
        //String est une classe, elle ns offre differentes methodes: 
        
        System.out.println(name.toUpperCase()); // majuscules
        System.out.println(name); // normal ca ne modifie pas la chaine de base
        
        System.out.println(name.toLowerCase()); //minuscule;
        
        System.out.println(name.length()); // taille de la string
        
        System.out.println(name.equals(greeting)); // return true ou false
        
        System.out.println(name.equals("Jane Doe"));
        
        System.out.println(name.compareTo("Jane Doe !" )); // -2: name à 2 caractere diffrent de name
        System.out.println(name.compareToIgnoreCase("Jane doe" )); // 0 si les 2 chaines sont egal
        
        String [] splitted = name.split(" ");// decoupe au nievau des espaces 
        String [] splitted1 = name.split("");// decoupe caractare par caracteres["J", "a", "n"....]
        
        String sub =  name.substring(5);// retourne une sous chaine à  partir de index 5 tout le reste de la chaine
        System.out.println(name.charAt(0));// on retoune "j"
        
        System.out.println(name.indexOf("e"));// va chercher le 1er caractere correspondant
        
        //https://www.w3schools.comm/java/java_ref_string.asp
        
        //communiquer avec l'utilisateur
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer votre nom: ");
        
        String firstname = scan.next();
        String lastname = scan.next();
        scan.nextLine();
        
        System.out.println("Bonjour" + firstname + " " + lastname);
        
        System.out.println("Entrer votre nom:  (again) ");
        
        String username = scan.nextLine();
        
        System.out.println("Vous êtes " + username);
        

        System.out.println("Votre age: ");
        int userAge = scan.nextInt();
        
        System.out.println("vous avez: " + userAge);
        
        
        

    }

}
