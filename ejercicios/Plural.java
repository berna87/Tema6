public class Plural{
	//atributos
	private String palabra;
	
	//constructor
	public Plural(String p){
		this.palabra=p;
	}
	public String pluralPalabra(){
		if (this.palabra.endsWith("a") || this.palabra.endsWith("e") || this.palabra.endsWith("i") || this.palabra.endsWith("o")
		 || this.palabra.endsWith("u") || this.palabra.endsWith("é") || this.palabra.endsWith("ó") || this.palabra.endsWith("á")){ 
			return this.palabra.concat("s");
		}
		else if (this.palabra.endsWith("í") || this.palabra.endsWith("ú") || this.palabra.endsWith("ay") || this.palabra.endsWith("ey") 
		|| this.palabra.endsWith("oy") || this.palabra.endsWith("uy") || this.palabra.endsWith("l") || this.palabra.endsWith("r")
		|| this.palabra.endsWith("n") || this.palabra.endsWith("d") || this.palabra.endsWith("j")){
			return this.palabra.concat("es");
		}
		else if (this.palabra.endsWith("z")){
			return this.palabra.substring(0,this.palabra.length()-1).concat("ces");
		}
		else {
			return this.palabra;
		}

	}
}
