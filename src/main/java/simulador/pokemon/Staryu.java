package simulador.pokemon;
/**
 * Clase Staryu
 * Clase que hereda todos los parametros de la calse padre pokemon
 */
public class Staryu extends Pokemon { 
    /**
     * Metodo que contiene toda la informacion del pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Staryu() { //O(1)
        super("Staryu", 30, 45, TipoPokemon.AGUA, Estado.NORMAL); 
    } 
}