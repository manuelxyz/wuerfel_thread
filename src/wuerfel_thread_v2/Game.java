
package wuerfel_thread_v2;

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
		sp1.start();
		Spieler sp2 = new Spieler("Chris");				
		sp2.start();

	}

}
