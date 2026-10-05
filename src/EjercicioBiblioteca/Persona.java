package EjercicioBiblioteca;

import java.util.ArrayList;

public abstract class Persona {

       private final String usuario;
       private final String contraseña;

    public Persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;

    }

    public String getUsuario() {
        return usuario;

    }
    public boolean comparar (String usuario, String contraseña){
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);

    }
    public abstract void mostrarMenu(ArrayList<Persona> usuarios);
}
