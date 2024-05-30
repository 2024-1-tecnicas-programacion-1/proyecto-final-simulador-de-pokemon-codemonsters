package simulador.pokemon;
/**
 * Clase Staryu.
 * Clase que hereda todos los parámetros de la calse padre Pokemon.
 */
public class Staryu extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Staryu() { //O(1)
        super("Staryu", 30, 45, TipoPokemon.AGUA, Estado.NORMAL); 
    } 
}