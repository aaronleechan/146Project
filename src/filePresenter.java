import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		
		// Read the file
		System.out.println("Read File");
		String filename = new Scanner(System.in).nextLine();
		
		try {    		
			Scanner in = new Scanner(new File(filename), "UTF-8");
			
			while(in.hasNext())
			{
				String s = in.nextLine();
				fileReader.read(s);
			}			
			
		} catch (FileNotFoundException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
		
		
		
		
		
	}
	
	
	
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
