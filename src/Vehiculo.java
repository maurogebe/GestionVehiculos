public interface Vehiculo {

    void arrancar();

    void detener();

    void acelerar(int velocidad);

    void frenar();

    String obtenerMarca();

    String obtenerEstado(String tipoVehiculo);
}
