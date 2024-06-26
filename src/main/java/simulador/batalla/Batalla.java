package simulador.batalla;

import simulador.pokemon.Pokemon;
/**
 * Clase pública Batalla.
 * 
 */
public class Batalla {  
    /**
     * Constructor de la clase. 
     * Void iniciarBatalla, método que tiene toda la lógica de la batalla entre los dos. 
     * Pokemones. 
     * @param pokemon1 parametro 1.
     * @param pokemon2 parametro 2.
     * 
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2){ 

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) { 
            // El primer Pokémon ataca al segundo.
            pokemon1.atacar(pokemon2); 
            if (pokemon2.getSalud() > 0) { 
                // El segundo Pokémon ataca al primero.
                pokemon2.atacar(pokemon1); 
            } 
        } 
        if (pokemon2.getSalud() <= 0) { 
            System.out.println(pokemon2.getNombre() + " ha sido derrotado. " + pokemon1.getNombre() + " es el ganador."); 
        } else { 
        System.out.println(pokemon1.getNombre() + " ha sido derrotado. " + pokemon2.getNombre() + " es el ganador."); 
        } 
    } 
    
    
}

