package simulador.batalla;

import simulador.pokemon.Pokemon;

public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("¡La batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + " ha comenzado!");

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            // El primer Pokémon ataca al segundo
            atacar(pokemon1, pokemon2);
            if (pokemon2.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " ha sido derrotado. " + pokemon1.getNombre() + " es el ganador.");
                return;
            }

            // El segundo Pokémon ataca al primero
            atacar(pokemon2, pokemon1);
            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon1.getNombre() + " ha sido derrotado. " + pokemon2.getNombre() + " es el ganador.");
                return;
            }
        }
    }
    public int atacar(Pokemon atacante, Pokemon defensor) {
        int daño = atacante.getPuntosDeAtaque() - defensor.getSalud();
        if (daño < 0) {
            daño = 0;
        }
        defensor.setSalud(defensor.getSalud() - daño);
        return daño;
    }
}

