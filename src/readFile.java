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
		
		
		


	// ArrayList<String> storeAllList = new ArrayList<String>(); //want a full
	// array
	// Only to read a file

	public int hash(Person p) {
		// hashcode formula!
		int code = (p.getName().length() 
					+ p.getAge() + p.getHrt() 
					+ p.getHt() + p.getWt()) % 50;
		//linear probe!
		while(people[code] != null){
			code += 1;
		}
		//add to people array at hashcode.
		people[code] = p;
		//set ID of person
		p.setID(code);
		
		return code;
	}
}
