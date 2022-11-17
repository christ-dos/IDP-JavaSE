package fr.dawan.formation;

public class Methodes {

    public static void main(String[] args) {
        
        multiply(1);
        multiply(30, 20, 79, 9);
        multiply(1);
        }

    // public : portée de la methode ( default protected)
    // int: type de retour . si pas de rtour void
    
    public int sum(int a, int b) {
        return a + b;
    }
    
    public static int multiply( int ...values) { // pour pouvoir mettre des parametres de facon aleatoire soit 1 ou soit 10
        return 0;                        //il converti automatiquement values en tabelau grace au ...
    }
    
    public void sayHello() {
        System.out.println();
    }
    
    public boolean checkSotheming(int truc){
        if (truc < 0) {
            System.out.println("Nombre invalide");
            return false;
        }
        return true;
    }

}
