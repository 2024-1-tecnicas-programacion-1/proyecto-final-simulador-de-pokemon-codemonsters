package simulador.pokemon;
/**
 * Clase Meowth
 * Clase que hereda todos los parametros de la clase padre pokemon
 */
public class Meowth extends Pokemon { 
    /**
     * metodo Meowth que contiene toda la informacion del pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Meowth() { //O(1)
        super("Meowth", 40, 45, TipoPokemon.NORMAL, Estado.NORMAL); 
    } 
}