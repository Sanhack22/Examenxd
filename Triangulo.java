import javax.swing.JOptionPane;

public class Triangulo {
	double base,altura,area;
	String conti;

	public void iniciar() {
		
		do {
			pedirDatos();
			if (comprobar()==true) {
				
				JOptionPane.showMessageDialog(null, "Base:"+base+"\n"+"Altura"+altura+"\n"+"Area:"+area);
			}else {
				JOptionPane.showMessageDialog(null, "Datos Invalidos");

			}
			
			
			conti=JOptionPane.showInputDialog("Desea Continuar?");
		} while (conti.equalsIgnoreCase("si"));
		
	}
	
	public boolean comprobar() {
		
		if (base >0 && altura>0) {
			
			return true;
			
		}
		return false;
		
	}
	
	public void pedirDatos() {
		base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Base"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Altura"));

		area=(base*altura)/2;
	}
}
