public class Motocicleta extends VehiculoBase {

    public Motocicleta(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int velocidad) {
        if(velocidad > 0 && velocidad <= 150) {
            super.acelerar(velocidad);
        } else if(velocidad > 150) {
            System.out.println("La motocileta solo puede acelerar hasta 150 km/h");
        } else {
            System.out.println("La motocicleta de marca " + super.marca + " esta acelerando");
        }
    }

}
