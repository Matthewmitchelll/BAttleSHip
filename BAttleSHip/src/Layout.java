import java.util.Scanner;

public class Layout
	{
		static String move;
		static String [][] Layout;	
		public static void createLayout()
			{
				
				Layout = new String [5][5];
				for(int i = 0; i < 5; i++)
					{
						for(int j = 0; j < 5; j++)
							{
								Layout [i][j] = "  ";
							}
					}
			}
		public static void display()
			{
			System.out.println();
			System.out.println(" _______________________________________________");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|       |   A   |   B   |   C   |   D   |   E   |");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   1   | "  + Layout[0][0] +  "	| "  + Layout[0][1] +  "	| "  + Layout[0][2] +  "	| "  + Layout[0][3] +  "    |   "  + Layout[0][4] +  "  | ");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   2   | "  + Layout[1][0] +  "	| "  + Layout[1][1] +  "	| "  + Layout[1][2] +  "	| "  + Layout[1][3] +  "    |   "  + Layout[1][4] +  "  | ");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   3   | "  + Layout[2][0] +  "	| "  + Layout[2][1] +  "	| "  + Layout[2][2] +  "	| "  + Layout[2][3] +  "    |   "  + Layout[2][4] +  "  | ");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   4   | "  + Layout[3][0] +  "	| "  + Layout[3][1] +  "	| "  + Layout[3][2] +  "	| "  + Layout[3][3] +  "    |   "  + Layout[3][4] +  "  | ");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   5   | "  + Layout[4][0] +  "	| "  + Layout[4][1] +  "	| "  + Layout[4][2] +  "	| "  + Layout[4][3] +  "    |   "  + Layout[4][4] +  "  | ");			                                      
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			}
		public static void userInput()
			{
				
			int col = 0;
				Scanner userInput = new Scanner(System.in);
				 move = userInput.nextLine();
				 switch (move.substring(0,1))
				{
				case "a":
				case "A":
						{
								col = 0;
								break;
						}
				case "b":
				case "B":
						{
								col = 1;
								break;
						}
				case "c":
				case "C":
						{
								col = 2;
								break;
						}
				case "d":
				case "D":
						{
								col = 3;
								break;
						}
				case "e":
				case "E":
						{
								col = 4;
								break;
						}
				}							
						
				int row=Integer.parseInt(move.substring(1))-1;
				Layout[row][col]=" []";			
			display();	
			}
		public static void aIMove()
			{
				int row=0;
				int col=0;
				int randomRow=(int)(Math.random()*4);
				int randomCol=(int)(Math.random()*4);
				row=randomRow;
				col=randomCol;
				//row = 0;
				//col = 0;
				if(Layout[row][col].equals("  "))
					{
				System.out.println(Layout[row][col]=" *");
					}
				else
					{
						System.out.println("[*]");
						System.out.println("your ship has sunk");
						System.out.println("you lose :(");
						System.exit(0);
					}
				display();
			}

			}
			
	
