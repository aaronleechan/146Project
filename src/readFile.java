import java.util.ArrayList;

public class readFile {

	// ArrayList<String> storeAllList = new ArrayList<String>(); //want a full
	// array
	// Only to read a file

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
		//add to people array at hashcode.
		people[code] = p;
		//set ID of person
		p.setID(code);
		
		return code;
	}
}
