public class CreadorCallejero extends CreadorPeleador {
    @Override
    public Peleador crearPeleador(String nombre) {
        Arma arma = new Manopla();
        return new Callejero(nombre, arma);
    }
}