import javax.swing.JOptionPane;
public class Calculadora{
	private double valor1;
	private double valor2;
	private double resultado;
	private String operacion;
	
	public Calculadora(double v1, String op, double v2){
		this.valor1=v1;
		this.valor2=v2;
		this.operacion=op;
		}
	
	public void calcularResultado(){
		switch (this.operacion){ //dependiendo del valor de "operacion" se ejecutara un caso u otro
			case "+":
			this.resultado= this.valor1+this.valor2;
			break;
			case "-":
			this.resultado= this.valor1-this.valor2;
			break;
			case "*":
			this.resultado= this.valor1*this.valor2;
			break;
			case "/":
			this.resultado= this.valor1/this.valor2;
			break;
			default:
			System.out.println("operacion no permitida");
			}
		
		}
		public double getRestultado(){
			return 	this.resultado;
		}
		
}
class TestCalculadora{
	public static void main(String[]ar){
	String v1 = JOptionPane.showInputDialog("valor1");
	double val1 = Double.parseDouble(v1);
	String op = JOptionPane.showInputDialog("operacion: + , - , * , /");
	String v2 = JOptionPane.showInputDialog("valor2");
	double val2 = Double.parseDouble(v2);
	Calculadora c1 = new Calculadora(val1,op,val2);
	c1.calcularResultado();
	JOptionPane.showMessageDialog(null,v1+op+v2+"="+c1.getRestultado());
	}
}
