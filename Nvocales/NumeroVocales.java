import javax.swing.JOptionPane;
public class NumeroVocales {
	//variables
	private String palabra;
	//constructor
	public NumeroVocales(String p){
		this.palabra=p;
	}
	//metodo que devuelve el numero de vocales en la palabra
	//forma sencilla
	public int numeroDeVocales(){
		int contador=0;
		for (int i=0;i<this.palabra.length();i++){
			String letra = this.palabra.substring(i,i+1); // substring(0,1) de una palabra "ejemplo" devolveria la letra "e"
			if (letra.contains("a")||letra.contains("e")||letra.contains("i")||letra.contains("o")||letra.contains("u")){ //este suceso solo ocurrira cuando uno de los substring sea "a","e"."i","o","u"
				contador++; //sumara 1 al contador
			}
		}
		return contador; //devolveria el total del contador al metodo
	}
		//metodo que devuelve el numero de vocales en la palabra
	//forma complicada
	public int numeroDeVocales2(){
		int contador=0;
		for (int i=0;i<this.palabra.length();i++){
			String letra = this.palabra.substring(i,i+1); // substring(0,1) de una palabra "ejemplo" devolveria la letra "e"
			if (!(letra.contains("a")||letra.contains("e")||letra.contains("i")||letra.contains("o")||letra.contains("u"))){ //si contiene a e i o u esta condicion seria "false" por lo que no se ejecutaria el continue
				continue; //el continue se ejecutaria cuando hubiese una consonante, volveria a iniciar el for sin aumentar el contador
			}
			contador++;
		}
		return contador; //devolveria el total del contador al metodo
	}
	
	
	@Override
	public String toString(){
		return "La palabra "+this.palabra+" contiene "+numeroDeVocales2()+ " vocales.";
	}
}
class TestVocales {
	public static void main(String[]ar){
		String palabra = JOptionPane.showInputDialog("Introduce una palabra para comprobar \ncuantas vocales tiene");
		NumeroVocales v1 = new NumeroVocales(palabra);
		JOptionPane.showMessageDialog(null,v1);
		System.out.println(v1);
	}
}
