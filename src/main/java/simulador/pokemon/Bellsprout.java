package simulador.pokemon;
/**
 * Clase Bellsprout
 * clase que hereda todos los parametros de la clase padre pokemon
 */
public class Bellsprout extends Pokemon { 
    /**
     * metodo que contiene toda la informacion del pokemon
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Bellsprout() { //O(1)
        super("Bellsprout", 50, 75, TipoPokemon.PLANTA, Estado.NORMAL ); 
    } 
}