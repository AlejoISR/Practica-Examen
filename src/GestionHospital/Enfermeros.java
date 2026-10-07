package GestionHospital;

import java.lang.classfile.Opcode;
import java.util.ArrayList;
import java.util.Scanner;

public class Enfermeros extends Empleado{
    Scanner scanner = new Scanner(System.in);


    public Enfermeros(String usuario, String contraseña, String departamento) {
        super(usuario, contraseña, departamento);
    }

    @Override
    public void abrirMenu(ArrayList<Empleado> empleados) {

        int opcion;

        while (true) {

            System.out.println("\n1. Ver plantilla \n2. Cambiar de área \n3. Salir ");
            System.out.print("Opcion: ");
            opcion= scanner.nextInt();


            if (opcion == 3) break;

            else if (opcion == 1) {
                System.out.println();

                if (empleados.size() -1 == 0 ) System.out.println("Todavia no hay nadie en el sistema... ");
                for (Empleado empleado: empleados){
                    if (!empleado.getUsuario().equals(getUsuario())) System.out.printf("-  %s\n ",empleado.getUsuario());
                }


            }
            if (opcion == 2){



                System.out.printf("Estas en el departamento %s\n", this.getDepartamento());
                System.out.println();
                System.out.print("Escriba el nuevo departamento que deseas incribirte: ");
                String nuevoDepartamento = scanner.next();

                this.setDepartamento(nuevoDepartamento);
                System.out.println("Departamento actualizado con exito... ");





            }
        }
    }

}
