package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public final class Chat extends Felin implements EstDomestique{
    /* 
     * une classe final c'est une classe dont on ne peut pas hériter.
     * on peur heriter que d'une seul classe
     */
    
    private static int count =0;

    public Chat() {
        count++;
    }

    public Chat(int nbLegs, int age, String couleur, String name) {
        super(nbLegs, age, couleur, name, true,true);
        count++;
    }
    
    @Override
    public void crier() {
        System.out.println("Miaou Miaou");
    }
    
    public void demandeCroquettes() {
        System.out.println("Nourris moi, humain!");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Tu approches ta main, je te bouffe");
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Va chercher la balle humlain");
    }

    public static int getCount() {
        return count;
    }

   
    
}
