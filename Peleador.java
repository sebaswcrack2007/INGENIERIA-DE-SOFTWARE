public abstract class Peleador {
    private String nombre;
    private int hp;
    private Arma arma; // El puente estructural hacia la interfaz

    public Peleador(String nombre, Arma arma) {
        this.nombre = nombre;
        this.hp = 100; // Vida inicial
        this.arma = arma;
    }

    public void atacar(Peleador oponente) {
        System.out.println("\n--- Turno de " + this.nombre + " ---");
        int danoCausado = this.arma.calcularDano();
        
        if (danoCausado > 0) {
            System.out.println(this.nombre + " ataca con " + this.arma.getNombreArma() + " causando " + danoCausado + " de daño.");
            oponente.recibirDano(danoCausado);
        } else {
            System.out.println(this.nombre + " no logró hacer daño a " + oponente.getNombre());
        }
    }

    public void recibirDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println("  -> " + this.nombre + " ahora tiene " + this.hp + " HP.");
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public String getNombre() {
        return this.nombre;
    }
} 