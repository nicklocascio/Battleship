import java.util.Scanner;

public class GameRunner
	{
	static int row;
	static int column;
	static String [][] board= new String [10][10];
	// Try to change the amount of delay based on part of game (i.e. delay(1000))
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
//		System.out.println("Welcome to battleship. Prepare for the game of a lifetime!");
		// TEAM NAME
//		Scanner team = new Scanner(System.in);
//		System.out.println("What would you like your team name to be?");
//		String teamName = team.nextLine();
//		System.out.println("It's game time, " + teamName + "!");
//		delay();
//		System.out.println("");
//		System.out.println("This is what the game board looks like: ");
//		System.out.println("");
//		GameBoard.display();
//		delay();
		// FLIPPIN FIND OUT HOW TO NOT PRINT THIS OUT
		GameBoard.enemy1();
//		System.out.println("");
//		System.out.println("The enemy has four boats. The carrier takes up four spaces. The cruiser and fighter each take up three spaces, and the scout takes up two.");
		
		System.out.println("");
		System.out.println("Let's play. Please start guessing");
		boolean playing = true;
		while(playing)
			{
			Scanner userGuess = new Scanner(System.in);
	//		String cruiser = boat1.nextLine();
			String hitMiss = userGuess.nextLine();
			switch(hitMiss.substring(0, 1))
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
			column = Integer.parseInt(hitMiss.substring(1)) - 1;
			if(board[row][column].equals("x"))
				{
				System.out.println("");
				GameBoard.enemy1();
				}
			else
				{
				System.out.println("");
				GameBoard.enemy1();
				}					
			}
		}
	}
	

// Why can't I play if enemy1 is not given to the user?



