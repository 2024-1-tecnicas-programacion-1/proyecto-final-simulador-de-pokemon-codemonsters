
package simulador.pokemon;
/**
 * Clase Machop
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Machop extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Machop() { //O(1)
        super("Machop", 70, 80, TipoPokemon.LUCHA, Estado.NORMAL); 
    } 
}
