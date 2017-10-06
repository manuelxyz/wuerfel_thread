
package wuerfel_thread;

import java.util.Random;

/**
 * @author mrabel
 *
 */
public class Wuerfel {
	
	private int augenzahl;
	private Random generator;
	
	/**
	 * Konstruktor von W�rfel
	 */
	public Wuerfel() {
		this.augenzahl = 0;
		this.generator = new Random();	
	}
	
	/**
	 * Liefert die Augenzahl des W�rfels
	 * 
	 * @return Augenzahl
	 */
	public int getAugenzahl() {
		return this.augenzahl;
	}
	
	/**
	 * W�rfelt eine Zahl von 1-6 und setzt dies als Augenzahl
	 */
	public void wuerfeln() {
		this.augenzahl = this.generator.nextInt(6)+1;
	}
}
