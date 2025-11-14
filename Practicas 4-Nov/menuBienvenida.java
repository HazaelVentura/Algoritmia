import java.util.Scanner;
public class menuBienvenida {
    public static void main(String [] args){
        Scanner sca = new Scanner (System.in);
        System.out.println("Ingresa tu nombre completo: ");
        String name = sca.nextLine();

        System.out.println("\nIngrese su edad: ");
        String age = sca.nextLine();

        System.out.println("\nIngrese su correo: ");
        String mail = sca.nextLine();

        System.out.println("\n¿Cual es tu hobbie?");
        System.out.println("Ingresalo a continuacion: ");
        String hobbie = sca.nextLine();

        System.out.println("\n¿En que escuela estudia?");
        System.out.println("Ingrese el nombre escuela acontinuacion: ");
        String school = sca.nextLine();

        System.out.println("\nIngrese cual es su estado civil: ");
        String maritalStatus = sca.nextLine();

        String [] a = {name, age, mail, hobbie, school, maritalStatus};
        System.out.println(a);
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
