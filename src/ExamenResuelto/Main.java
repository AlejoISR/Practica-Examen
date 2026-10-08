package ExamenResuelto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        vehiculos.add(new Coche("Ford", 430000, "Rojo"));
        vehiculos.add(new Coche("Opel", 100000, "Azul"));
        vehiculos.add(new Coche("BMW", 20000, "Negro"));
        vehiculos.add(new Furgoneta("Mercedes", 50000));


        while (true) {
            System.out.println("\n1. Ver vehiculos \n2. Crear coche \n3. Conducir vehiculo por marca \n4. Salir");
            System.out.print("OPCIÓN: ");
            int opcion = scanner.nextInt();


            if (opcion == 4) break;

            else if (opcion == 1) {

                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println(vehiculo);
                }

            }
            if (opcion == 2) {
                System.out.print("Marca de coche: ");
                String marcaNuevo = scanner.next();

                System.out.print("kilometros del coche: ");
                int kilometrosNuevo = scanner.nextInt();

                System.out.print("Color: ");
                String colorNuevo = scanner.next();
                Coche nuevoCoche = new Coche(marcaNuevo, kilometrosNuevo, colorNuevo);
                vehiculos.add(nuevoCoche);
                System.out.println("¡Coche guardado en el concesionario!");
            } else if (opcion == 3) {
                System.out.print("Marca a buscar: ");
                String marcaBuscada = scanner.next();

                for (Vehiculo vehiculo : vehiculos) {
                    if (vehiculo.getMarca().equals(marcaBuscada)) {
                        vehiculo.conducir();


                    }
                }
            }
        }
    }
}