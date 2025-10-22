package PlayStore;
import java.util.Scanner;

public class Service{
    public static void Suma(){
        Scanner sca = new Scanner(System.in);
        System.out.println("||Registro de numeros||");
        System.out.println("Ingrese un numero");
        int n1 = sca.nextInt();
        sca.nextLine();
        System.out.println("Ingrese otro numero");
        int n2 = sca.nextInt();
        sca.nextLine();
        Apps a1 = new Apps();
        a1.setN1(n1);
        a1.setN2(n2);
        int r = a1.getN1() + a1.getN2() ;
        System.out.println("**El resultado es: "+r+"**\n");
    }
    public static void Resta(){
        Scanner sca = new Scanner(System.in);
        System.out.println("||Registro de numeros||");
        System.out.println("Ingrese un numero");
        int n1 = sca.nextInt();
        sca.nextLine();
        System.out.println("Ingrese otro numero");
        int n2 = sca.nextInt();
        sca.nextLine();
        Apps a1 = new Apps();
        a1.setN1(n1);
        a1.setN2(n2);
        int r = a1.getN1() - a1.getN2() ;
        System.out.println("**El resultado es: "+r+"**\n");
    }      
}
