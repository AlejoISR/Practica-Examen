package EjercicioBanco;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Cuenta {

    private final String titular;
    private final String pin;
    private double saldo;

    public Cuenta(String titular, String pin, double saldo) {
        this.titular = titular;
        this.pin = pin;
        this.saldo= saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double nuevosaldo) {
        this.saldo = nuevosaldo;
    }

    public  boolean comprobar( String titular, String pin ){

        return this.titular.equals(titular) && this.pin.equals(pin);

    }
    public abstract void menuCajero(ArrayList<Cuenta> cuentas);
}
