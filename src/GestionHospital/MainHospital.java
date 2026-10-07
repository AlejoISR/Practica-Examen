package GestionHospital;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHospital {
    private final static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        empleados.add(new DirectorMedico("ale","hola","Jefe"));
        empleados.add(new Enfermeros("q","2","Enfermeros"));
        empleados.add(new Enfermeros("w","e","Enfermero"));


        int opcion;

        while (true){

            boolean alarma = false;
            System.out.println("\n1. Iniciar sesion\n2. Salir");
            System.out.println();
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            if(opcion == 2 ) break;

            else if (opcion == 1) {

                System.out.print("Introduce el Usuario: ");
                String intentodeUsuario= scanner.next();
                System.out.println();

                System.out.print("Introduce la contraseña: ");
                String intentoContraseña = scanner.next();
                System.out.println();

                for(Empleado empleado: empleados){
                    if (empleado.comprobarLista(intentodeUsuario, intentoContraseña)) {
                        alarma = true; // ¡Coincide! Encendemos la bombilla
                        empleado.abrirMenu(empleados); // Le abrimos la puerta a su menú
                        break;
                    }
                }
                
                // CORRECCIÓN: Aviso si no se encuentra
                if (!alarma) {
                    System.out.println("Credenciales incorrectas.");
                }
            }

        }
    }
}
