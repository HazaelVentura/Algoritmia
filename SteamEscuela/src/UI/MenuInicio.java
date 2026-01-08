package UI;
import java.util.Scanner;
import Service.RegistrationServices;

public class MenuInicio {
    public static void Menu(){
        Scanner sca = new Scanner(System.in);
        do{
            try {
                System.out.println("|| BIENVENIDO ||");
                System.out.println("1. Iniciar Sesion");
                System.out.println("2. Registro");
                System.out.println("------------------");
                System.out.println("0. Salir");
                System.out.println("¿Que desea hacer?");

                int opc = sca.nextInt();
                sca.nextLine();
                switch (opc) {
                    case 1://iniciar sesion
                        
                        break;
                    case 2://registro
                        RegistrationServices.Register();
                        //Menu Principal
                        break;
                    case 0:
                        System.exit(0);
                        break;
                
                    default:
                        break;
                }
            }catch (Exception e) {
                System.out.println(e);
                sca.nextLine();
            }
        } while (true);
    }

}
