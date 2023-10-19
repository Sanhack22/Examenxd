import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Primero {
	HashMap<String, ArrayList<String>> hash =new HashMap<String, ArrayList<String>>();
	
	
	String nombre,documento,telefono,ciudad,fecha,continuar,mensajee,codigo1;
	int codigo;
	public void iniciar() {
		do {
			
			pedirDatos();
			guardarDatos();
			
			continuar=JOptionPane.showInputDialog("Desea Agregar Otro Estudiante");
		} while (continuar.equalsIgnoreCase("si"));
		mensajee=mostrarDatos();
		JOptionPane.showMessageDialog(null, mensajee);

		
	}
	
	public void guardarDatos() {
		
		ArrayList<String>datos =new ArrayList<String>();
		codigo1=Integer.toString(codigo);
		 datos.add(documento);
		 datos.add(nombre);
		 datos.add(telefono);
		 datos.add(codigo1);
		 datos.add(ciudad);
		 datos.add(fecha);
		 
		 hash.put(documento, datos);

		 
		
	}
	
	public void pedirDatos() {
		
		nombre= JOptionPane.showInputDialog("Ingrese Su Nombre");
		documento=JOptionPane.showInputDialog("Ingrese Su Documento");
		telefono =JOptionPane.showInputDialog("Ingrese Su Telefono");
		codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Codigo de la ciudad"));
		viaje();
		
	}
	
	public void viaje( ) {
		switch (codigo) {
		case 1: {
			ciudad="Medellin";
			fecha="6-Octubre--8am";
			break;
		}case 2:
			ciudad="Medellin";
			fecha="6-Octubre--8am";	
			break;
		case 3:
			ciudad="Cartagena";
			fecha="5-Abril--2pm";
			break;
			
		case 4:
			ciudad="Barranquilla";
			fecha="4-Mayo--4am";	
			break;
		default:
			JOptionPane.showMessageDialog(null, "Codigo Incorrecto");
		}
		/*if (codigo=="1") {
			ciudad="Medellin";
			fecha="6-Octubre--8am";	
		}else if (codigo=="2") {	
			ciudad="Bogota";
			fecha="10-Noviembre--6pm";	
		}else if (codigo=="3") {
			
			ciudad="Cartagena";
			fecha="5-Abril--2pm";	
		}else if (codigo=="4") {
			
			ciudad="Barranquilla";
			fecha="4-Mayo--4am";	
		}else {
			JOptionPane.showMessageDialog(null, "Codigo Incorrecto");
		}*/

}
	
	public String mostrarDatos() {
		
	        StringBuilder mensaje = new StringBuilder();
	        for (Map.Entry<String, ArrayList<String>> entry : hash.entrySet()) {
	            String documento = entry.getKey();
	            ArrayList<String> datos = entry.getValue();
	            mensaje.append("Documento: ").append(documento).append("\n");
	            mensaje.append("Nombre: ").append(datos.get(1)).append("\n");
	            mensaje.append("Telefono: ").append(datos.get(2)).append("\n");
	            mensaje.append("Codigo: ").append(datos.get(3)).append("\n");
	            mensaje.append("Ciudad: ").append(datos.get(4)).append("\n");
	            mensaje.append("Fecha: ").append(datos.get(5)).append("\n\n");
	        }
	    return mensaje.toString();
	}
	
	
	
	}
