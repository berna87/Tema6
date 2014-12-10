import java.util.Scanner;
public class DiezNumeros{
	public static void main(String[]ar){
	Scanner sc = new Scanner(System.in);
		final int CANTIDAD_NUMEROS = 12;
		System.out.println("Introduce "+CANTIDAD_NUMEROS+ " numeros");
		System.out.println("Valores introducidos : ");
			double suma = 0;
			for (int i=0; i<CANTIDAD_NUMEROS;i++){				//formateo el texto usando un bucle for
				double valor = sc.nextDouble();
				suma+=valor;
				if(i%2==0 && i != 0) System.out.println();		//cada vez que el contador i sea par introduzco un alto de linea
				System.out.printf("%-8.2f",valor);
						
			}
		System.out.println();	
		System.out.println("Valor medio : "+suma/CANTIDAD_NUMEROS);
	/*	double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		double num5=sc.nextDouble();
		double num6=sc.nextDouble();
		double num7=sc.nextDouble();
		double num8=sc.nextDouble();
		double num9=sc.nextDouble();
		double num10=sc.nextDouble();
		double num11=sc.nextDouble();
		double num12=sc.nextDouble();
		sc.close();
		double media= (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10+num11+num12)/12;
		System.out.println("Valor medio = "+media);
		System.out.printf("%6.2f%6.2f%n%6.2f%6.2f%n%6.2f%6.2f%n%6.2f%6.2f%n%6.2f%6.2f%n%6.2f%6.2f",num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12);				
		*/
	}
}
