package Services;
import Models.User;
import java.util.Scanner;

public class Registro {
    public static void registrarUsuario(){
            Scanner sca = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");
    String name = sca.nextLine();
    System.out.println("Ingresa tu email: ");
    String email = sca.nextLine();
    System.out.println("Ingresa tu password: ");
    String password = sca.nextLine();
    
    User u1 = new User();
    u1.setName(name);
    u1.setEmail(email);
    u1.setPassword(password);
    }

    
}
