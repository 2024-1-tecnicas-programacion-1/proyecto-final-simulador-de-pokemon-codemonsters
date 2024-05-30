package simulador.pokemon;
/**
 * Clase Ponyta.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Ponyta extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Ponyta() { //O(1)
        super("Ponyta", 50, 85, TipoPokemon.FUEGO, Estado.NORMAL); 
    } 
}