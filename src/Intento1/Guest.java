package Intento1;

import java.util.ArrayList;
import java.util.Scanner;

public class Guest extends User {

    // Tu Scanner, perfecto.
    Scanner scanner = new Scanner(System.in);

    public Guest(String username, String password) {
        super(username, password);
    }

    @Override
    public void actionByUserType(ArrayList<User> users) {
        // ¡TODO ESTO AHORA ESTÁ DENTRO DE LAS LLAVES DEL MÉTODO!

        System.out.println("Bienvenido Cani Guest: " + this.getUsername());

        int Opcion;

        while (true) {
            System.out.println("1. Ver usuarios\n2. Cerrar sesión");
            System.out.print("Opcion: ");
            Opcion = scanner.nextInt(); // El programa se pausa aquí esperando que escribas

            if (Opcion == 2) {
                break;
            }
            else if (Opcion == 1) {

                // Aquí es users (la lista), no User (el molde)
                if (users.size() - 1 == 0) {
                    System.out.println("Todavía no hay usuarios...");
                } else {
                    for (User user : users) {
                        if (!user.getUsername().equals(getUsername())) {
                            System.out.println("- " + user.getUsername()); // Cambiado por println para que sea más fácil
                        }
                    }
                }
            }
            else {
                System.out.println("Opcion incorrecta");
            }
        }
    }
}