package simulador;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("**SIMULADOR DE BATALLAS POKEMON**");
        System.out.println("Bienvenido al simulador POKEMONSTERS");
        System.out.println("Menu principal, selecciona una opción:");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokemones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
        String opcionMenú1 = lector.next();
        switch (opcionMenú1){//gestionar entrenadores
            case "1":
                System.out.println("Opción elegida: Gestionar Entrenadores");
                System.out.println("1. Registrar un nuevo entrenador");
                System.out.println("2. Ver lista de entrenadores");
                System.out.println("3. Seleccionar un entrenador");
                System.out.println("4. Volver al menu principal");
                String opcionSubMenu1 = lector.next();
                switch (opcionSubMenu1){
                    case "1":
                        //registrar un nuevo entrenador
                        break;
                    case "2":
                        //ver lista de entrenadores
                        break;
                    case "3":
                        System.out.println("Elige una opcion:");
                        System.out.println("1. Ver equipo de Pokémones");
                        System.out.println("2. Agregar Pokémon al equipo");
                        System.out.println("3. Entrenar Pókemon");
                        System.out.println("4. Volver a Gestionar Entrenadores");
                        String opcionSubSubMenu1 = lector.next();
                        switch (opcionSubSubMenu1){
                            case"1":
                                //mostrar equipo de pokemones
                                break;
                            case"2":
                                //agregar pokemon
                                break;
                            case"3":
                                //entrenar al pokemon
                                break;
                            case"4":
                                //volver
                                break;
                                
                        }
                    case"4":
                        //volver
                        break;
                }
            case"2":
                System.out.println("Opción elegida: Gestionar Pokémones");
                System.out.println("1. Ver todos los Pokémones registrados");
                System.out.println("2. Registrar nuevo Pokémon");
                System.out.println("3. Volver al menú principal");
                String opcionSubMenu2 = lector.next();
                switch(opcionSubMenu2){
                    case"1":
                        //mostrar todos los pokemones registrados
                        break;
                    case"2":
                        //registrar nuevo pokemon
                        break;
                    case"3":
                        //volver al menu principal
                        break;
                }
            case"3":
                System.out.println("Opción elegida: Iniciar batalla");
                System.out.println("1. Elegir entrenador 1");
                System.out.println("2. Elegir entrenador 2");
                System.out.println("3. Seleccionar Pokémon de entrenador 1");
                System.out.println("4. Seleccionar Pokémon de entrenador 2");
                System.out.println("5. Comenzar batalla");
                System.out.println("6. Volver al menú principal");
                
            case"4":
                System.out.println("Saliendo del juego...Hasta pronto");
                break;  
        }               
    }
}
