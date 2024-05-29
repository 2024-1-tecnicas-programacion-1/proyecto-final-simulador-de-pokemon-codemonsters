package simulador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Abra;
import simulador.pokemon.Bellsprout;
import simulador.pokemon.Doduo;
import simulador.pokemon.Ekans;
import simulador.pokemon.Machop;
import simulador.pokemon.Magnemite;
import simulador.pokemon.Meowth;
import simulador.pokemon.Onix;
import simulador.pokemon.Pokemon;
import simulador.pokemon.Ponyta;
import simulador.pokemon.Staryu;
/**
 * Clase principal
 * Se crea scanner, List(entrandor) y List(pokemon)
 * Pivate static final para poder utilizarlos en todo el codigo y para que no pueda ser cambiada después de ser asignada.
 * Inmutabilidad
 * 
 */
public class Principal {
    private static final Scanner lector = new Scanner(System.in);
    private static final List<Entrenador> entrenadores = new ArrayList<>();
    private static final List<Pokemon> pokemones = new ArrayList<>();

    public static void main(String[] args) {
        inicializarPokemones();
        mostrarMenuPrincipal();
    }

    private static void inicializarPokemones() {
        pokemones.add(new Ponyta());
        pokemones.add(new Staryu());
        pokemones.add(new Bellsprout());
        pokemones.add(new Magnemite());
        pokemones.add(new Abra());
        pokemones.add(new Onix());
        pokemones.add(new Doduo());
        pokemones.add(new Meowth());
        pokemones.add(new Machop());
        pokemones.add(new Ekans());
    }

    private static void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("**SIMULADOR DE BATALLAS POKEMON**");
            System.out.println("Bienvenido al simulador POKEMONSTERS");
            System.out.println("Menu principal, selecciona una opción:");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokemones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            String opcion = lector.next();

            switch (opcion) {
                case "1":
                    gestionarEntrenadores();
                    break;
                case "2":
                    gestionarPokemones();
                    break;
                case "3":
                    //LLAMAR AL METODO BATALLA PARA INICIAR LA BATALLA
                    break;
                case "4":
                    System.out.println("Saliendo del juego...Hasta pronto");
                    return;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }
    }

    private static void gestionarEntrenadores() {
        while (true) {
            System.out.println("Opción elegida: Gestionar Entrenadores");
            System.out.println("1. Registrar un nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            String opcion = lector.next();

            switch (opcion) {
                case "1":
                    registrarEntrenador();
                    break;
                case "2":
                    verListaEntrenadores();
                    break;
                case "3":
                    seleccionarEntrenador();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }
    }

    private static void registrarEntrenador() {
        System.out.println("Registra un nuevo entrenador");
        System.out.print("Ingresa el nombre: ");
        String nombre = lector.next();
        entrenadores.add(new Entrenador(nombre));
        System.out.println("Tu entrenador se registró. Nombre: " + nombre);
    }

    private static void verListaEntrenadores() {
        if (entrenadores.isEmpty()) {//verificar si la lista está vacía
            System.out.println("No hay entrenadores registrados.");
        } else {
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
            }
        }
    }

    private static void seleccionarEntrenador() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
            return;
        }

        verListaEntrenadores();
        System.out.print("Selecciona un entrenador por número: ");
        int index = lector.nextInt() - 1;

        if (index >= 0 && index < entrenadores.size()) {
            Entrenador entrenadorSeleccionado = entrenadores.get(index);
            gestionarEquipo(entrenadorSeleccionado);
        } else {
            System.out.println("Número de entrenador no válido.");
        }
    }

    private static void gestionarEquipo(Entrenador entrenador) {
        while (true) {
            System.out.println("Gestionar equipo de " + entrenador.getNombre());
            System.out.println("1. Ver equipo de Pokémones");
            System.out.println("2. Agregar Pokémon al equipo");
            System.out.println("3. Entrenar Pokémon");
            System.out.println("4. Volver a Gestionar Entrenadores");
            String opcion = lector.next();

            switch (opcion) {
                case "1":
                    verEquipo(entrenador);
                    break;
                case "2":
                    agregarPokemonAlEquipo(entrenador);
                    break;
                case "3":
                    //entrenarPokemon(entrenador);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }
    }

    private static void verEquipo(Entrenador entrenador) {
        List<Pokemon> equipo = entrenador.getPokemones();
        if (equipo.isEmpty()) {
            System.out.println("El equipo está vacío.");
        } else {
            for (Pokemon pokemon : equipo) {
                System.out.println(pokemon.getNombre());
            }
        }
    }

    private static void agregarPokemonAlEquipo(Entrenador entrenador) {
        System.out.println("Agregar un nuevo Pokémon al equipo de " + entrenador.getNombre());
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pokemon = pokemones.get(i);
            System.out.println((i + 1) + ". " + pokemon.getNombre() + " (Tipo: " + pokemon.getTipoPokemon() + ", Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosDeAtaque() + ")");
        }
        System.out.print("Selecciona un Pokémon por número: ");
        int index = lector.nextInt() - 1;

        if (index >= 0 && index < pokemones.size()) {
            entrenador.getPokemones().add(pokemones.get(index));
            System.out.println("Pokémon añadido al equipo.");
        } else {
            System.out.println("Número de Pokémon no válido.");
        }
    }


    private static void gestionarPokemones() {
        while (true) {
            System.out.println("Opción elegida: Gestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            String opcion = lector.next();

            switch (opcion) {
                case "1":
                    verPokemonesRegistrados();
                    break;
                case "2":
                    registrarNuevoPokemon();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }
    }

    private static void verPokemonesRegistrados() {
        System.out.println("Todos los Pokémones registrados: ");
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pokemon = pokemones.get(i);
            System.out.println((i + 1) + ". " + pokemon.getNombre() + "\nTipo: " + pokemon.getTipoPokemon() + "\nSalud: " + pokemon.getSalud() + "\nAtaque: " + pokemon.getPuntosDeAtaque());
        }
    }

    private static void registrarNuevoPokemon() {
        // Lógica para registrar un nuevo Pokémon
    }
}