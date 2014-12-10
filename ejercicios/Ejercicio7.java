import java.util.Scanner;
public class Ejercicio7{
	public static void main(String[]ar){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de 3 cifras");
		int numero = sc.nextInt();
		sc.close();
		if (numero <= 99 || numero >=1000){
			System.out.println("Valor introducido no valido");
			System.exit(1);
		} 
		int cifra1=numero/100;
		int numero2=numero%100;
		int cifra2=numero2/10;
		int cifra3=numero2%10;
		System.out.printf("Cifras: %-4d%-4d%-4d", cifra1, cifra2, cifra3);
		System.out.println("\n------------------------");
		
	}
}
