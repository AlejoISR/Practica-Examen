package Intento1;
import  java.util.ArrayList;
public abstract class User {

    // Creamos tanto el usuario como la contraseña
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean verify(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
    // Le decimos que cada persona que venga a elegir una opcion tiene que tener su propio menu
    public abstract void actionByUserType(ArrayList<User>users);

    }
