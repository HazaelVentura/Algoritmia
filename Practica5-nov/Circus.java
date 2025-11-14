import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Circus {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        List <Integrante> personal = new ArrayList<>();
        boolean x = true;
        do{
            try {
                System.out.println("|| ¿Quieres registarte? ||");
                System.out.println("1. Si");
                System.out.println("0. No");
                int reg = sca.nextInt();
                sca.nextLine();
                if (reg == 1) {
                    personal.add(new Integrante());
                    int id = personal.size()+1;
                    personal.get(personal.size()-1).setId(id);
                    System.out.println("Ingresa tu nombre: ");
                    personal.get(personal.size()-1).setNombre(sca.nextLine());
                    System.out.println("Ingresa tu edad: ");
                    personal.get(personal.size()-1).setEdad(sca.nextInt());
                    sca.nextLine();
                    System.out.println("Ingresa tu rol: ");
                    personal.get(personal.size()-1).setRol(sca.nextLine());
                    System.out.println("Ingresa tu habilidad: ");
                    personal.get(personal.size()-1).setHabilidad(sca.nextLine());
                }
                else{
                    for(Integrante i: personal){
                        System.out.println("id: "+i.getId());
                        System.out.println("nombre: "+i.getEdad());
                        System.out.println("edad: "+i.getEdad());
                        System.out.println("rol: "+i.getRol());
                        System.out.println("habilidad: "+i.getHabilidad());
                    }
                    x=false;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }while(x);
    }
}
