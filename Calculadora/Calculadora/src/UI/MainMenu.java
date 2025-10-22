package UI;

import java.util.Scanner;
public class MainMenu {
public static void Registro(){
    Scanner sca = new Scanner(System.in);

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
            break;
        case 1:
            Service.registrarUsuario();
        default:
            break;
    }

}
}
