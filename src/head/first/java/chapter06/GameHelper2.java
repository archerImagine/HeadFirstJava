/***
 * GameHelper2.java
 * 19-Jan-2014 : 5:51:37 pm
 * 
 */
package head.first.java.chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter06:GameHelper2.java
 * @createdOn: 19-Jan-2014 : 5:51:37 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GameHelper2 {
	private static final String alphabet ="abcdef";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt +" ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0){
				return null;
			}
		} catch (IOException e) {
			System.out.println("IoException: " +e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String>placeDotCom(int comSize){
		ArrayList<String> alphaCells = new ArrayList<String>();
		String temp = null;
		int[] coords = new int[comSize];
		int attempts = 0;
		boolean sucess = false;
		int location = 0;
		
		comCount++;
		int incr = 1;
		if((comCount % 2) ==1){
			incr = gridLength;
		}
		
		while(!sucess & attempts++ < 200){
			location = (int)(Math.random() *gridSize);
			int x = 0;
			sucess = true;
			while(sucess && x < comSize){
				if(grid[location] == 0){
					coords[x++] = location;
					location += incr;
					if(location >= gridSize){
						sucess = false;
					}
					if(x >0 &&(location % gridLength == 0)){
						sucess = false;
					}
				}else{
					sucess = false;
				}
			}
		}
		
		int x = 0;
		int row = 0;
		int column = 0;
		while(x < comSize){
			grid[coords[x]] = 1;
			row = (int)(coords[x]/gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			System.out.println("Coord " +x +" = " +alphaCells.get(x-1));
		}
		
		return alphaCells;
	}
}
