
package wuerfel_thread;

/**
 * @author mrabel
 *
 */
public class Wuerfelbecher {
	
	private Wuerfel wuerfel1;
	private Wuerfel wuerfel2;
	
	/**
	 * Konstruktor von W�rfelbecher
	 */
	public Wuerfelbecher() {
		this.wuerfel1 = new Wuerfel();
		this.wuerfel2 = new Wuerfel();
	}
	
	/**
	 * Zeigt die gew�rfelten Augenzahlen an
	 */
	public void anzeigen() {
		if(this.wuerfel1.getAugenzahl() != this.wuerfel2.getAugenzahl()) {
			System.out.println("Gew�rfelt wurde " + this.wuerfel1.getAugenzahl() + " und " + this.wuerfel2.getAugenzahl());
		}
		else {
			System.out.println("Gew�rfelt wurde ein " + this.wuerfel1.getAugenzahl() + "er-Pasch");
		}
	}

	/**
	 * Methode dient dazu, dass 2 Augenzahlen "gew�rfelt" werden
	 */
	public void schuetteln() {
		this.wuerfel1.wuerfeln();
		this.wuerfel2.wuerfeln();
	}
	
	/**
	 * Pr�ft ob ein Pasch gew�rfelt wurde, um das Spiel als beendet zu erkl�ren
	 * 
	 * @return true/false
	 */
	public boolean isPasch() {
		if(this.wuerfel1.getAugenzahl() == this.wuerfel2.getAugenzahl()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
