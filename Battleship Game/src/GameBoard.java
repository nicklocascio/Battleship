
public class GameBoard
	{
	public static void display()
		{		
		for(int row = 0; row < 10; row++)
			{
			for(int col = 0; col < 10; col++)
				{
				GameRunner.board[row][col] = "_";
				}
			}
		System.out.println("     1     2     3     4     5     6     7     8     9     10  ");
		System.out.println("   _____ _____ _____ _____ _____ _____ _____ _____ _____ _____");
		System.out.println("A |__"+GameRunner.board[0][0]+"__|__"+GameRunner.board[0][1]+"__|__"+GameRunner.board[0][2]+"__|__"+GameRunner.board[0][3]+"__|__"+GameRunner.board[0][4]+"__|__"+GameRunner.board[0][5]+"__|__"+GameRunner.board[0][6]+"__|__"+GameRunner.board[0][7]+"__|__"+GameRunner.board[0][8]+"__|__"+GameRunner.board[0][9]+"__|");
		System.out.println("B |__"+GameRunner.board[1][0]+"__|__"+GameRunner.board[1][1]+"__|__"+GameRunner.board[1][2]+"__|__"+GameRunner.board[1][3]+"__|__"+GameRunner.board[1][4]+"__|__"+GameRunner.board[1][5]+"__|__"+GameRunner.board[1][6]+"__|__"+GameRunner.board[1][7]+"__|__"+GameRunner.board[1][8]+"__|__"+GameRunner.board[1][9]+"__|");
		System.out.println("C |__"+GameRunner.board[2][0]+"__|__"+GameRunner.board[2][1]+"__|__"+GameRunner.board[2][2]+"__|__"+GameRunner.board[2][3]+"__|__"+GameRunner.board[2][4]+"__|__"+GameRunner.board[2][5]+"__|__"+GameRunner.board[2][6]+"__|__"+GameRunner.board[2][7]+"__|__"+GameRunner.board[2][8]+"__|__"+GameRunner.board[2][9]+"__|");
		System.out.println("D |__"+GameRunner.board[3][0]+"__|__"+GameRunner.board[3][1]+"__|__"+GameRunner.board[3][2]+"__|__"+GameRunner.board[3][3]+"__|__"+GameRunner.board[3][4]+"__|__"+GameRunner.board[3][5]+"__|__"+GameRunner.board[3][6]+"__|__"+GameRunner.board[3][7]+"__|__"+GameRunner.board[3][8]+"__|__"+GameRunner.board[3][9]+"__|");
		System.out.println("E |__"+GameRunner.board[4][0]+"__|__"+GameRunner.board[4][1]+"__|__"+GameRunner.board[4][2]+"__|__"+GameRunner.board[4][3]+"__|__"+GameRunner.board[4][4]+"__|__"+GameRunner.board[4][5]+"__|__"+GameRunner.board[4][6]+"__|__"+GameRunner.board[4][7]+"__|__"+GameRunner.board[4][8]+"__|__"+GameRunner.board[4][9]+"__|");
		System.out.println("F |__"+GameRunner.board[5][0]+"__|__"+GameRunner.board[5][1]+"__|__"+GameRunner.board[5][2]+"__|__"+GameRunner.board[5][3]+"__|__"+GameRunner.board[5][4]+"__|__"+GameRunner.board[5][5]+"__|__"+GameRunner.board[5][6]+"__|__"+GameRunner.board[5][7]+"__|__"+GameRunner.board[5][8]+"__|__"+GameRunner.board[5][9]+"__|");
		System.out.println("G |__"+GameRunner.board[6][0]+"__|__"+GameRunner.board[6][1]+"__|__"+GameRunner.board[6][2]+"__|__"+GameRunner.board[6][3]+"__|__"+GameRunner.board[6][4]+"__|__"+GameRunner.board[6][5]+"__|__"+GameRunner.board[6][6]+"__|__"+GameRunner.board[6][7]+"__|__"+GameRunner.board[6][8]+"__|__"+GameRunner.board[6][9]+"__|");
		System.out.println("H |__"+GameRunner.board[7][0]+"__|__"+GameRunner.board[7][1]+"__|__"+GameRunner.board[7][2]+"__|__"+GameRunner.board[7][3]+"__|__"+GameRunner.board[7][4]+"__|__"+GameRunner.board[7][5]+"__|__"+GameRunner.board[7][6]+"__|__"+GameRunner.board[7][7]+"__|__"+GameRunner.board[7][8]+"__|__"+GameRunner.board[7][9]+"__|");
		System.out.println("I |__"+GameRunner.board[8][0]+"__|__"+GameRunner.board[8][1]+"__|__"+GameRunner.board[8][2]+"__|__"+GameRunner.board[8][3]+"__|__"+GameRunner.board[8][4]+"__|__"+GameRunner.board[8][5]+"__|__"+GameRunner.board[8][6]+"__|__"+GameRunner.board[8][7]+"__|__"+GameRunner.board[8][8]+"__|__"+GameRunner.board[8][9]+"__|");
		System.out.println("J |__"+GameRunner.board[9][0]+"__|__"+GameRunner.board[9][1]+"__|__"+GameRunner.board[9][2]+"__|__"+GameRunner.board[9][3]+"__|__"+GameRunner.board[9][4]+"__|__"+GameRunner.board[9][5]+"__|__"+GameRunner.board[9][6]+"__|__"+GameRunner.board[9][7]+"__|__"+GameRunner.board[9][8]+"__|__"+GameRunner.board[9][9]+"__|");
		}
	public static void playingBoard()
		{
		System.out.println("     1     2     3     4     5     6     7     8     9     10  ");
		System.out.println("   _____ _____ _____ _____ _____ _____ _____ _____ _____ _____");
		System.out.println("A |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("B |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("C |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("D |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("E |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("F |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("G |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("H |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("I |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		System.out.println("J |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|");
		}
	}
