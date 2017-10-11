
package wuerfel_thread;

import java.util.Random;

/**
 * @author mrabel
 *
 */
public class Spieler implements Runnable {

	private String spielerName;
	private Wuerfelbecher wbecher;
	private byte paschwurf;
	private Random rand;
	private int akttime;
	private int versuche;
	private int gestime;
	
	/**
	 * Konstruktor von Spieler
	 * 
	 * @param name
	 */
	public Spieler(String name) {
		this.spielerName = name;
		this.wbecher = new Wuerfelbecher();
		this.paschwurf = 0;
		this.rand = new Random();
		this.akttime = 0;
		this.versuche = 0;
		this.gestime = 0;
	}
	
	/**
	 * Setzt den Namen des Spielers
	 * 
	 * @param name Name des Spielers
	 */
	public void setName(String name) {
		this.spielerName = name;
		
	}
	
	/**
	 * Liefert den Namen des Spielers zurück
	 * 
	 * @return Spielername
	 */
	public String getName() {
		return this.spielerName;
	}
	
	/**
	 * Liefert die Augenzahl zurück, vom letzten Zug also dem Pasch
	 * 
	 * @return Paschwurf
	 */
	public byte getPaschwurf() {
		return this.paschwurf;
	}
	
	@Override
	public void run() {
		byte aktaugenzahl = 0;
		try {
			System.out.println("Name: " + this.spielerName);
			do {
				this.akttime = rand.nextInt(3000)+500;
				Thread.sleep(this.akttime);
				this.wbecher.schuetteln();
				System.out.print( this.versuche+1 + ". Versuch: ");
				this.wbecher.anzeigen();
				aktaugenzahl = this.wbecher.getAugenzahl();
				this.versuche+=1;
				this.gestime += this.akttime;
				
			}while(!this.wbecher.isPasch());
			
			this.paschwurf = aktaugenzahl;
			
			System.out.println("Versuche: " + this.versuche);
			System.out.println("Verbrauchte Zeit: " + (this.gestime/1000) + "s\n");
			
		}
		catch(Exception e) {}
		
	}
}
