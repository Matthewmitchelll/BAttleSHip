import java.util.Scanner;

public class battleshipRunner
	{

		public static void main(String[] args)
			{
				Layout.createLayout();
				Layout.display();
				greet();
				while(true)
					{
				Layout.userInput();
				Layout.aIMove();			
					}
			}
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
					System.out.println("*the right answer is easy*");
					greet();
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
	//	public static void loop()
	//		{
	//			boolean StillPlaying = true;
	//			while (StillPlaying)
	//
	//		{
	//				if (StillPlaying = false)
	//				{
	//					System.out.println("you lost");	
	//					System.exit(0);
		//			}
	//				
//				
	//				else if (StillPlaying = true)
		//			
			//		{
				//		Layout.userInput();
					//	Layout.display();
//						Layout.aIMove();
	//				}
		//		}	
		//	}

				
	}				
