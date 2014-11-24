//definimos un enum llamado Dias
//mayusculas porque se trata igual que a una clase
enum Dias{
		LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
}


public class Dia{
	//atributos
	private int horasLaborables;
	private Dias dias;
	//constructor
	public Dia(Dias d){
		this.dias=d;
		switch(this.dias){ //dependiendo de que atributo le pase, se le asignará un valor diferente a la variable horasLaborables
			case LUNES: case MARTES: case MIERCOLES: case JUEVES: case VIERNES: //se pueden poner todos los case en una misma linea
				this.horasLaborables=8;
				break;
			case SABADO:
			this.horasLaborables=5;
				break;
			default:
				this.horasLaborables=0;
				//lo ideal seria definir case SABADO y case DOMINGO y utilizar el default para el resto de dias
		}
	}
	@Override
	public String toString(){
		return "\n"+this.dias+ " se trabaja "+this.horasLaborables +" horas ";
	}

}
class TestDia{
	public static void main(String[]ar){
		Dia d1 = new Dia(Dias.DOMINGO);
		System.out.println(d1);
		Dia d2 = new Dia(Dias.SABADO);
		System.out.println(d2);
		Dia d3 = new Dia(Dias.MIERCOLES);
		System.out.println(d3);
	}
}
