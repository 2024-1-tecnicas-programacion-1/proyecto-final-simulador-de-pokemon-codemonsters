package simulador.pokemon;
/**
 * Clase pública Onix.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Onix extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Onix() { //O(1)
        super("Onix", 35, 45, TipoPokemon.ROCA, Estado.NORMAL ); 
    } 
}
