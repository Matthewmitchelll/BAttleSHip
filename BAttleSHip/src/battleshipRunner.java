import java.util.Scanner;

public class battleshipRunner
	{

		public static void main(String[] args)
			{
				Layout.createLayout();
				Layout.display();
				greet();
				Layout.userInput();
			}
		static String move;
		public static void greet()
			{
			System.out.println("What difficultly would you like?");
			Scanner userInput = new Scanner(System.in);
			String difficulty = userInput.nextLine();
			if (difficulty.equals("easy"))
				{
					easy();
				}
			else if (difficulty.equals("hard"))
				{
					System.out.println("You have chosen hard mode");
				}
			else
				{
					System.out.println("Choose easy or hard.");
					greet();
				}
			}
		public static void easy()
			{
			System.out.println("pick spots where you would like to place your ships");
			System.out.println("each ship takes one space (e.g. A1)");
			userInput();
			//Scanner userInput = new Scanner(System.in);
			//String shipSpot = userInput.nextLine();
	//		shipSpot = shipSpot.toUpperCase();
		//	if (shipSpot.equals("A1"));
			//	   System.out.println(" ____");
				// System.out.println("|____|");
				 
			}
		public static void userInput()
			{
				
			int row = 0;
				Scanner userInput = new Scanner(System.in);
				 move = userInput.nextLine();
				switch (move.substring(0,1))
				{
				case "a":
				case "A":
						{
								row = 0;
								break;
						}
				case "b":
				case "B":
						{
								row = 1;
								break;
						}
				case "c":
				case "C":
						{
								row = 2;
								break;
						}
				case "d":
				case "D":
						}
								row = 3;
								break;
						}
				case "e":
				case "E":
						}
								row = 4;
								break;
						}
								
						
									
							
							
								
							
							
							
							}
			}

				
				
//Layout.Layout[0][0] = "A1";
//Layout.Layout[1][0] = "A2";
//Layout.Layout[2][0] = "A3";
//Layout.Layout[3][0] = "A4";				
//Layout.Layout[4][0] = "A5";			
//Layout.Layout[0][1] = "B1";
//Layout.Layout[1][1] = "B2";
//Layout.Layout[2][1] = "B3";
//Layout.Layout[3][1] = "B4";
//Layout.Layout[4][1] = "B5";
//Layout.Layout[0][2] = "C1";
//Layout.Layout[1][2] = "C2";
//Layout.Layout[2][2] = "C3";
//Layout.Layout[3][2] = "C4";
//Layout.Layout[4][2] = "C5";
//Layout.Layout[0][3] = "D1";
//Layout.Layout[1][3] = "D2";
//Layout.Layout[2][3] = "D3";
//Layout.Layout[3][3] = "D4";
//Layout.Layout[4][3] = "D5";
//Layout.Layout[0][4] = "E1";
//Layout.Layout[1][4] = "E2";
//Layout.Layout[2][4] = "E3";
//Layout.Layout[3][4] = "E4";
//Layout.Layout[4][4] = "E5";
