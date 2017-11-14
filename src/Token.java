
public class Token {

	int turno;
	
	public Token() {
		turno = 0;
	}
	
	public synchronized void comer(int id,String nombre) {
		while(turno!=id) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(nombre +" está comiento ");
		turno =(id+1)%5;
		notifyAll();
		/*
		if(turno>=4) {
			turno=0;
			notifyAll();
		}else {
			notifyAll();
			turno++;
		}
		*/
	}
}
