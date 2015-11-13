// Andrew Wong
// HW9 Maze
// 600.107 Intro to Java

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Maze {

	private int rows;
	private int cols;
	private char[][] maze;

	public Maze(String fName) throws IOException{
		Scanner inFile = new Scanner(new FileReader(fName));
		this.rows = inFile.nextInt();
		this.cols = inFile.nextInt();

		this.maze = new char[this.rows][this.cols];
		String s = "";
		inFile.nextLine();
		for (int i=0;i<this.rows;i++) {
			s = inFile.nextLine();
			for (int j=0;j<this.cols;j++) {
				this.maze[i][j] = s.charAt(j);
				// if (j==0) {
				// 	this.maze[i][j] = s.substring(0,1);
				// } else {
				// 	this.maze[i][j] = s.substring(j-1,j);
				// }
			}
		}
	}

	public int getRows() {
		return this.rows;
	}

	public int getCols() {
		return this.cols;
	}

	public void outputMaze() {
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		
	}

	public void moveUp() {

	}

	public void moveLeft() {
		
	}

	public void moveDown() {
		
	}

	public void moveRight() {
		
	}


	
}