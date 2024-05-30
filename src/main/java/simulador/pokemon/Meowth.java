package simulador.pokemon;
/**
 * Clase Meowth.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Meowth extends Pokemon { 
    /**
     * Método Meowth que contiene toda la información del pokémon. 
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Meowth() { //O(1)
        super("Meowth", 40, 45, TipoPokemon.NORMAL, Estado.NORMAL); 
    } 
}