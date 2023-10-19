import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class tres {
	HashMap<String,ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
	double hora = 2000;
	String nombre,documento,cont,salario1,horasTra1,tiempo1,impuesto1;
	int horasTra,tiempoEn;
	Double salario,impuesto;
	
	
	public void iniciar() {
		
		do {
			pedirDatos();
			guardar();
			
			cont=JOptionPane.showInputDialog("Desea Continuar?");
		} while (cont.equalsIgnoreCase("Si"));
		
		String mensajeee = mensajeF();
		JOptionPane.showMessageDialog(null, mensajeee);
	}
	
	public void pedirDatos() {
		
		nombre=JOptionPane.showInputDialog("Ingrese Su Nombre");
		documento=JOptionPane.showInputDialog("Ingrese Su Documento");
		horasTra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Las Horas Trabajadas"));
		tiempoEn=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cuantos Años Lleva En La Empresa"));
		salario=horasTra*hora;
		descuento();
	}
	
	public void descuento() {
		
		if (tiempoEn>=4) {
			impuesto=salario*0.1;
			salario=salario-impuesto;
			
		}
		
		
		
	}
	
	public void guardar() {
		horasTra1 = Integer.toString(horasTra);
		salario1 = Double.toString(salario);
		tiempo1 = Integer.toString(horasTra);
		impuesto1=Double.toString(salario);
		ArrayList<String>trabajador=new ArrayList<String>();
		trabajador.add(documento);
		trabajador.add(nombre);
		trabajador.add(horasTra1);
		trabajador.add(salario1);
		trabajador.add(tiempo1);
		trabajador.add(impuesto1);
		
		hash.put(documento, trabajador);
		
	}
	
	public String mensajeF() {
		   StringBuilder mensaje = new StringBuilder();
	        for (Map.Entry<String, ArrayList<String>> entry : hash.entrySet()) {
	            String documento = entry.getKey();
	            ArrayList<String> datos = entry.getValue();
	            mensaje.append("Documento: ").append(documento).append("\n");
	            mensaje.append("Nombre: ").append(datos.get(1)).append("\n");
	            mensaje.append("Horas Trabajadas: ").append(datos.get(2)).append("\n");
	            mensaje.append("Salario: ").append(datos.get(3)).append("\n");
	            mensaje.append("Tiempo En La Empresa: ").append(datos.get(4)).append("\n\n");
	            
	        }
	    return mensaje.toString();
	}
	
	
	
}
