package simulador.pokemon; 
/**
 * Clase Abra.
 * Clase que hereda todos los parámetros de la clase padre Pokemon.
 */
public class Abra extends Pokemon { 
    /**
     * Método que contiene toda la información del pokémon.
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    public Abra() { //O(1)
        super("Abra", 25, 20, TipoPokemon.PSIQUICO, Estado.NORMAL); 
    } 
    
}
