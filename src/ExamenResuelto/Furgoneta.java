package ExamenResuelto;

public class Furgoneta extends Vehiculo {

    public Furgoneta(String marca, int kilometros) {
        super(marca, kilometros);
    }
    @Override
    public void conducir() {
        System.out.println("Furgoneta " + this.getMarca() + " con " + this.getKilometros() + " kilometros - Transporta comida");
    }
}

