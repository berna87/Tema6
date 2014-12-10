import java.util.Scanner;
public class Nombre{
	public static void main(String[]ar){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();								//recoge un String de una linea entera
		System.out.println("Frase : "+frase);
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();									//recoge un solo String
		System.out.println("Hola "+nombre);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();									//recoge un int
		System.out.println("Numero introducido : "+numero);
		System.out.println("Introduce un numero con decimales");
		double numerod = sc.nextDouble();							//recoge un double
		System.out.println("Numero introducido : "+numerod);
		sc.close();													//cierro el escaner
		
		Scanner sc2 = new Scanner (System.in);						//inicio un nuevo escaner
		System.out.println("Introduce un valor: ");
		int contador=0;
		while(true){												//bucle infinito
			String palabra=sc2.next();
			if (palabra.equals("1")) contador++;
			if (palabra.equals("salida")) break;					//rompo bucle infinito
			}
		System.out.println("Ha introducido el 1 "+contador+" veces");
		sc2.close();	
	}	
}
