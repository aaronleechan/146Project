import java.util.Scanner;

public class mainFile {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Layout gameLayout;
		
		try
		{
			gameLayout = new Layout(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			System.out.println(gameLayout.getClass().getSimpleName());
		}
		catch(Exception ex)
		{
			gameLayout = new Layout(6, 4);
		}
	}

}
