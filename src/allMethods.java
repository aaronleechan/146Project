////import BST.Node;
//<<<<<<< HEAD
//public class allMethods {
//
//	// quicksorts the heights
//	public static Person[] qsortHt(Person[] ppl) {
//		Person[] temp = ppl.clone();
//		return temp;
//	}
//
//	/**
//	 * heapsorts the heart rates
//	 */
//	public static Person[] hsortHr(Person[] ppl) {
//		Person[] temp = ppl.clone();
//		heapsort(temp);
//		return temp;
//	}
//
//	// returns the left child
//	private static int leftChild(int i) {
//		return 2 * i + 1;
//	}
//	// percolates down
//	private static void percDown(Person[]array, int i, int n){
//		int child;
//		Person temp;
//		for (temp = array[i]; leftChild(i) < n; i = child)
//		{
//			child = leftChild(i);
//			if (child != n - 1 && array[child].getHrt() < array[child + 1].getHrt())
//				child++;
//			if (temp.getHrt() < array[child].getHrt())
//				array[i] = array[child];
//			else
//			{
//				break;
//			}
//			array[i] = temp;
//		}
//	}
//	// heapsort
//	public static void heapsort(Person[] array)
//	{
//		for (int i = array.length / 2; i >= 0; i--)
//		{
//			percDown(array, i, array.length);
//		}
//		for (int i = array.length - 1; i > 0; i--)
//		{
//			swapReference(array, 0, i);
//			percDown(array, 0, i);
//		}
//	}
//	//swap two nodes
//	public static void swapReference(Person[] array, int i, int n)
//	{
//		Person temp = array[i];
//		array[i] = array[n];
//		array[n] = temp;
//	}
//
//	/**
//	 * mergesorts the weight use merge() and mergeSort()
//	 */
//	// TO DO: implement mergeSort
//	public static Person[] msortWt(Person[] ppl) {
//		Person[] temp = ppl.clone();
//		mergeSort(temp);
//		return temp;
//	}
//
//	// sorting step of merge sort
//	public static void mergeSort(Person[] array) {
//		if (array.length >= 1) {
//			return;
//		}
//		Person[] first = new Person[array.length / 2];
//		Person[] second = new Person[array.length - first.length];
//		for (int i = 0; i < first.length; i++) {
//			first[i] = array[i];
//
//		}
//		for (int i = 0; i < second.length; i++) {
//			second[i] = array[first.length + i];
//		}
//		mergeSort(first);
//		mergeSort(second);
//		merge(first, second, array);
//	}
//
//	// merging step of merge sort
//	public static void merge(Person[] array1, Person[] array2, Person[] temp) {
//		int iArray1 = 0;
//		int iArray2 = 0;
//		int iTemp = 0;
//		while (iArray1 < array1.length && iArray2 < array2.length) {
//			if (array1[iArray1].getWt() < array2[iArray2].getWt()) {
//				temp[iTemp] = array1[iArray1];
//				iArray1++;
//			} else {
//				temp[iTemp] = array2[iArray2];
//				iArray2++;
//			}
//			iTemp++;
//		}
//		// copy the remains
//		while (iArray1 < array1.length) {
//			temp[iTemp] = array1[iArray1];
//			iArray1++;
//			iTemp++;
//		}
//		while (iArray2 < array2.length) {
//			temp[iTemp] = array2[iArray2];
//			iArray2++;
//			iTemp++;
//		}
//
//	}
//
//	// finds person by name
//	public static Person searchName(Person[] ppl) {
//		Person[] temp = ppl.clone();
//
//		class Node<T> {
//			T ele;
//			Node<T> left;
//			Node<T> right;
//
//			// inner class constructor
//			Node(T element) {
//				this(element, null, null);
//			}
//
//			// inner class constructor
//			Node(T element, Node<T> lt, Node<T> rt) {
//				ele = element;
//				left = lt;
//				right = rt;
//			}
//		}
//
//		class BST<T extends Comparable<? super T>> {
//
//			// instantiate root, count
//			private Node<T> root;
//
//			// constructor
//			public BST() {
//				root = null;
//			}
//
//			// retrieves root
//			public Node<T> root() {
//				return this.root;
//			}
//
//			// isEmpty method
//			public boolean isEmpty() {
//				return root == null;
//			}
//
//			// contains method
//			public boolean contains(T x) {
//				return contains(x, root);
//			}
//
//			private boolean contains(T x, Node<T> t) {
//				if (t == null) {
//					return false;
//				}
//				int comparison = x.compareTo(t.ele);
//
//				if (comparison < 0) // if x < t.ele
//				{
//					return contains(x, t.left);
//				} else if (comparison > 0) {
//					return contains(x, t.right);
//				} else {
//					return true;
//				}
//			}
//
//			// findMin method
//			public T findMin() throws Exception {
//				if (isEmpty()) {
//					throw new Exception();
//				} else {
//					return findMin(root).ele;
//				}
//			}
//
//			private Node<T> findMin(Node<T> t) {
//				if (t != null) {
//					while (t.left != null) {
//						t = t.left;
//					}
//				}
//
//				return t;
//			}
//
//			// findMax method
//			public T findMax() throws Exception {
//				if (isEmpty()) {
//					throw new Exception();
//				} else {
//					return findMax(root).ele;
//				}
//			}
//
//			private Node<T> findMax(Node<T> t) {
//				if (t != null) {
//					while (t.right != null) {
//						t = t.right;
//					}
//				}
//
//				return t;
//			}
//
//			// insert method
//			public void insert(T x) {
//				root = insert(x, root);
//			}
//
//			private Node<T> insert(T x, Node<T> t) {
//				if (t == null) {
//					return new Node<>(x, null, null);
//				}
//
//				int comparison = x.compareTo(t.ele);
//
//				if (comparison < 0) {
//					t.left = insert(x, t.left);
//				} else if (comparison > 0) {
//					t.right = insert(x, t.right);
//				} else {
//					;
//				}
//
//				return t;
//			}
//
//			// remove method
//			public void remove(T x) {
//				root = remove(x, root);
//			}
//
//			private Node<T> remove(T x, Node<T> t) {
//				if (t == null) {
//					return t;
//				}
//
//				int comparison = x.compareTo(t.ele);
//
//				if (comparison < 0) {
//					t.left = remove(x, t.left);
//				} else if (comparison > 0) {
//					t.right = remove(x, t.right);
//				} else if (t.left != null && t.right != null) // if match and
//																// has two
//																// children
//				{
//					t.ele = findMin(t.right).ele;
//					t.right = remove(t.ele, t.right);
//				} else // match and has at most 1 child
//				{
//					t = (t.left != null) ? t.left : t.right;
//				}
//
//				return t;
//			}
//
//			/**
//			 * size() finds the number of Nodes in the tree
//			 */
//			public int size() {
//				return size(root);
//			}
//
//			private int size(Node<T> t) {
//				if (t == null) {
//					return 0;
//				} else {
//					return 1 + size(t.left) + size(t.right);
//				}
//			}
//
//		} // end BST
//
//		// build the tree
//		// ....
//		return person;
//	}
//
//}
//>>>>>>> mergeSort
