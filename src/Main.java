import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		String[]nombre = {"S�crates","Kant","Locke","Ar�stoteles","Hegel"};
		Token t = new Token();
		Filosofo []filosofos = new Filosofo[5];
		for (int i = 0; i < nombre.length; i++) {
			filosofos[i] = new Filosofo(nombre[i],t,i);
			filosofos[i].start();
		}
		
	}

}
