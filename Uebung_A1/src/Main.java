
public class Main 
{
	public static void main(String[] args)
	{
		Input input = new Input();
		while(true)
		{
			int choosen;
			int a = input.scann_int("Zahl 1:");
			int b = input.scann_int("Zahl 2:");
			
			System.out.println("1. Euclid Iterativ");
			System.out.println("2. Euclid rekursiv");
			System.out.println("3. Division Iterativ");
			System.out.println("4. Division rekursiv");
			
			choosen = input.scann_int("Wählen sie ein Verfahren:");
			
			switch(choosen)
			{
				case 1: System.out.println(euclidIt(a, b));
				break;
				case 2: System.out.println(euclidRecursive(a, b));
				break;
				case 3: System.out.println(divisionRestReq(a, b));
				break;
				case 4: System.out.println(divisionRestReq(a, b));
			}
			
		}
	}
	
	static int euclidIt(int a, int b)
	{
		if(a == 0)
			return b;
		else
		{
			while(b != 0)
			{
				if (a > b)
					a -= b;
				else
					b -= a;
			}
		}
		
		return a;
	}
	
	static int euclidRecursive(int a, int b)
	{
		if (b == 0)
			return a;
		else if ( a == 0)
			return b;
		else if ( a > b)
			return euclidRecursive(a-b, b);
		else
			return euclidRecursive(a, b-a);
	}
	
	static int divisionRestReq(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return divisionRestReq(b, a % b);
	}
	
	static int divisionRestIt(int a, int b)
	{
		int h = 0;
		while(b != 0)
		{
			h = a%b;
			a = b;
			b = h;
		}
		return a;
	}
}
