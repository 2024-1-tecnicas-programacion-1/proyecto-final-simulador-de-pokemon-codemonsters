package simulador.pokemon;
/**
 * Clase Doduo.
 * Clase que hereda todos los parámetros de la clase padre pokemon.
 */
public class Doduo extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Doduo() { //O(1)
        super("Doduo", 35, 85, TipoPokemon.NORMAL, Estado.NORMAL); 
    } 
}
