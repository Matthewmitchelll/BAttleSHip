import java.util.Scanner;

public class battleshipRunner
	{

		public static void main(String[] args)
			{
				Layout.createLayout();
				Layout.display();
				Layout.fillLayout();
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
		
	
			}
		//public static void userInput()
			//{
				
		//	int row=0;
//				Scanner userInput=new Scanner(System.in);
	//			 move=userInput.nextLine();
		//		switch (move.substring(0,1))
			//	{
				//case "a":
		//		case "A":
			//			{
				//			row=0;
					//		break;
						//}
//					case "b":
	//				case "B":
		//					{
			//					row=1;
				//				break;
					//		}
	//			case "c":
		//		case "C":
			//			{
				//			row=2;
					//		break;
					//	}
						
			//	}

			}	
				
	
