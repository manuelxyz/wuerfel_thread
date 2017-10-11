
package wuerfel_thread;

/**
 * @author mrabel
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Spieler sp1 = new Spieler("Max");
		Spieler sp2 = new Spieler("Chris");
		
		Thread t1 = new Thread(sp1);
		Thread t2 = new Thread(sp2);
		
		t1.run();
		t2.run();		

	}

}
