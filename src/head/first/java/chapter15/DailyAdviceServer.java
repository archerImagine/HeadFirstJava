/***
 * DailyAdviceServer.java
 * 11-Feb-2014 : 10:52:44 pm
 * 
 */
package head.first.java.chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:DailyAdviceServer.java
 * @createdOn: 11-Feb-2014 : 10:52:44 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DailyAdviceServer {
	String[] adviceList = {"Take smaller bites",
							"Go for the tight jeans, No they do not make you look fat.",
							"One word: inappropriates",
							"Just for today, be honest, Tell your boss what you *really* think",
							"You might want to rethink that haircut"};
	public void go(){
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			while(true){
				Socket sock = new ServerSocket().accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println("Advice = " +advice);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		
		return adviceList[random];
	}

	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
