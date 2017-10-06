
package wuerfel_thread;

/**
 * @author mrabel
 *
 */
public class Wuerfelbecher {
	
	private Wuerfel wuerfel1;
	private Wuerfel wuerfel2;
	
	public Wuerfelbecher() {
		this.wuerfel1 = new Wuerfel();
		this.wuerfel2 = new Wuerfel();
	}
	
	public void anzeigen() {
		if(this.wuerfel1.getAugenzahl() != this.wuerfel2.getAugenzahl()) {
			System.out.println("Gewürfelt wurde " + this.wuerfel1.getAugenzahl() + " und " + this.wuerfel2.getAugenzahl());
		}
		else {
			System.out.println("Gewürfelt wurde ein " + this.wuerfel1.getAugenzahl() + "er-Pasch");
		}
	}

	public void schuetteln() {
		this.wuerfel1.wuerfeln();
		this.wuerfel2.wuerfeln();
	}
	
	public boolean isPasch() {
		if(this.wuerfel1.getAugenzahl() == this.wuerfel2.getAugenzahl()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
