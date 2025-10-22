import java.util.Scanner;
public class MainUser {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        System.out.println("Dame el nombre: ");
        String nombre = sca.nextLine();
        System.out.println("Dame la edad: ");
        int edad = sca.nextInt();
        sca.nextLine();
        System.out.println("Dame el correo: ");
        String correo = sca.nextLine();

        Usuario u1 = new Usuario(nombre, correo, edad);
        u1.setNombre(nombre);
        u1.setEdad(edad);
        u1.setCorreo(correo);
        System.out.println("**USUARIO**\n"+ "Nombre: "+u1.getNombre()+"\nEdad: "+u1.getEdad()+"\nCorreo: "+u1.getCorreo());
    }
}
