public class Ejercicio11{
	//atributos
	private String dia;     //que dia sera
	private int numeroDias; //numero de dias que deben transcurrir
	
	//constructor
	public Ejercicio11(int nd){ //numero de dias
		this.numeroDias=nd;	
	}
	
	//metodo que devuelve que dia sera dendro de esos dias
	public void queDiaSera(){
		switch(this.numeroDias%7){
			case 1 :
			this.dia="MARTES";
			break;
			case 2 :
			this.dia="MIERCOLES";
			break;
			case 3 :
			this.dia="JUEVES";
			break;
			case 4 :
			this.dia ="VIERNES";
			break;
			case 5 :
			this.dia="SABADO";
			break;
			case 6 :
			this.dia="DOMINGO";
			break;
			default :
			this.dia="LUNES";
		}
	}
	@Override
	public String toString(){
		return "Hoy es Lunes, dentro de "+this.numeroDias+" será "+this.dia;
	}
		
}
	

class TestEjercicio11{
	public static void main(String[]ar){
		Ejercicio11 ej=new Ejercicio11(6);
		ej.queDiaSera();
		System.out.println(ej);
	}
}
