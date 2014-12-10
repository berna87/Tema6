public class Numeros{
	//atributos
	private int valor;
	
	//setters
	public void setValor(int v){
		this.valor=v;
	}
	
	//getters
	public int getValor(){
		return this.valor;
	}
	
	//metodo que imprime los numeros entre 0 y valor
	public void imprimirDe0aValor(){
		for (int i=0; i<=this.valor;i++){
			System.out.printf("%-5d",i);
		}
	}
	//metodo que devuelve si un numero es divisible por dos, por cinco, por diez o por ninguno
	public void esDivisible(){
		if (this.valor%5==0 && this.valor%2==0)System.out.println(this.valor+" es divisible por diez ");
		else if (this.valor%5==0) System.out.println(this.valor+" es divisible por cinco ");
		else if (this.valor%2==0) System.out.println(this.valor+" es divisible por dos ");
		else System.out.println("No es divisible ni por dos, ni por cinco, ni por diez");
	}
	//metodo que indica si un numero es mayor o menor que cien
	public void esMayorQueCien(){		
		if (this.valor>100) System.out.println(this.valor+" es mayor que cien");
		if (this.valor<100) System.out.println(this.valor+" es menor que cien"); 
		if (this.valor==100) System.out.println(this.valor+" es igual a cien");
	}
	//metodo que acepte numeros menores que 100 y que nos muestre los divisores de este numero
	public void divisores(){
		if (this.valor<100){
			System.out.println("Divisores de "+this.valor);
			for (int i=1; i<=this.valor;i++){
			if (this.valor%i==0) System.out.printf("%-3d", i);	
			}
			System.out.println("\n");
		} else System.out.println ("No ha introducido un valor valido");
	}
}
class TestNumeros{
	public static void main(String[]ar){
		if(ar.length == 0) { //si no introducimos ningun argumento
			System.out.println("No has introducido argumentos"); 
			System.exit(1); //salida del programa
		}
		Numeros n1 = new Numeros();
		int num = Integer.parseInt(ar[0]);
		n1.setValor(num);
		System.out.println("\nMetodo 1\n");
		n1.imprimirDe0aValor();
		System.out.println("\nMetodo 2\n");
		n1.esDivisible();
		System.out.println("\nMetodo 3\n");
		n1.esMayorQueCien();
		System.out.println("\nMetodo 4\n");
		n1.divisores();
	}
}
