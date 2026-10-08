package ExamenResuelto;

public abstract class Vehiculo {


    private final String marca;
    private final int kilometros;

    public Vehiculo(String marca, int kilometros) {
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public abstract void conducir();

    @Override
    public String toString() {
        return this.marca + ":" + this.kilometros + " km";
    }
}
