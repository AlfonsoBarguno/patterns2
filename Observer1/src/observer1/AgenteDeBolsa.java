package observer1;


public class AgenteDeBolsa {
	
private final ServicioDeNotificacion servicioDeNotificacion;
	
	public AgenteDeBolsa () {
		
		servicioDeNotificacion = new ServicioDeNotificacion();
	}
	
	public void nuevaInformacion (String s) {
		
		servicioDeNotificacion.notificar();
	}
	
	public ServicioDeNotificacion getServicio() {
		
		return servicioDeNotificacion;
	}
}
