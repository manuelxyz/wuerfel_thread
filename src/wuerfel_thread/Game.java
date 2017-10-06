
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
		
		Thread t1 = new Thread(new Spieler("Max"));
		Thread t2 = new Thread(new Spieler("Chris"));
		
		t1.run();
		t2.run();

	}

}
