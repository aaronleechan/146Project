import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
	
	public ArrayList<String> storeAllList = new ArrayList<String>();
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
<<<<<<< HEAD
=======
						//storeAllList.add(line);
						
>>>>>>> 4f5f873fd51e350b21a13d98407056dcd9f788d9
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
							Hashing.hash(p); //person added to people array
							
						}
<<<<<<< HEAD
						wd.close();
					}
					in.close();
=======
						
						
					}	
					
					//for testing. prints each Person.
//					for(Person ppl : Hashing.people)
//					{
//						System.out.println(ppl);
//					}
		
					for(Person person: Hashing.people){
						if(person != null) storeAllList.add(person.toString());
					}
					
>>>>>>> 4f5f873fd51e350b21a13d98407056dcd9f788d9
				} catch (FileNotFoundException e) {
				
					e.printStackTrace();
				}	  
<<<<<<< HEAD
		storeAllList.clear();
		// TODO Auto-generated method stub	
=======
		
		
		
>>>>>>> 4f5f873fd51e350b21a13d98407056dcd9f788d9
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

<<<<<<< HEAD
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
		}
		people[code] = p;
		p.setID(code);
		storeAllList.add(p.toString());
		count++;

		//for testing. prints each Person.
//		for(Person ppl : people)
//		{
//			System.out.println("people: " + ppl);
//		}
//		for(String peeps : storeAllList)
//		{
//			System.out.println("AllList: " + peeps);
//		}
		return code;
	}
=======
	
>>>>>>> 4f5f873fd51e350b21a13d98407056dcd9f788d9
}
	


