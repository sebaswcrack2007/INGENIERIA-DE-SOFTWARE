import java.util.Random;

public class GuanteYeso implements Arma {
    private final Random rand = new Random();

    @Override
    public int calcularDano() {
        if (rand.nextInt(100) >= 70) { // 30% de fallo
            System.out.println("¡El golpe pesado con yeso fue demasiado lento y lo esquivaron!");
            return 0;
        }
        if (rand.nextInt(100) < 40) { // 40% de crítico
            System.out.println("¡CRÍTICO BRUTAL! El guante de yeso destrozó la defensa.");
            return 30;
        }
        return rand.nextInt((29 - 15) + 1) + 15; // Daño entre 15 y 29
    }

    @Override
    public String getNombreArma() {
        return "Guante de Yeso";
    }
}