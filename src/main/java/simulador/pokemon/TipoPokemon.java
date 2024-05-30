package simulador.pokemon;
/**
 * Clase tipo pokemon
 */
public enum TipoPokemon{ //O(1)
    
    FUEGO,AGUA,PLANTA,VENENO,ELECTRICO,PSIQUICO,ROCA,TIERRA,NORMAL,VOLADOR,HADA,LUCHA,ACERO,BICHO,HIELO,FANTASMA;
    /**
     * Contructor de la clase
     * @param atacante tipo de pokemon atacante 
     * @param defensor tipo de pokemon defensor 
     * Complejidad temporal: O(1) Complejidad Constante
     * metodo que retorna
     * @return 
     */
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor){ 
        
        double[][] efectividad = { //O(1)
            
         // FUEGO  AGUA  PLANTA VENENO ELECT PSIQ ROCA TIERR NORM VOLADOR HADA LUCHA ACERO BICHO HIELO FANTA 
            { 1,    0.5,   2,    1,    1,    1,   0.5,   1,    1,    1,    1,    1,   0.5,   2,    2,    1 }, // FUEGO
            { 2,     1,   0.5,   1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1,    1 }, // AGUA
            { 0.5,   2,    1,   0.5,   1,    1,    2,    2,    1,    1,    1,    1,   0.5,  0.5,   1,    1 }, // PLANTA
            { 1,     1,    2,    1,    1,    1,   0.5,   1,    1,    1,    2,    1,    1,    1,    1,   0.5 }, // VENENO
            { 1,     2,   0.5,   1,    1,    1,    1,    0,    1,    2,    1,    1,    1,    1,    1,    1 }, // ELECTRICO
            { 1,     1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    2,    1,    1,    1,    1 }, // PSIQUICO
            { 2,     1,    1,    1,    1,    1,    1,    1,    1,    2,    1,   0.5,   2,    2,    2,    1 }, // ROCA
            { 2,     1,    1,    2,    0,    1,    2,    1,    1,   0.5,   1,    1,    2,    1,    1,    1 }, // TIERRA
            { 1,     1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    0 }, // NORMAL
            { 1,     1,    2,    1,    2,    1,   0.5,   1,    1,    1,    1,    1,    1,    2,    1,    1 }, // VOLADOR
            { 1,     1,    1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1 }, // HADA
            { 1,     1,    1,    1,    1,   0.5,   2,    1,    2,    1,   0.5,   1,    1,    1,    2,   0.5 }, // LUCHA
            { 2,     1,    1,    1,    1,   0.5,   2,    1,    1,    1,    2,    2,    1,    1,    1,    1 }, // ACERO
            { 1,     1,    2,    1,    1,    1,    1,    1,    1,    2,    1,    1,   0.5,   1,    1,   0.5 }, // BICHO
            { 1,     1,    2,    1,    1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1 }, // HIELO
            { 1,     1,    1,   0.5,   1,    1,    1,    1,    0,    1,    1,    1,    1,    1,    1,    2 }, // FANTASMA
        }; 

        return efectividad[atacante.ordinal()][defensor.ordinal()]; 
    } 
}