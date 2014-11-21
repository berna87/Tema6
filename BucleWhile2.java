public class BucleWhile2{
	private int numero; //suma desde 0 hasta numero
	//constructor para inicializar numero.
	public BucleWhile2(int n){
		this.numero=n;
	}
	//metodo que suma desde 0 hasta este numero
	public int sumar(){
		int suma=0;
		int contador=1;
		while(contador <= this.numero){
			System.out.printf("Suma vale: "+suma);
			System.out.printf("  Contador vale: "+contador+"\n");
			suma+= contador;
			contador++;
		}
		return suma;
	}
	//similar pero usando el bucle do while
	public int sumarDoWhile(){
		int suma=0;
		int contador=1;
		do {
			System.out.printf("Suma vale: "+suma);
			System.out.printf("  Contador vale: "+contador+"\n");
			suma+= contador;
			contador++;
		}
		while(contador <= this.numero);
		return suma;
	}
	//similar usando el bucle for
	public int sumaBucleFor(){
		int suma=0;
		for (int contador=1; contador<= this.numero; contador++){
			System.out.printf("Suma vale: "+suma);
			System.out.printf("  Contador vale: "+contador+"\n");
			suma+= contador;
		}
		return suma;
	}
	
}

class TestBucleWhile2{
	public static void main(String[]ar){
		BucleWhile2 b1 = new BucleWhile2(4);
		int suma1=b1.sumaBucleFor();
		System.out.println("Total= "+suma1);

	}	
}
