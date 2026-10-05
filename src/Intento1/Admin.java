package Intento1;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
    }


    @Override
    public void actionByUserType(ArrayList<User> users) {

        System.out.print("Bienvenido Señor Admin: "+ this.getUsername());
        System.out.println();

        int Opcion;

        while (true){

            System.out.println("1. Ver Usuarios \n2. Creear Usuarios \n3. Cerrar Sesion");
            System.out.print("Opcion: ");
            Opcion = scanner.nextInt();

            if (Opcion== 3)break;

            else if (Opcion == 1) {

                if (users.size() -1 == 0) System.out.println("Todavia no hay usuarios");

                else {

                    for (User user : users){
                        if (!user.getUsername().equals(getUsername()));
                        System.out.println("-  "+user.getUsername());
                    }
                }
            } else if (Opcion == 2) {

                System.out.print("Nuevo Nombre: ");
                String nuevoNombre= scanner.next();
                System.out.println();
                System.out.print("Nueva Contraseña: ");
                String nuevaContraseña = scanner.next();

                boolean alarma = false;


                for (User user : users){
                    if (user.getUsername().equals(getUsername()));
                    System.out.println("Usuario ya existente....");
                    alarma = true;
                    break;

                }
                if (!alarma) {
                    Guest nuevoInvitado = new Guest(nuevoNombre,nuevaContraseña);
                    users.add(nuevoInvitado);
                    System.out.println("Usuario creado correctamente...");
                }
            }else System.out.println("Opcion Incorrecta ");
        }

        }
    }

