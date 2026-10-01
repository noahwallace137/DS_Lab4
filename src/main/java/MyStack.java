
public class MyStack<T>
{
	public Node head;

	public class Node{
		public T val;
		public Node next;
		public Node(T val) {
			this.val = val;
			this.next = null;
		}
	
		public void push(Node newNode) {
			if (next == null) {
				next = newNode;
			}
			else {
				next.push(newNode);
			}
		}
		public T top() {
			if (next == null) {
				return val;
			}
			else {
				return next.top();
			}
		}
		public T pop() 
		{
			if (next == null) {
			T temp = val;
			head = null;
			return temp;
			}
		if (next.next == null) {
			T temp = next.val;
			next = null;
			return temp;
		}
		return next.pop();
		}
	}

	public MyStack()
	{
		head = null;

	}


	public void push(T val)
	{
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;

		}
		else
		{
			head.push(newNode);
		}
		

	}
	public T top()
	{
		if (head == null) {
			throw new StackUnderFlowException();
		}
		return head.top();
		
	}


	public T pop()
	{
		if (head == null) {
			throw new StackUnderFlowException();
		}
		return head.pop();
	}


	public boolean isEmpty()
	{
		return head == null;
	}

}