//ejecutar el programa insertando como argumentos "valor1" "operacion: +,-,x-/" "valor2"
public class Argumentos2{
	public static void main(String[]arg){
		int valor1 = Integer.parseInt(arg[0]); //recojo valores como argumentos y los transformo a int
		int valor2 = Integer.parseInt(arg[2]);
		switch(arg[1]){
			case "+":
			System.out.println(valor1+""+"+"+valor2+"="+(valor1+valor2));
			break;
			case "-":
			System.out.println(valor1+""+"-"+valor2+"="+(valor1-valor2));
			break;
			case "x":
			System.out.println(valor1+""+"x"+valor2+"="+(valor1*valor2));
			break;
			case "/":
			System.out.println(valor1+""+"/"+valor2+"="+(valor1/valor2));
			break;
			default:
				System.out.println("Operacion : "+ arg[1] + " no permitida");
		}	
	}
}
