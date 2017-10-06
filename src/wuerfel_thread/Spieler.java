
package wuerfel_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author mrabel
 *
 */
public class Spieler implements Runnable {

	private String spielerName;
	private Wuerfelbecher wbecher;
	private int time;
	private Random rand;
	private int zaehler = 0;
	private int gestime;
	
	public Spieler(String name) {
		this.spielerName = name;
		this.wbecher = new Wuerfelbecher();
		this.rand = new Random();
		this.time = 0;
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

	@Override
	public void run() {
		try {
			System.out.println("Name: " + this.spielerName);
			do {
				this.time = rand.nextInt(3000)+500;
				Thread.sleep(this.time);
				this.wbecher.schuetteln();
				this.wbecher.anzeigen();
				System.out.println("Aktuelle Time: " + this.time);
				this.zaehler+=1;
				this.gestime += this.time;
				
			}while(!this.wbecher.isPasch());
			
			System.out.println("Versuche: " + this.zaehler);
			System.out.println("Verbrauchte Zeit: " + this.gestime);
			
		}
		catch(Exception e) {}
		
	}
}
