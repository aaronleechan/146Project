
public class Person {
	
	private int ID;
	private String name;
	private int ht;
	private int wt;
	private int age;
	private int hrt;
	private String gender;
	
	public Person(String name, int age, int wt, int ht, String gender, int hrt)
	{
		this.name = name;
		this.age = age;
		this.wt = wt;
		this.ht = ht;
		this.gender = gender;
		this.hrt = hrt;
		
	}
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
}
