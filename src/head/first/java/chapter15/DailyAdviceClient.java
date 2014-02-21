/***
 * DailyAdviceClient.java
 * 11-Feb-2014 : 11:02:00 pm
 * 
 */
package head.first.java.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:DailyAdviceClient.java
 * @createdOn: 11-Feb-2014 : 11:02:00 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DailyAdviceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();

	}

	private void go() {
		try {
			Socket s = new Socket("127.0.0.1",4242);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " +advice);
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
