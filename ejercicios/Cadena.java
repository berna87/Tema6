public class Cadena{
public static void main(String[]ar){
	System.out.println("\"hola\".contains(\"ol\")= "+"hola".contains("ol")); 	//true
	System.out.println("\"hola\".contains(\"ol\")= "+"hola".contains("ha"));	//false
	System.out.println("-------------------");
	System.out.println("\"hola\".endsWith(\"ol\")= "+"hola".endsWith("la"));	//true
	System.out.println("\"hola\".endsWith(\"ol\")= "+"hola".endsWith("ho"));	//false
	System.out.println("-------------------");
	System.out.println("\"hola\".startsWith(\"ol\")= "+"hola".startsWith("la"));	//false
	System.out.println("\"hola\".startsWith(\"ol\")= "+"hola".startsWith("ho"));	//true
	System.out.println("-------------------");
	System.out.println("\"hola\".isEmpty()= "+"hola".isEmpty());	//false
	System.out.println("\"\".isEmpty()= "+"".isEmpty());	//true
	System.out.println("-------------------");
	System.out.println("\"hola\".equalsIgnoreCase(\"HOLa\")= "+"hola".equalsIgnoreCase("HOLa"));	//true
	System.out.println("\"hola\".equalsIgnoreCase(\"asdx\")= "+"hola".equalsIgnoreCase("asdx"));	//false
	System.out.println("-------------------");
	String cadena1 = new String("hola");
	String cadena2 = new String("hola");
	String cadena3 ="hola";
	String cadena4 ="hola";
	System.out.println("String cadena1 = new String(\"hola\")\nString cadena2 = new String(\"hola\")\nString cadena3 = \"hola\"\nString cadena4 = \"hola\"\n");
	System.out.println("cadena1 == cadena2 : "+(cadena1 == cadena2)); 		//false porque las referencias en la pila son distintas
	System.out.println("cadena3 == cadena4 : "+(cadena1 == cadena2));		//false
	System.out.println("cadena1 == cadena3 : "+(cadena1 == cadena3));		//false
	System.out.println("cadena1.equals(cadena2) : "+(cadena1.equals(cadena2))); //true porque compara el contenido del string en si
	System.out.println("cadena3.equals(cadena4) : "+(cadena3.equals(cadena4)));	//true
	System.out.println("cadena1.equals(cadena3) : "+(cadena1.equals(cadena3)));	//true
	}
}
