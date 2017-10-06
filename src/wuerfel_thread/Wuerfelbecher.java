
package wuerfel_thread;

/**
 * @author mrabel
 *
 */
public class Wuerfelbecher {
	
	private Wuerfel wuerfel1;
	private Wuerfel wuerfel2;
	
	/**
	 * Konstruktor von Würfelbecher
	 */
	public Wuerfelbecher() {
		this.wuerfel1 = new Wuerfel();
		this.wuerfel2 = new Wuerfel();
	}
	
	/**
	 * Zeigt die gewürfelten Augenzahlen an
	 */
	public void anzeigen() {
		if(this.wuerfel1.getAugenzahl() != this.wuerfel2.getAugenzahl()) {
			System.out.println("Gewürfelt wurde " + this.wuerfel1.getAugenzahl() + " und " + this.wuerfel2.getAugenzahl());
		}
		else {
			System.out.println("Gewürfelt wurde ein " + this.wuerfel1.getAugenzahl() + "er-Pasch");
		}
	}

	/**
	 * Methode dient dazu, dass 2 Augenzahlen "gewürfelt" werden
	 */
	public void schuetteln() {
		this.wuerfel1.wuerfeln();
		this.wuerfel2.wuerfeln();
	}
	
	/**
	 * Prüft ob ein Pasch gewürfelt wurde, um das Spiel als beendet zu erklären
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
