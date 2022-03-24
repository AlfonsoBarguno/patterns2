package observer1;

import java.util.ArrayList;
import java.util.List;



public class ServicioDeNotificacion {
private final List<Cliente> clientes;
	
	public ServicioDeNotificacion (){
		
		clientes = new ArrayList<>();
		}
	
	public void subscribirse(Cliente listener) {
		
		clientes.add(listener);
	}
	
	public void darseDeBaja (Cliente listener) {
		
		clientes.remove(listener);
	}
	
	public void notificar () {
		
		clientes.forEach(listener -> listener.actualizar());
	}
	
	public void getList () {
		System.out.println(clientes);
	}
}
