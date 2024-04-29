public class Automovil extends VehiculoBase {

    public Automovil(String marca) {
        super(marca);
    }

    public void acelerar(int velocidad) {
        if(velocidad > 0) {
            super.acelerar(velocidad);
            System.out.println("El automovil de marca " + super.marca + " esta acelerando");
        } else {
            System.out.println("El automovil no esta acelerando");
        }
    }
}
