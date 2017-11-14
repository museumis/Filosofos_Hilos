
public class Filosofo extends Thread {

	String nombre;
	Token t;
	int id;

	public Filosofo(String nombre, Token t,int id) {
		this.nombre = nombre;
		this.t = t;
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			t.comer(id,nombre);
		}
		

	}

}
