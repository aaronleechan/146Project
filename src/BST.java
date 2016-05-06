import java.util.Comparator;

public class BST implements Comparator<String> {
	
	public BST(){
		root = null;
	}
	
	//generic node class
	class Node{
		String ele;
		Node left;
		Node right;

		// inner class constructor
		Node(String element){
			this(element, null, null);
		}

		// inner class constructor
		Node(String element, Node lt, Node rt){
			ele = element;
			left = lt;
			right = rt;
		}
	}
	
	public Node root(){
		return this.root;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public boolean contains(String x){
		return contains(x, root);
	}
	
	private boolean contains(String x, Node t){
		if(t == null)
			return false;
		
		int comparison = compare(x, t.ele);
		
		if(comparison < 0)
			return contains(x, t.left);
		else if(comparison > 0)
			return contains(x, t.right);
		else
			return true;
	}

	public int compare(String x, String anotherString){
		int i=0; int j=0;
		while(i < x.length() && j < anotherString.length()){
			if(x.charAt(i) < anotherString.charAt(j))
				return -1;
			else if(x.charAt(i) > anotherString.charAt(j))
				return 1;
			i++; j++;
		}
		if(x.length() < anotherString.length()) //if x shorter than aStr
			return -1;
		else if(x.length() > anotherString.length())
			return 1;
		return 0;
	}
	
	//instantiate root, count
	private Node root;
	
	//insert method
	public void insert(String x)
	{
		root = insert(x, root);
	}
	
	private Node insert(String x, Node t)
	{
		if(t == null)
			return new Node(x, null, null);
		
		int comparison = compare(x, t.ele);
		
		if(comparison < 0)
			t.left = insert(x, t.left);
		else if(comparison > 0)
			t.right = insert(x, t.right);
		else{
			;
		}
		
		return t;
	}
}