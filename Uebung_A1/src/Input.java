import java.util.Scanner;

public class Input 
{
	Scanner sc;
	
	Input()
	{
		sc = new Scanner(System.in);
	}
	
	int scann_int(String text)
	{
		while(true)
		{
			int output;
			System.out.println(text);
			String input = sc.nextLine();
		
			try
			{
				output = Integer.parseInt(input);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Falsche Eingabe!");
				continue;
			}
			return output;
		}
	}
}
