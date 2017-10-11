
package wuerfel_thread_v2;

import java.util.Random;

/**
 * @author mrabel
 *
 */
public class Spieler extends Thread {

	private String spielerName;
	private Wuerfelbecher wbecher;
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
		this.rand = new Random();
		this.akttime = 0;
		this.versuche = 0;
		this.gestime = 0;
	}
	
	@Override
	public synchronized void run() {
		try {
			do {
				this.akttime = rand.nextInt(3000)+500;
				Thread.sleep(this.akttime);
				this.wbecher.schuetteln();
				System.out.print("Spieler: " + this.spielerName + " | " + (this.versuche+1) + ". Versuch: ");
				this.wbecher.anzeigen();
				this.versuche+=1;
				this.gestime += this.akttime;
				
			}while(!this.wbecher.isPasch());
			
			System.out.println("Versuche: " + this.versuche);
			System.out.println("Verbrauchte Zeit: " + (this.gestime/1000) + "s\n");
			
		}
		catch(Exception e) {}
		
	}
}
