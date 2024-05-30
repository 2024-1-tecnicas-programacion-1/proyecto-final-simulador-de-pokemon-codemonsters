package simulador.pokemon;
/**
 * Clase Magnemite.
 * Clase Magnemite que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Magnemite extends Pokemon { 
    /**
     * Método Magnemite que contiene toda la información del pokémon. 
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Magnemite() { //O(1)
        super("Magnemite", 25, 35, TipoPokemon.ELECTRICO, Estado.NORMAL); 
    } 
}