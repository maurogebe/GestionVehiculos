public class Main {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Toyota");
        Motocicleta moto = new Motocicleta("Honda");

        auto.acelerar(60);
        auto.frenar();
        String estadoAuto = auto.obtenerEstado("Auto");
        System.out.println(estadoAuto);
        auto.detener();

        moto.acelerar(120);
        moto.frenar();
        String estadoMoto = moto.obtenerEstado("Moto");
        System.out.println(estadoMoto);
        moto.detener();

    }
}