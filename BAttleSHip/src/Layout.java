
public class Layout
	{
		static String [][] Layout;
		
		public static void createLayout()
			{
				
				Layout = new String [6][6];
				for(int i = 0; i < 6; i++)
					{
						for(int j = 0; j < 6; j++)
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
			System.out.println("|   1   |       |       |       |       |       |");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   2   |       |       |       |       |       |");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   3   |       |       |       |       |       |");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   4   |       |       |       |       |       |");
			System.out.println("|_______|_______|_______|_______|_______|_______|");
			System.out.println("|       |       |       |       |       |       |");
			System.out.println("|   5   |       |       |       |       |       |");			                                      
			System.out.println("|_______|_______|_______|_______|_______|_______|");

			}
	}
