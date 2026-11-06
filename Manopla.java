import java.util.Random;

public class Manopla implements Arma {
    private final Random rand = new Random();

    @Override
    public int calcularDano() {
        if (rand.nextInt(100) >= 90) { // 10% de fallo
            System.out.println("¡El ataque rápido con Manopla falló el objetivo!");
            return 0; 
        }
        if (rand.nextInt(100) < 20) { // 20% de crítico
            System.out.println("¡CRÍTICO! La manopla impactó en un punto vital.");
            return 30;
        }
        return rand.nextInt((25 - 10) + 1) + 10; // Daño entre 10 y 25
    }

    @Override
    public String getNombreArma() {
        return "Manopla";
    }
}
