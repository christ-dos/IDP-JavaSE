package fr.dawan.formation.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Chien;
import fr.dawan.formation.POO.models.Felin;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.setName("Medor");
        
        Chat chat = new Chat(4,10,"brun","cactus");
        System.out.println(chat.getName());
        
        chat.crier();
        chien.crier();
        
    
        Felin felin = new Felin(103, "brun", "Jean Michel");
        felin.crier();
        System.out.println(felin.getPelage());//fourrure
        System.out.println(chat.getPelage());// fourrure
        
        System.out.println(Animal.getCount());
        System.out.println(Felin.getCount());
        System.out.println(Chat.getCount());
        
        chat.switchPelage();
        
        //Polymorphisme
        
        Animal felin1 = new Felin();
        Animal cat1 = new Chat();
        
        System.out.println(felin1.getPelage());
        
        System.out.println(felin1.getPelage());
        cat1.crier(); // miaou
        
        /*
         * pas acces aus attributs et lmethodes qui ne pas vienne de la classe Animal
         */
        
        List<Animal> mes_aniamux = new ArrayList<>();
        
        mes_aniamux.add(felin1);
        mes_aniamux.add(cat1);
        mes_aniamux.add(chien); // Chien contenu ds la liste sera caster en Animal
        
        EstDomestique chien2 = new Chien();
        EstDomestique chat2 = new Chat();
        
        chien2.demanderDesCaresses();
        chat2.jouerALaBalle();
        
        // mes_animaux.add(chien2); -> n'est pas un animal
        
        /*
         * C'est le typage de la varible qui defini son type, et pas le constructor utilisé.
         * Les Objets st des instances de leurs classe, mais ausi des classes et intefaces dont ils heritent
         */
        
        //Chien chien = new Chien();
        System.out.println("Chien est un animal ? " + (chien instanceof Animal));
        System.out.println("Chien est un chien? " + (chien instanceof Chien));
        System.out.println("Chien estDomestique ? " + (chien instanceof EstDomestique));
        
      //EstDomestique chien2 = new Chien();
        System.out.println("Chien est un animal ? " + (chien instanceof Animal));
        System.out.println("Chien est un chien? " + (chien instanceof Chien));
        System.out.println("Chien estDomestique ? " + (chien instanceof EstDomestique));
    }
    
    
}
