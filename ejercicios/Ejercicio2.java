
public class Ejercicio2{
	public static void main(String[]ar){
		System.out.println("numeros del 1 al 10");
		for (int i=1;i<=10;i++){
			System.out.printf("%-4d",i);
			}
		System.out.println("\n---------------------------");	
		System.out.println("la serie: 20, 25, 30... hasta el 80");
		int valor1 = 20;
		while(valor1 <=80){
			System.out.printf("%-4d",valor1);
			valor1 += 5;
		}
		System.out.println("\n---------------------------");	
		System.out.println("la serie: 100, 98, 96... hasta el 50");
		int valor2 =100;
		do {
			System.out.printf("%-4d",valor2);
			valor2 -= 2;
		} while (valor2 >= 50);
		System.out.println("\n---------------------------");	
		System.out.println("Suma de los numeros enteros del 1 al 100");
		int valor3=0;
		for(int i=0;i<=100;i++){
			valor3 += i;
			}
		System.out.println(valor3);
		System.out.println("---------------------------");	
		System.out.println("Suma de los cuadrados de los 15 primeros numeros naturales");
		int valor4 = 0;
		int contador4 = 0;
		while(contador4 <= 15){
			valor4+=contador4*contador4;
			contador4++;
		}
		System.out.println(valor4);
		System.out.println("---------------------------");	
		System.out.println("Suma de los pares e impares entre 1 y 50");
		int valor5imp=0;
		int valor5par=0;
		int contador5=0;
		do{
			if(contador5%2==0)  valor5par+=contador5;  //si solo se ejecuta una sentencia no es necesario 
			else  valor5imp+=contador5;
			contador5++;
		}while (contador5<=50);
		System.out.println("pares= "+valor5par);
		System.out.println("impares= "+valor5imp);
		System.out.println("---------------------------");	
		System.out.println("tabla de multiplicar de un numero solicitado por argumentos");
		int contador6 = 0;
		int valor6 = Integer.parseInt(ar[0]);
		for(int i=1;i<=10;i++){
			System.out.println(valor6 +"x"+ i + "=" + (valor6*i));	
		}
	}
}
