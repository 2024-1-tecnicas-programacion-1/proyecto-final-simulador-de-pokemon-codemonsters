package simulador.pokemon;
/**
 * Clase Magnemite que hereda todos los parametros de la clase padre pokemon
 * 
 */
public class Magnemite extends Pokemon { 
    /**
     * metodo Magnemite que contiene toda la informacion del pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Magnemite() { //O(1)
        super("Magnemite", 25, 35, TipoPokemon.ELECTRICO, Estado.NORMAL); 
    } 
}