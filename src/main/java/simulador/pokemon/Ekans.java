package simulador.pokemon;
/**
 * Clase Ekans
 * Clase que hereda todos los parametros de la clase padre pokemon
 * 
 */
public class Ekans extends Pokemon { 
    /**
     * Metodo Ekans, que contiene toda la informacion del pokemon
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Ekans() { //O(1)
        super("Ekans", 35, 60, TipoPokemon.VENENO, Estado.NORMAL); 
    } 
}