package simulador.pokemon;

public abstract class Pokemon { 
    //O(1)
    private String nombre; 
    private int salud; 
    private int puntosDeAtaque; 
    private TipoPokemon tipo; 
    private Estado estado; 
    //O(1)
    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo, Estado estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = estado;
    }
    
    public void atacar(Pokemon oponente) {
        int daño = oponente.getPuntosDeAtaque() - oponente.getSalud();
        if (daño < 0) {
            daño = 0;
        }
        oponente.recibirDaño(daño);
    }
    
    public void recibirDaño(int daño) { //O(1) 
        this.salud -= daño;
    }
    
    public void entrenar(){  //O(1) 
       this.salud = salud+20;
       this.puntosDeAtaque = puntosDeAtaque+5;
    }

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
