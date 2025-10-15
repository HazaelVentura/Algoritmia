import java.util.Scanner;
class Menu{
public static void main(String[] args){
Scanner sca = new Scanner (System.in);
do{
	System.out.println ("**Elige una opcion**");
	System.out.println ("1 - Multiplicacion");
	System.out.println ("2 - Division");
	System.out.println ("0 - Salir");
	int opc = sca.nextInt();
		if (opc==0){
		System.out.println("Saliendo...");
		break;
		}
		if (opc==1){
		System.out.println("Da un numero: ");
		int a = sca.nextInt();
		System.out.println("Da otro numero: ");
		int b = sca.nextInt();
		int rm = Multiplicacion (a, b);
		System.out.println("El resultado de la multiplicacion es de:"+rm);
		}

		if (opc==2){
                System.out.println("Da un numero: ");
                int a = sca.nextInt();
                System.out.println("Da otro numero: ");
                int b = sca.nextInt();
                int rd = Division (a, b);
                System.out.println("El resultado de la division es de:"+rd);
                }


}
while (true);
}
public static int Multiplicacion (int n1, int n2){
	return n1*n2;
	}
public static int Division (int n1, int n2){
	return n1/n2;
	}
}
