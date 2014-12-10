import javax.swing.JOptionPane;
public class SimulacionPalabra{
	public static void main(String[]ar){
	String palabra = JOptionPane.showInputDialog("Introduce una palabra \npara obtener su plural");
	Plural p1 = new Plural(palabra);
	JOptionPane.showMessageDialog(null,p1.pluralPalabra());
	System.out.println("Palabra en singular: "+palabra+"\nPalabra en plural : "+p1.pluralPalabra());
	
	}
}
