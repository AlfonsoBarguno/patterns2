package observer1;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgenteDeBolsa a1 = new AgenteDeBolsa();

		ServicioDeNotificacion s1 = new ServicioDeNotificacion();

		Cliente e1 = new Cliente("panacoto@gmail.com");
		Cliente e2 = new Cliente("gorgonzola@gmail.com");
		Cliente e3 = new Cliente("berenjena@gmail.com");

		a1.nuevaInformacion("Información");

		s1.subscribirse(e1);
		s1.subscribirse(e2);
		s1.subscribirse(e3);

		s1.darseDeBaja(e2);

		a1.nuevaInformacion("Nueva Información");
		System.out.println(a1.getServicio());

		System.out.println("");

		s1.notificar();

		System.out.println("");

		s1.getList();
	}
}
