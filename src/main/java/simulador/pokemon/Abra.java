package simulador.pokemon; 
/**
 * Clase Abra
 * clase que hereda todos los parametros de pokemon
 */
public class Abra extends Pokemon { 
    /**
     * metodo que contiene toda la informacion del pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Abra() { //O(1)
        super("Abra", 25, 20, TipoPokemon.PSIQUICO, Estado.NORMAL); 
    } 
    
}
