package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Pelage;
import fr.dawan.formation.POO.interfaces.EstDomestique;

public class Chien extends Animal implements EstDomestique{
    
    public Chien() {
        
    }
    public Chien(int age, String couleur, String name) {
        super(age, couleur, name);
        this.setPelage(Pelage.FOURRURE);
    }

    @Override
    public void crier() {
        System.out.println("Wouaff Wouaff");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Year!");
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Oui la Baballe");
    }

}
