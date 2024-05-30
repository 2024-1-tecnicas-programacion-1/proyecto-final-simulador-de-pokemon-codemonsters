package simulador.pokemon;
/**
 * Clase Doduo
 * Clase que hereda todos los parametros de la clase padre pokemon
 */
public class Doduo extends Pokemon { 
    /**
     * Metodo que contiene toda la informacion del pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Doduo() { //O(1)
        super("Doduo", 35, 85, TipoPokemon.NORMAL, Estado.NORMAL); 
    } 
}
