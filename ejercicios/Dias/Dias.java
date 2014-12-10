enum Days{
	DOMINGO,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO
}
public class Dias{
	private int nDias; //numero de dias que van a transcurrir
	private Days dia; //que dia es hoy
	//constructor
	public Dias (int nd, Days d){
		this.nDias=nd;
		this.dia=d;
	}
	
	//metodo que calcule que dia sera
	public void queDiaSera(){
		this.dia.ordinal()=this.nDias%7;
	}
	@Override
	public String toString(){
		return ("Dentro de "+this.nDias+" será "+this.dia);
	}
}



class TestDias{
	public static void main(String[]ar){

	
	System.out.println();
		
	}
}
