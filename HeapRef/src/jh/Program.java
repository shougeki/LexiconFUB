package jh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	static char[][] gameArea;

	public static void main(String[] args) throws NumberFormatException, IOException {
		gameArea = new char[3][3];
		char player1Char = 'X';
		char player2Char = 'O';
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			printGameArea();
			System.out.println("Player one please enter Row (0-2) and press enter, "+
					"then enter col (0-2) and press enter");
			
			insertChar(player1Char,
					Integer.parseInt(input.readLine()),
					Integer.parseInt(input.readLine())
					);
			
			printGameArea();
			
			System.out.println("Player two please enter Row (0-2) and press enter, "+
					"then enter col (0-2) and press enter");
			
			insertChar(player2Char,
					Integer.parseInt(input.readLine()),
					Integer.parseInt(input.readLine())
					);
			
			printGameArea();
			
		}
		
	}
	
	private static void insertChar(char playerChar, int x, int y) {
		gameArea[x][y] = playerChar;
	}
	
	private static void printGameArea() {
		for(int i = 0; i < gameArea.length;i++) {
			for(int j = 0; j < gameArea[i].length;j++) {
				System.out.print(gameArea[i][j]);
			}
			System.out.print("\n");
		}
	}
	
/*	
	public static void oldmain(String[] args) {
		int x = 5;
		int y = 7;
		
		x = y;
		y += 3;
		
		MyInt myX = new MyInt();
		MyInt myY = new MyInt();
		
		myX.setValue(5);
		myY.setValue(7);
		
		myX = myY;
		
		myY.setValue(10);
		
		System.out.format("x: %1$d, y: %2$d%nMyX: %3$d, myY: %4$d%n",x,y,myX.getValue(), myY.getValue());
		
		String a = new String("MORG");
		String b = new String("MORG");
		
		if( a==b ) {
			System.out.println("LIKA");
		} else {
			System.out.println("OLIKA");
		}

	}
	
	*/

}
