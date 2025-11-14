package UI;

import Services.Login;
import Services.Registro;
import java.util.Scanner;
public class MainMenu {
public static void Registro(){
    Scanner sca = new Scanner(System.in);
    boolean salir = true;
while (salir) {
    try {
        System.out.println("=== Bienvenido ===");
    System.out.println("1. Registro ");
    System.out.println("2. Iniciar Sesion ");
    System.out.println("------------------");
    System.out.println("0. Salir ");
    int opt = sca.nextInt();
    sca.nextLine();

    switch (opt) {
        case 0:
            System.out.println("Saliendo...\n");
            salir=false;
            break;
            
        case 1:
            Registro.registrarUsuario();
            break;

        case 2:
            Login.userLogin();
            System.out.println("|| BIENVENIDO A BORDO ||\n");
            break;

        default:
            break;
    }
    } catch (Exception e) {
        System.out.println(e);
    }
    
    
}
    

}
}
