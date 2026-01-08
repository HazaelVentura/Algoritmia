package Service;
import Models.Users;
import java.util.Scanner;

public class RegistrationServices {
    public static void Register(){
    Scanner sca = new Scanner(System.in);
    
    System.out.println("Ingresa tu nombre: ");
    String name = sca.nextLine();
    System.out.println("Ingresa tu email: ");
    String email = sca.nextLine();
    System.out.println("Ingresa tu password: ");
    String pass = sca.nextLine();
    
    Users usuario = new Users();
    usuario.setNombre(name);
    usuario.setCorreo(email);
    usuario.setContraseña(pass);
    }
}
