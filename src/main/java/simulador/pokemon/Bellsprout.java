package simulador.pokemon;
/**
 * Clase Bellsprout.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Bellsprout extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Bellsprout() { //O(1)
        super("Bellsprout", 50, 75, TipoPokemon.PLANTA, Estado.NORMAL ); 
    } 
}