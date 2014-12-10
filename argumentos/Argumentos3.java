//ejecutar el programa insertando como argumentos "valor1" "operacion: +,-,x-/" "valor2"
public class Argumentos3{
	public static void main(String[]arg){
		int valor1 = Integer.parseInt(arg[0]); //recojo valores como argumentos y los transformo a int
		int valor2 = Integer.parseInt(arg[2]);
		int operacion = Integer.parseInt(arg[1]);
		if (operacion == 1){
			System.out.println(""+valor1+"+"+valor2+"="+(valor1+valor2));
		} else if (operacion == 2){
			System.out.println(""+valor1+"-"+valor2+"="+(valor1-valor2));
		} else if (operacion == 3){
		System.out.println(""+valor1+"*"+valor2+"="+(valor1*valor2));
		} else if (operacion == 4){
		System.out.println(""+valor1+"/"+valor2+"="+(valor1/valor2));
		} else {
			System.out.println("Operacion no permitida");}
	}
}
