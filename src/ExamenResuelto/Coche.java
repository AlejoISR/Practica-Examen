package ExamenResuelto;

public class Coche extends Vehiculo {

    private final String color;


    public Coche(String marca, int kilometros, String color) {
        super(marca, kilometros);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void conducir() {

        System.out.println("Coche " + this.getMarca() + " de color " + this.color + " con " + this.getKilometros() + " kilometros - Viajando");



    }
}
