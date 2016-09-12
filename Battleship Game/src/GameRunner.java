import java.util.Scanner;

public class GameRunner
	{
	// Try to change the amount of delay based on part of game (i.e. delay(1000);)
	public static void delay()
		{
		try
			{
			Thread.sleep(1000);
			} 
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	public static void main(String[] args)
		{
		int [][] battleship = new int [10][10];
		System.out.println("Welcome to battleship. Prepare for the game of a lifetime!");
//		Scanner team = new Scanner(System.in);
//		System.out.println("What would you like your team name to be?");
//		String teamName = team.nextLine();
//		System.out.println("It's game time, " + teamName + "!");
		delay();
		System.out.println("First, you must place your ships. This is what the game board looks like: ");		
		GameBoard.display();
		delay();
		System.out.println("You have five boats. The carrier takes up five spaces. The battleship takes up four. The crusier and submarine take up three. The destroyer takes up two.");
		System.out.println("Please enter the spaces for the carrier first");
		}
	}