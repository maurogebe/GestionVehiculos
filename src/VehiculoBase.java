public class VehiculoBase implements Vehiculo {

    protected String marca;
    private int velocidadActual;
    private boolean estadoMovimiento;

    public VehiculoBase(String marca) {
        this.marca = marca;
        this.estadoMovimiento = false;
        this.velocidadActual = 0;
    }

    @Override
    public void arrancar() {
        this.estadoMovimiento = true;
    }

    @Override
    public void detener() {
        this.velocidadActual = 0;
        this.estadoMovimiento = false;
        System.out.println("El vehiculo se detuvo");
    }

    @Override
    public void acelerar(int velocidad) {
        this.arrancar();
        this.velocidadActual += velocidad;
    }

    @Override
    public void frenar() {
        if(this.estadoMovimiento) {
            this.velocidadActual -= 10;
            if(this.velocidadActual <= 0) {
                this.velocidadActual = 0;
                this.detener();
            }
        } else {
            System.out.println("El vehiculo ya esta detenido");
        }
    }

    @Override
    public String obtenerMarca() {
        return this.marca;
    }

    @Override
    public String obtenerEstado(String tipoVehiculo) {
        if(this.estadoMovimiento) return "El " + tipoVehiculo + " de marca " + this.marca + " va a una velocidad de " + this.velocidadActual + " km/h";
        return "El " + tipoVehiculo + " de marca " + this.marca + " esta detenido";
    }
}
