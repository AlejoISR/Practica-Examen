package EjercicioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBanco {
    private final static ArrayList<Cuenta>cuentas =new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        cuentas.add(new Director("admin", "ale", 1000));
        cuentas.add(new CuentaAhorro("pepito", "1", 10));

        int opcion;
        while (true) {
            boolean alarma = false;

            System.out.println("\n1. Iniciar Sesion \n2. Cerrar sesion");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 2) break;

            else if (opcion == 1) {

                System.out.print("Introduce Nombre");
                String intentoTitular = scanner.next();

                System.out.println("Introduce el PIN");
                String intentoPin = scanner.next();


                for (Cuenta cuenta : cuentas) {

                    if (cuenta.comprobar(intentoTitular, intentoPin)) ;
                    alarma = true;
                    cuenta.menuCajero(cuentas);
                    break;
                }

                if (!alarma) System.out.println("Credenciales incorrectas... ");


            }
            System.out.println();

        }
    }
}
