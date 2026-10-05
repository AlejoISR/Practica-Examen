package EjercicioBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Socio extends Persona{
    Scanner scanner = new Scanner(System.in);

    public Socio(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    @Override
    public void mostrarMenu(ArrayList<Persona> usuarios) {

        while (true) {

            System.out.println("\n1. Ver Personas \n2. Cerrar sesion");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();


            if (opcion == 2) break;

            else if (opcion == 1) {
                if (usuarios.size() - 1 == 0)
                    System.out.println("todavia no hay gente.....");

                else {
                    for (Persona usuario : usuarios) {
                        if (usuario.getUsuario().equals(getUsuario())) {
                            System.out.println("- " + usuario.getUsuario());
                        }
                    }
                }
            } else {
                System.out.println("Opcion incorrecta ");
            }
        }
    }
}
