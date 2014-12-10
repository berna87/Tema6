//programa que recive valores
//desde la linea de comandos,
//a estos valores se les llama argumentos
//para inicializarlos inicializamos el programa como:
//java Argumentos "valor del argumento1" "valor del argumento2"
//por defecto estos argumentos se recogen como String
public class Argumentos{
	public static void main(String[]arg){
		String argumento1 = arg[0];
		String argumento2 = arg[1];
		System.out.println("El argumento 1 : "+argumento1+ "\nEl argumento 2 : "+argumento2);
		
	
	}
}
