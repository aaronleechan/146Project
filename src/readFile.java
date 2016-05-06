import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
		
	private Person[] people = new Person[10];
	private int count = 0;
	
	ArrayList<String> storeAllList = new ArrayList<String>();
	//Only to read a file
	
	public void read() {
		
		// Read the file
				System.out.println("Read File");
				String filename = new Scanner(System.in).nextLine();
				
				try {    		
					Scanner in = new Scanner(new File(filename), "UTF-8");
					
					while(in.hasNextLine())
					{
						String line = in.nextLine();
						storeAllList.add(line);
						
						Scanner wd = new Scanner(line);
						while(wd.hasNext())
						{
							String nameFirst = wd.next();
							String nameLast = wd.next();
							String name = nameFirst + " " + nameLast;
							int wt = wd.nextInt();
							int ht = wd.nextInt();
							int age = wd.nextInt();
							String gender = wd.next();
							int hrt = wd.nextInt();
							
							Person p = new Person(name, age, wt, ht, gender, hrt);
							hash(p); //person added to people array
						}
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

	// ArrayList<String> storeAllList = new ArrayList<String>(); //want a full
	// array
	// Only to read a file

	public int hash(Person p) {
		// hashcode formula!
		
		if(count == people.length){
			Person[] P_Resize = new Person[people.length*2]; 
			
			for(int i=0; i<people.length; i++)
			{
				P_Resize[i] = people[i];
			}
			
			people = P_Resize;
		}
		
		int code = (p.getName().length() 
					+ p.getAge() + p.getHrt() 
					+ p.getHt() + p.getWt()) % people.length;
		//linear probe!
		while(people[code] != null){
			if(code == people.length-1)
				code = 0;
			else
				code++;

	Person[] people;

	public void read(String s) {
		storeAllList.add(s);
		// TODO Auto-generated method stub
	}

	public void readFile() 
	{

	}

	public int hash(Person p) {
		// hashcode formula!
		int code = (p.getName().length() 
					+ p.getAge() + p.getHrt() 
					+ p.getHt() + p.getWt()) % 50;
		//linear probe!
		while(people[code] != null){
			code += 1;

		}
		people[code] = p;
		p.setID(code);
		count++;
		return code;
	}
	


//	public int hash(Person p) {
//		// hashcode formula!
//		int code = (p.getName().length() 
//					+ p.getAge() + p.getHrt() 
//					+ p.getHt() + p.getWt()) % 50;
//		//linear probe!
//		while(people[code] != null){
//			code += 1;
//		}
//		//add to people array at hashcode.
//		people[code] = p;
//		//set ID of person
//		p.setID(code);
//		count++;
//		
//		return code;
//	}
	
}
