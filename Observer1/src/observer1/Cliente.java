package observer1;

public class Cliente {

	
private final String email;
	
	public Cliente (String email) {
		
		this.email = email;
		
	}
	
	public void actualizar () {
		
		System.out.println("Se ha enviado el correo.");
	}
}
