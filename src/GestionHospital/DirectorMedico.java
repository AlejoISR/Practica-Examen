package GestionHospital;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectorMedico extends Empleado{
    Scanner scanner = new Scanner(System.in);

    public DirectorMedico(String usuario, String contraseña, String departamento) {
        super(usuario, contraseña, departamento);
    }

    @Override
    public void abrirMenu(ArrayList<Empleado> empleados) {

        int opcion;

        while (true){
            System.out.println("\n1. Ver pantilla \n2. Contratar enfermeros \n3. Salir");
            System.out.print("Opcion: ");
            opcion= scanner.nextInt();


            if(opcion==3) break;

            else if (opcion==1) {
                System.out.println();
                if (empleados.size() -1 ==0) System.out.println("No hay nadie en la plantilla " );

                for(Empleado empleado: empleados){
                    if (!empleado.getUsuario().equals(getUsuario())) System.out.printf("- %s\n ",empleado.getUsuario());
                }

            }
            if (opcion==2){

                System.out.print("Nuevo Nombre de empleado: ");
                String NuevoEmpleado= scanner.next();
                System.out.println();

                System.out.print("Nueva contraseña: ");
                String NuevaContraseña=scanner.next();
                System.out.println();

                System.out.print("Departamento donde se va a destinar");
                String NuevoDepartamento= scanner.next();
                System.out.println();

                boolean alarma = false;


                // CORRECCIÓN: Comprobamos si el nombre existe en la lista (usando NuevoEmpleado, no getUsuario())
                for (Empleado empleado : empleados) {
                    if (empleado.getUsuario().equals(NuevoEmpleado)) {
                        System.out.println("Empleado ya existente ....");
                        alarma = true;
                        break;
                    }
                }
                
                // CORRECCIÓN: Añadidas las llaves correctas
                if (!alarma) {
                    Enfermeros alta = new Enfermeros(NuevoEmpleado, NuevaContraseña, NuevoDepartamento);
                    empleados.add(alta);
                    System.out.println("Se ha creado con exito...");
                }
            } // Fin if opcion == 2
        } // Fin while
    } // Fin abrirMenu
} // Fin clase
