package EjercicioBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotecario extends Persona{

    Scanner scanner = new Scanner(System.in);

    public Bibliotecario(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    @Override
    public void mostrarMenu(ArrayList<Persona> usuarios) {
        int opcion;
        boolean alarma;


        while (true) {

                System.out.println("\n1. Ver Personas \n2. Crear Usuarios \n3. Cerrar sesion");
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
                alarma = false;


                if (opcion == 3) break;

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
                }
        }
    }
}
