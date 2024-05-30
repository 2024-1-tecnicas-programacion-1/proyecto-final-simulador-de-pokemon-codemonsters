package simulador.entrenador;

import java.util.LinkedList;
import java.util.List;
import simulador.pokemon.Pokemon;
/**
 * Se crea la clase entrenador
 * 
 */
public class Entrenador{ //O(1)
    private String nombre; 
    private List<Pokemon> pokemones; 
    
    public static Pokemon pokemon; 
    /**
     * Constructor de la clase 
     * @param nombre variable nombre del entrenador
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Entrenador(String nombre){ 
        this.nombre = nombre;
        this.pokemones = new LinkedList<>();           
    }
    /**
     * Metodo agregarPokemon que agrega un pokemon
     * @param pokemon parametro pokemon
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void agregarPokemon(Pokemon pokemon) { //O(1)
        if (pokemones.size() < 6) { 
            pokemones.add(pokemon); 
        } 
    }
    /**
     * metodo que entrena a un pokemon
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void entrenarPokemon() { //O(1)
        if (pokemones.contains(pokemon)) { 
            pokemon.entrenar(); //20 de salud y 5 de ataque         
        } 
    }
    /**
     * metodo que prepara al pokemon para una batalla 
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     * @return (retorna al pokemon)
     */
    
     public Pokemon prepararBatalla() { //O(1)
        if (!pokemones.isEmpty()) { //saber si la lista de pokemones no esta vacia
            Pokemon pokemonParaBatalla = pokemones.get(0); // Selecciona el primer Pokémon del equipo
            System.out.println(pokemonParaBatalla + " ha sido seleccionado para la batalla."); 
            return pokemonParaBatalla; 
        } else { 
            System.out.println("No hay Pokémones en el equipo para participar en la batalla."); 
            return null; 
        } 
    } 
//getters y setters 
    public String getNombre() { //O(1)
        return nombre; 
    }

    public List<Pokemon> getPokemones() { //O(1)
        return pokemones; 
    }

    public void setNombre(String nombre) { //O(1)
        this.nombre = nombre; 
    }

    public void setPokemones(List<Pokemon> pokemones) { //O(1)
        this.pokemones = pokemones; 
    }
     
}
    