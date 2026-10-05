package EjercicioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaAhorro extends Cuenta{
    Scanner scanner = new Scanner(System.in);


    public CuentaAhorro(String titular, String pin, double saldo) {
        super(titular, pin, saldo);
    }

    @Override
    public void menuCajero(ArrayList<Cuenta> cuentas) {

        int opcion;
        while (true){

            System.out.println("\n1. Ver Saldo \n2.Ingresar Dinero \n3. Retirar Dinero \n4. Salir ");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 4) break;

            else if (opcion == 1) {
                System.out.println("Tu saldo es de "+ this.getSaldo());

            }
            if (opcion == 2 ){

                System.out.println("Cantidad de dinero que deseas ingresar: " );
                double cantidad = scanner.nextDouble();

                this.setSaldo(getSaldo()+cantidad);

            }
            if (opcion == 3){
                System.out.println("Cantidad de dinero que desea retirar: ");
                double cantidad = scanner.nextDouble();

                this.setSaldo(getSaldo()-cantidad);
            }
            else System.out.println("opcion incorrecta ");
        }
    }

}
