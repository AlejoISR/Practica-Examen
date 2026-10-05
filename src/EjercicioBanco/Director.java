package EjercicioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Director extends Cuenta{

    Scanner scanner = new Scanner(System.in);


    public Director(String titular, String pin, double saldo) {
        super(titular, pin, saldo);
    }

    @Override
    public void menuCajero(ArrayList<Cuenta> cuentas) {
        int opcion;
        while (true){
            System.out.println("\n1. Ver cuentas existentes \n2. Creear Nueva Cuenta \n3.Salir ");
            opcion= scanner.nextInt();



            if ( opcion == 3 ) break;


            else if ( opcion == 1) {

                if (cuentas.size() -1 == 0){
                    System.out.println("Aún no hay cloentes: ");

                }
                else {
                    for (Cuenta cuenta : cuentas){
                        if (!cuenta.getTitular().equals(this.getTitular())){

                            System.out.println("- Cliente: "+ cuenta.getTitular()+ "|Saldo: "+ cuenta.getSaldo()+ "€");

                        }
                        
                    }
                }

            } else if (opcion== 2) {
                System.out.print("Nuevo Titular:");
                String nuevoTitular = scanner.next();

                System.out.println("Nueva Pin:");
                String nuevoPin = scanner.next();

                System.out.println("Nuevo saldo");
                double nuevoSaldo= scanner.nextDouble();

                boolean alarma = false;


                for (Cuenta cuenta : cuentas){
                    if (cuenta.getTitular().equals(getTitular()));
                    System.out.println("Usuario ya existente :(");
                    alarma = true;
                    break;

                }
                if(!alarma){
                    CuentaAhorro nuevoTitulo = new CuentaAhorro(nuevoTitular,nuevoPin,nuevoSaldo);
                    cuentas.add(nuevoTitulo);
                    System.out.println("Usuario creado correctamente :)");
                }
                }

                
            }

        }

    }

