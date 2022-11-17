package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Pelage;

public class Felin extends Animal {
    private boolean isSociable;
    private boolean hasGriffesRectractiles;
    
    
    public Felin() {
        
    }

    public Felin(int nbLegs, int age, String couleur, String name) {
        super(nbLegs, age, couleur, name);
        this.setPelage(Pelage.FOURRURE);
    }
    
    public Felin(int age, String couleur, String name) {
        super(age, couleur, name);
        this.setPelage(Pelage.FOURRURE);
    }


    public Felin(int nbLegs, int age, String couleur, String name, boolean isSociable, boolean hasGriffesRectractiles) {
        super(nbLegs, age, couleur, name);
        this.isSociable = isSociable;
        this.hasGriffesRectractiles = hasGriffesRectractiles;
        this.setPelage(Pelage.FOURRURE);
    }

   

    @Override
    public void crier() {
        System.out.println("Graou Graou");
    }



   
    
    
    
    
}
