
package simulador.pokemon;
/**
 * Clase Machop
 * Clase que hereda todos los parametros de la clase padre pokemon
 */
public class Machop extends Pokemon { 
    /**
     * Metodo que contiene toda la informacion del pokemon
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Machop() { //O(1)
        super("Machop", 70, 80, TipoPokemon.LUCHA, Estado.NORMAL); 
    } 
}
