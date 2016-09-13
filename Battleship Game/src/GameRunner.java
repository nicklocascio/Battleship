import java.util.Scanner;

public class GameRunner
	{
	static int row;
	static int column;
	// Try to change the amount of delay based on part of game (i.e. delay(1000);)
	public static void delay()
		{
		try
			{
			Thread.sleep(2000);
			} 
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	public static void main(String[] args)
		{
		String [][] battleshipBoard= new String [10][10];
		System.out.println("Welcome to battleship. Prepare for the game of a lifetime!");
		// TEAM NAME
//		Scanner team = new Scanner(System.in);
//		System.out.println("What would you like your team name to be?");
//		String teamName = team.nextLine();
//		System.out.println("It's game time, " + teamName + "!");
		delay();
		System.out.println("");
		System.out.println("First, you must place your ships. This is what the game board looks like: ");
		System.out.println("");
		GameBoard.display();
		delay();
		System.out.println("");
		System.out.println("You have five boats. The carrier takes up five spaces. The battleship takes up four. The crusier and submarine take up three. The destroyer takes up two.");
		Scanner player = new Scanner(System.in);
		System.out.println("");
		System.out.println("Please enter the spaces for the carrier first");
		String shipSpace = player.nextLine();
		switch(shipSpace.substring(0, 1))
			{
			case "A":
			case "a":
				{
				row = 0;
				break;
				}
			case "B":
			case "b":
				{
				row = 1;
				break;
				}
			case "C":
			case "c":
				{
				row = 2;
				break;
				}
			case "D":
			case "d":
				{
				row = 3;
				break;
				}
			case "E":
			case "e":
				{
				row = 4;
				break;
				}
			case "F":
			case "f":
				{
				row = 5;
				break;
				}
			case "G":
			case "g":
				{
				row = 6;
				break;
				}
			case "H":
			case "h":
				{
				row = 7;
				break;
				}
			case "I":
			case "i":
				{
				row = 8;
				break;
				}
			case "J":
			case "j":
				{
				row = 9;
				break;
				}
			}
		column = Integer.parseInt(shipSpace.substring(1)) - 1;
		for(int row = 0; row < battleshipBoard.length; row++)
			{
			for(int col = 0; col < battleshipBoard.length; col++)
				{
//				battleshipBoard[row][col] = row;
				}
			}
		}
	}

// Use a nested for loop to put a blank space in each box of array. Separate method




