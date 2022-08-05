
package reto5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Reto5 {



    public static void main(String[] args) {
        
        // Evolución Charmander
    
        Pokemon miPokemon = new Charmander('1',"pedrito",100);
        System.out.println("Su pokemon se llama " + miPokemon.getNombre());
        System.out.println(miPokemon.gritar());
        
        System.out.println("\n"+ miPokemon.getNombre() + " Esta evolucionando");
        try {
            miPokemon = miPokemon.evolucionar();
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Reto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(miPokemon.gritar());
        
        System.out.println("\n"+ miPokemon.getNombre() + " Esta evolucionando");
        try {
            miPokemon = miPokemon.evolucionar();
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Reto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(miPokemon.gritar());
        
        // Evolución Aquirtle
        System.out.println("");
        Pokemon miNuevoPokemon = new Squirtle('1',"marinito",100);
        System.out.println("Su pokemon se llama " + miNuevoPokemon.getNombre());
        System.out.println(miNuevoPokemon.gritar());
        
        System.out.println("\n"+ miNuevoPokemon.getNombre() + " Esta evolucionando");
        try {
            miNuevoPokemon = miNuevoPokemon.evolucionar();
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Reto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(miNuevoPokemon.gritar());
        
        System.out.println("\n"+ miNuevoPokemon.getNombre() + " Esta evolucionando");
        try {
            miNuevoPokemon = miNuevoPokemon.evolucionar();
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Reto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(miNuevoPokemon.gritar());
        
        // Evolución Pikachu 
        
        System.out.println("");
        Pokemon miPikachu;
        miPikachu = new Pikachu('1',"fulanito",100);
        System.out.println("Su pokemon se llama " + miPikachu.getNombre());
        System.out.println(miPikachu.gritar());
        
        System.out.println("\n"+ miPikachu.getNombre() + " Esta evolucionando");
        try {
            miPikachu = miPikachu.evolucionar();
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Reto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(miPikachu.gritar());
        
        // pokebolas 
        System.out.println("\n Pokemones guardados en pokebolas");
        Pokebola pokebola1 = new Pokebola("Grande", miPokemon);
        System.out.println(pokebola1.getPokemon().getNombre());
        Pokebola pokebola2 = new Pokebola("Mediana", miNuevoPokemon);
        System.out.println(pokebola2.getPokemon().getNombre());
        Pokebola pokebola3 = new Pokebola("pequeña", miPikachu);
        System.out.println(pokebola3.getPokemon().getNombre());
       
    }
    
}
