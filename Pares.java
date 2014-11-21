import javax.swing.JOptionPane;
public class Pares{
	private int numero;
	
	public Pares(int n){
		this.numero=n;
	}
	//metodo que devuelve si el numero es par o no
	public boolean esPar(){
		return this.numero % 2 ==0;
	}
	//metodo que iguala el true a par y el false a impar
	@Override
	public String toString(){
		if (esPar()){ return "El numero " +this.numero+ "es Par";}
		else { return "El numero " +this.numero+ "es Impar";}
		
	}
	public static void main(String[] args){
		//solicita datos por JOptionPane y los asigna a un string
		String str_num3 = JOptionPane.showInputDialog("Introduce un valor para comprobar \nsi es par o no");
		//convierte el string en un int
		int num3 = Integer.parseInt(str_num3);
		//creo un objeto y le asigno el int como atributo
		Pares n3 = new Pares(num3);

		JOptionPane.showMessageDialog(null,n3);
	}
}
