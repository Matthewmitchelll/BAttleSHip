import java.util.Scanner;

public class battleshipRunner
	{

		public static void main(String[] args)
			{
				Layout.createLayout();
				Layout.display();
				greet();
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
			Scanner userInput = new Scanner(System.in);
			String rowImput = userInput.nextLine();
			//rowImput = move.substring(0,1);
			rowImput = rowImput.toUpperCase();
			if(rowImput.equals("A1"))
				{
					//assign it to A1
				}
			else if (rowImput.equals("A2"))
				{
					//assign to A2
				}
			else if (rowImput.equals("A3"))
				{
					//assign to A3
				}
			else if (rowImput.equals("A4"))
				{
					//assign to A4
				}
			else if (rowImput.equals("A5"))
				{
					//assign to A5
				}
			}
	}
