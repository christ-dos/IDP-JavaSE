package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Pelage;

abstract public class Animal { // c un java Bean
    // POJO - plain Old Java Object -> classe sans rectriction
    // Java Beans, type de POJO - > classe qui contine un constructeur, 
    //attibut  en privé et assesseurs, serializable
    //Bonne pratique, convention d'ecriture
    /*
     * public -> utilisable partout
     * private -> utilisable uniquement dans la classe
     * protected(default) -> utilisable dans le package 
     */
    
    private int nbLegs, age;
    private String couleur;
    private String name;
    private Pelage pelage;
    private static int count = 0;
    
    public Animal() {
        count++;
    }

   

    public Animal(int age, String couleur, String name) {
        this.age = age;
        this.couleur = couleur;
        this.name = name;
        count++;
    }
    
    
    public Animal(int nbLegs, int age, String couleur, String name) {
        super();
        this.nbLegs = nbLegs;
        this.age = age;
        this.couleur = couleur;
        this.name = name;
        count++;
    }

    public void manger() {
        System.out.println(this.name + " dit Miam Miam");
    }
    
    public void switchPelage()
    {
        switch (this.pelage) {
        case FOURRURE:
            System.out.println("perd ses poils partouts");
            break;
        case ECAILLES:
            System.out.println("pas agreable à carresser");
            break;
        case CARAPASSES:
            System.out.println("Change de carapasse ts les 4 matins");
            break;

        default:
            System.out.println("plus d'idees");
            break;
        }
    }
    
    
    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Pelage getPelage() {
        return pelage;
    }

    public void setPelage(Pelage pelage) {
        this.pelage = pelage;
    }
    
    
    public static int getCount() {
        return count;
    }


    public abstract void crier();
    
    
    //Type de pelage
    //type alimenattion
    //cri
    
    
}
