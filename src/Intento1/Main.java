package Intento1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final static ArrayList<User>users= new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner= new  Scanner(System.in);

        users.add(new Admin("Alejandro", "hola"));
        users.add(new Guest("fulano","adios"));
        users.add(new Guest("pepito","Manolo"));


        int opcion;

        while (true){
            boolean encotrado = false;

            System.out.println("1. Iniciar Sesion: \n2.Cerrar Sesión");
            System.out.print("Opcin: ");
            opcion = scanner.nextInt();

            if (opcion== 2) break;

            else if (opcion == 1) {

                System.out.print("Usuario: ");
                String intentoNombre = scanner.next();

                System.out.print("contraseña: ");
                String intentoContraseña = scanner.next();

                for (User user : users){

                    if (user.verify(intentoNombre,intentoContraseña));

                    encotrado = true;

                    user.actionByUserType(users);

                    break;
                }
            }

            if (!encotrado ) System.out.println("Credenciales Incorrectas...");

        }
        System.out.println();
    }

}
