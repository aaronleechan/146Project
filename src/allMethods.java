public class allMethods {

	// quicksorts the heights
	public static Person[] qsortHt(Person[] ppl) {
		Person[] temp = ppl.clone();
		return temp;
	}

	// heapsorts the heart rates
	public static Person[] hsortHr(Person[] ppl) {
		Person[] temp = ppl.clone();
		return temp;
	}

	// mergeSort
	public static Person[] msortWt(Person[] ppl) {
		Person[] temp = ppl.clone();
		return temp;
	}

	// finds person by name
	public static Person searchName(Person[] ppl) {
		Person[] temp = ppl.clone();

		class Node<T> {
			T ele;
			Node<T> left;
			Node<T> right;

			// inner class constructor
			Node(T element) {
				this(element, null, null);
			}

			// inner class constructor
			Node(T element, Node<T> lt, Node<T> rt) {
				ele = element;
				left = lt;
				right = rt;
			}
		}

		class BST<T extends Comparable<? super T>> {

			// instantiate root, count
			private Node<T> root;

			// constructor
			public BST() {
				root = null;
			}

			// retrieves root
			public Node<T> root() {
				return this.root;
			}

			// isEmpty method
			public boolean isEmpty() {
				return root == null;
			}

			// contains method
			public boolean contains(T x) {
				return contains(x, root);
			}

			private boolean contains(T x, Node<T> t) {
				if (t == null) {
					return false;
				}
				int comparison = x.compareTo(t.ele);

				if (comparison < 0) // if x < t.ele
				{
					return contains(x, t.left);
				} else if (comparison > 0) {
					return contains(x, t.right);
				} else {
					return true;
				}
			}

			// findMin method
			public T findMin() throws Exception {
				if (isEmpty()) {
					throw new Exception();
				} else {
					return findMin(root).ele;
				}
			}

			private Node<T> findMin(Node<T> t) {
				if (t != null) {
					while (t.left != null) {
						t = t.left;
					}
				}

				return t;
			}

			// findMax method
			public T findMax() throws Exception {
				if (isEmpty()) {
					throw new Exception();
				} else {
					return findMax(root).ele;
				}
			}

			private Node<T> findMax(Node<T> t) {
				if (t != null) {
					while (t.right != null) {
						t = t.right;
					}
				}

				return t;
			}

			// insert method
			public void insert(T x) {
				root = insert(x, root);
			}

			private Node<T> insert(T x, Node<T> t) {
				if (t == null) {
					return new Node<>(x, null, null);
				}

				int comparison = x.compareTo(t.ele);

				if (comparison < 0) {
					t.left = insert(x, t.left);
				} else if (comparison > 0) {
					t.right = insert(x, t.right);
				} else {
					;
				}

				return t;
			}

			// remove method
			public void remove(T x) {
				root = remove(x, root);
			}

			private Node<T> remove(T x, Node<T> t) {
				if (t == null) {
					return t;
				}

				int comparison = x.compareTo(t.ele);

				if (comparison < 0) {
					t.left = remove(x, t.left);
				} else if (comparison > 0) {
					t.right = remove(x, t.right);
				} else if (t.left != null && t.right != null) // if match and
																// has two
																// children
				{
					t.ele = findMin(t.right).ele;
					t.right = remove(t.ele, t.right);
				} else // match and has at most 1 child
				{
					t = (t.left != null) ? t.left : t.right;
				}

				return t;
			}

			/**
			 * size() finds the number of Nodes in the tree
			 */
			public int size() {
				return size(root);
			}

			private int size(Node<T> t) {
				if (t == null) {
					return 0;
				} else {
					return 1 + size(t.left) + size(t.right);
				}
			}

		} // end BST

		// build the tree
		// ....
		return null;
	}
}
