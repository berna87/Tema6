import java.util.Random;
public class Numero {
	private int numero;
	public Numero(int n){
		this.numero=n;
	}
	public int averiguaRandom(){ //metodo que averigua el numero aleatorio
		int numeroADescubrir=0;
		for(int i=0;i<10000;i++){
			if(this.numero==i){
				numeroADescubrir=i; //cuando i sea igual al numero aleatorio igualará "numeroADescubir" al valor de "i"
				break;
			}		
		}
		return numeroADescubrir; //devolvera el valor de numeroADescubrir
	}
}

class TestNumero{
	public static void main(String[]ar){
		Random r= new Random();
		int random = r.nextInt(10000); //metodo que devuelve un numero aleatorio entre 0 "incluido" y 10000 "no incluido" usando la libreria Random
		Numero n1 = new Numero(random);
		System.out.println("El numero aleatorio es: "+n1);
	}
}
