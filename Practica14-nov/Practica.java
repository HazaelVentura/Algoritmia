import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Practica {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        boolean x = true;
        do {
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
                        x=false;
                        break;
                
                    default:
                        break;
                }

                System.out.println ("**Elige una opcion**");
	            System.out.println ("1 - Suma");
	            System.out.println ("2 - Resta");
	            System.out.println ("3 - Division");
                System.out.println ("4 - Modulo");
                System.out.println ("0 - Salir");

                switch (Usuario) {
                    case 0:
                        
                        break;
                
                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (x);

    }
}
