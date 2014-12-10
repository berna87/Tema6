import java.util.Scanner;
public class Ejercicio8{
	//atributos
	private int horas;
	private int minutos;
	private int segundos;
	//constructor
	public Ejercicio8(int h, int m, int s){
		this.horas=h;
		this.minutos=m;
		this.segundos=s;
		}
	@Override
	public String toString(){
		return "Hora: "+this.horas+" : "+this.minutos+" : "+this.segundos;
	}
	
	
}

class TestEjercicio8{
	public static void main(String[]ar){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la hora: H M S");
		int hor = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		sc.close();
		if (hor>=24 || hor < 0){
			System.out.println("Hora introducida no valida");
			System.exit(1);
			}
		if (min>=60 || min < 0){
			System.out.println("Minutos introducidos no validos");
			System.exit(1);
			}
		if (sec>=60 || sec < 0){
			System.out.println("Minutos introducidos no validos");
			System.exit(1);
			}
		Ejercicio8 h = new Ejercicio8(hor,min,sec);
		System.out.println(h);
		
		
	}
}
