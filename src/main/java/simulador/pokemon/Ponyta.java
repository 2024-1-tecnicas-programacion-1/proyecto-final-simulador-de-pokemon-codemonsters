package simulador.pokemon;
/**
 * Clase Ponyta
 * Clase que hereda todos los parametros de la clase padre pokemon
 */
public class Ponyta extends Pokemon { 
    /**
     * metodo que contiene toda la informacion del pokemon
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Ponyta() { //O(1)
        super("Ponyta", 50, 85, TipoPokemon.FUEGO, Estado.NORMAL); 
    } 
}