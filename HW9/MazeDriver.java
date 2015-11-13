// Andrew Wong
// HW9 MazeDriver
// 600.107 Intro to Java

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class MazeDriver {
	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the name of the file of maze? ");
		String fName = kb.nextLine();
		Maze maze1 = new Maze(fName);

		System.out.println("Number of rows: " + maze1.getRows());
		System.out.println("Number of columns: " + maze1.getCols());
		maze1.outputMaze();
		
		System.out.println("Enter a move (WASD): ");
		String move = kb.next();

		switch (move) {
			case "W":
				//move up
				break;
			case "A":
				//move left
				break;
			case "S":
				//move down
				break;
			case "D":
				//move right
				break;
			default:
				break;
		}
		

		
		

	}
}