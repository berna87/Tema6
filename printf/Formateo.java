public class Formateo{
	public static void main(String[]ar){
		double valor1 = 23.32542;
		int valor2= 5;
		System.out.printf("%.2f %n", valor1); //imprimira el valor 1 con 2 decimales, el %n indica salto de linea
		System.out.printf("%d %n", valor2); //imprimira el valor 2
		System.out.printf("valor1= %f valor2= %d %n", valor1, valor2); //imprime los dos valores
		System.out.printf("valor1 con 3 decimales = %+.3f %n" ,valor1); //imprime el valor1 con 3 dcimales y un simbolo + delante
		System.out.printf("valor1 con 10 digitos en la parte entera y 2 decimales = %10.2f %n" ,valor1); //insertara espacios en blanco donde no haya numero
		System.out.printf("valor1 con 10 digitos en la parte entera y 2 decimales = %010.2f %n" ,valor1); //insertara 0 donde no haya numero
		System.out.printf("valor2 con 10 digitos en la parte entera y 2 decimales = %010d %n" ,valor2); //valor 2 utilizando 10 digitos, insertara 0 donde no hay un digito
		System.out.println("-----------------------------------");
		System.out.printf("%8d%8s%8.1f %n",1234 , "java", 5.6);
		System.out.printf("%-8d%-8s%-8.1f %n",1234 , "java", 5.6); //añadiendo el simbolo -antes del valor alinea los digitos a la izquierda y los espacios en blanco a la derecha
	
	}
}
