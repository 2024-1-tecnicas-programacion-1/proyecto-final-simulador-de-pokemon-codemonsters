package simulador.entrenador;
import java.util.List;

import simulador.pokemon.Pokemon;

public class Entrenador{
    private String nombre;
    private List<Pokemon> pokemones;
    
    public Entrenador(String nombre,List<Pokemon> pokemones){
        this.nombre=nombre;
        this.pokemones=pokemones;
                
    }
    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() < 6) {
            pokemones.add(pokemon);
        }
    }
    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();           
        } 
    }
    public void mostrarPokemones() {
        if (!pokemones.isEmpty()) { //si la lista no esta vacia entonces..
            System.out.println("Pokémones en el equipo:");
            for (int i = 0; i < pokemones.size(); i++) {
                Pokemon pokemon = pokemones.get(i);
                System.out.println(pokemon);
}
        } else {
            System.out.println("El equipo no tiene Pokémones.");
        }
    }
     public Pokemon prepararBatalla() {
        if (!pokemones.isEmpty()) { //saber si la lista de pokemones no esta vacia
            Pokemon pokemonParaBatalla = pokemones.get(0); // Selecciona el primer Pokémon del equipo
            System.out.println(pokemonParaBatalla + " ha sido seleccionado para la batalla.");
            return pokemonParaBatalla;
        } else {
            System.out.println("No hay Pokémones en el equipo para participar en la batalla.");
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
     
    }
    