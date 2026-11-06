public class JuegoLucha {
    private Peleador jugador1;
    private Peleador jugador2;

    public JuegoLucha(Peleador j1, Peleador j2) {
        this.jugador1 = j1;
        this.jugador2 = j2;
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        System.out.println("\n--- RESULTADO ---");
        if (jugador1.estaVivo()) {
            System.out.println("¡" + jugador1.getNombre() + " ha ganado la pelea!");
        } else {
            System.out.println("¡" + jugador2.getNombre() + " ha ganado la pelea!");
        }
    }

    private void turno(Peleador atacante, Peleador defensor) {
        atacante.atacar(defensor);
    }

    public static void main(String[] args) {
        // Uso de fábricas para crear combatientes listos
        CreadorPeleador fabricaBoxeador = new CreadorBoxeador();
        CreadorPeleador fabricaCallejero = new CreadorCallejero();

        Peleador p1 = fabricaBoxeador.crearPeleador("Rocky (Boxeador)");
        Peleador p2 = fabricaCallejero.crearPeleador("Tyson (Callejero)");

        // Iniciar el motor
        JuegoLucha combate = new JuegoLucha(p1, p2);
        combate.iniciarPelea();
    }
}