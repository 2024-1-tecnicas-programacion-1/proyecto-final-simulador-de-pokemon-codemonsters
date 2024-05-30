package simulador.pokemon;
/**
 * Clase publica Onix
 * Clase que hereda todos los parametros de la clase padre pokemon
 */
public class Onix extends Pokemon { 
    /**
     * Metodo que contiene toda la informacion del pokemon
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Onix() { //O(1)
        super("Onix", 35, 45, TipoPokemon.ROCA, Estado.NORMAL ); 
    } 
}
