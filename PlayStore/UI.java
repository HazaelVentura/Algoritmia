package PlayStore;

import java.util.Scanner;

public class UI {
public static void Usin(){
    Scanner sca = new Scanner(System.in);
    boolean salir = true;
    do {
    try {
        // TODO: handle exception
        System.out.println ("**Elige una opcion**");
	    System.out.println ("1 - Suma");
	    System.out.println ("2 - Resta");
	    System.out.println ("0 - Salir");
	    int opt = sca.nextInt();
        sca.nextLine();
        switch (opt) {
            case 0:
                System.out.println("Saliendo...\n");
                salir=false;
                break;
            case 1:
                Service.Suma();
                break;
            case 2:
                Service.Resta();
                break;
            default:
                System.out.println("Error : Ingresa un número válido.\n");
                break;
        }
    }catch (Exception e) {
        System.out.println("Error: Ingresa un numero entero (da enter).\n");
        sca.nextLine(); // Limpiar el buffer del scanner

    } }while (salir);
    sca.close();
}
    
}


