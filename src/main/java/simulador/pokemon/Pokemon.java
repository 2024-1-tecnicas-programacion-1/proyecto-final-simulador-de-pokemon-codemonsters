package simulador.pokemon;
/**
 * Clase pokemon 
 * Clase padre de todos los pokemones 
 */
public abstract class Pokemon { 
    //O(1)
    /**
     * Atributos :
     */
    private String nombre; 
    private int salud; 
    private int puntosDeAtaque; 
    private TipoPokemon tipo; 
    private Estado estado; 
    //O(1)
    /**
     * Contructor de la clase
     * @param nombre nombre del pokemon
     * @param salud salud del pokemon
     * @param puntosDeAtaque puntos de ataque del pokemon
     * @param tipo tipo del pokemon
     * @param estado estado del pokemon 
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     * 
     */
    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo, Estado estado) { 
        this.nombre = nombre; 
        this.salud = salud; 
        this.puntosDeAtaque = puntosDeAtaque; 
        this.tipo = tipo; 
        this.estado = estado; 
    }
    /**
     * Metodo que ataca al oponente
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     * @param oponente 
     */
    public void atacar(Pokemon oponente) { //O(1)
        int daño = oponente.getPuntosDeAtaque() - oponente.getSalud(); 
        if (daño < 0) { 
            daño = 0; 
        } 
        oponente.recibirDaño(daño); 
    }
    /**
     * Metodo que recibe el daño del oponente 
     * 
     * Complejidad temporal: O(1) Complejidad Constante
     * @param daño 
     */
    public void recibirDaño(int daño) { //O(1) 
        this.salud -= daño; 
    }
    /**
     * Metodo para entrenar a un pokemon 
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void entrenar(){ //O(1) 
       this.salud = salud+20; 
       this.puntosDeAtaque = puntosDeAtaque+5; 
    }
/**
 * Get y set de todos los parametros en el contructor 
 * 
 */
    public String getNombre() { //O(1)
        return nombre; 
    }

    public int getSalud() { //O(1)
        return salud; 
    }

    public int getPuntosDeAtaque() { //O(1)
        return puntosDeAtaque; 
    }

    public TipoPokemon getTipoPokemon() { //O(1)
        return tipo; 
    }

    public Estado getEstado() { //O(1)
        return estado; 
    }

    public void setNombre(String nombre) { //O(1)
        this.nombre = nombre; 
    }

    public void setSalud(int salud) { //O(1)
        this.salud = salud; 
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) { //O(1)
        this.puntosDeAtaque = puntosDeAtaque; 
    }

    public void setTipo(TipoPokemon tipo) { //O(1)
        this.tipo = tipo; 
    }

    public void setEstado(Estado estado) { //O(1)
        this.estado = estado; 
    }
    
}
