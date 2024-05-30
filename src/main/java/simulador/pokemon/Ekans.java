package simulador.pokemon;
/**
 * Clase Ekans.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 * 
 */
public class Ekans extends Pokemon { 
    /**
     * Método Ekans, que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Ekans() { //O(1)
        super("Ekans", 35, 60, TipoPokemon.VENENO, Estado.NORMAL); 
    } 
}