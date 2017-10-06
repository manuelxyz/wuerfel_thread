/**
 * 
 */
package wuerfel_thread;

import java.util.stream.IntStream;

/**
 * @author mrabel
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Thread t = new Thread(() -> IntStream.range(0,10).forEach(j -> System.out.println(Thread.currentThread().getName() + " Durchlauf " + j+1)),"Thread " + i);
			t.start();
		}

	}

}
