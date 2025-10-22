import java.util.Scanner;
class Calc{
	public static void main(String []args){
		Scanner sca = new Scanner (System.in);
		System.out.println("Dame un numero: ");
		int a =sca.nextInt();
		System.out.println("Dame un numero: ");
                int b =sca.nextInt();
		int rs = Suma (a, b);
		System.out.println("La suma es: "+rs);
		int rr = Resta (a, b);
		System.out.println("La suma es: "+rr);
}

public static int Suma (int n1, int n2){
	return n1 + n2;
}
public static int Resta (int n1, int n2){
        return n1 - n2;
}
}
