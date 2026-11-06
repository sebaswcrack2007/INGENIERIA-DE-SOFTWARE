public class CreadorBoxeador extends CreadorPeleador {
    @Override
    public Peleador crearPeleador(String nombre) {
        Arma arma = new GuanteYeso();
        return new BoxeadorClandestino(nombre, arma);
    }
}