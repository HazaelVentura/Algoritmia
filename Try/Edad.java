iimpor
class Menu{
public static void main (String []args){

Scanner sca = new Scanner (System.in);
//boolean val = true;
while (true){
try {
        int opt;
        System.out.println("|| Elige una opcion ||");
        System.out.println("1. Hola");
        System.out.println("2. Salir");
        opt = sca.nextInt();

        switch (opt){

                case 1:
                System.out.println("HOLA");
                break;

                case 2:
                System.out.println("Saliendo...");
                System.exit(0);
                //val = false;
                break;

                default:
                  break;
        }
        //if (opt == 2){
        //break;
        //}
     } catch (Exception e){
        System.out.println(e);
}
}
}
}
