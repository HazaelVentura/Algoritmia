package Services;
import Models.User;
import java.util.Scanner;

public class Login {
    public static void userLogin(){
        Scanner sca = new Scanner(System.in);

    System.out.println("Ingresa tu email: ");
    String email = sca.nextLine();
    System.out.println("Ingresa tu password: ");
    String password = sca.nextLine();

    User u1 = new User();
    u1.setEmail(email);
    u1.setPassword(password);
    }

}
