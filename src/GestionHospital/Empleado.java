package GestionHospital;

import java.util.ArrayList;

public abstract class Empleado {

    private final String usuario;
    private final String contraseña;
    private String departamento;

    public Empleado(String usuario, String contraseña,String departamento) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.departamento= departamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // CORRECCIÓN: Quitamos el departamento porque en el login solo usamos nombre y password
    boolean comprobarLista(String usuario,String contraseña){
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public abstract void abrirMenu (ArrayList<Empleado> empleados);

}
