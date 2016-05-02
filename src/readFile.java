import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
	
	ArrayList<String> storeAllList = new ArrayList<String>();
	//Only to read a file
	
	public void read() {
		
		// Read the file
				System.out.println("Read File");
				String filename = new Scanner(System.in).nextLine();
				
				try {    		
					Scanner in = new Scanner(new File(filename), "UTF-8");
					
					while(in.hasNext())
					{
						String s = in.nextLine();
						storeAllList.add(s);
					}			
					
				} catch (FileNotFoundException e) {
				
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	  
		
		
		// TODO Auto-generated method stub	
	}
	
	public void readFile(){
		
		for(int i = 0; i < storeAllList.size(); i++)
		{
			System.out.println(storeAllList.get(i));
		}
		
		
		
	}

}
