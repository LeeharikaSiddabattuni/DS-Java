
public class LinkedList<T> 
{
	// attributes
	protected Node<T> head;
	protected Node<T> tail;
	private int size;
	
	// constructors
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		/*
		if(head == null)
			return true;
		else
			return false;
			*/
		return (head == null);
		
		//return (size == 0);
				
	}
	
	public int getSize()
	{
		return size;
	}
	
	// facilitators
	private boolean isValidPosition(int pos)
	{	/*
		if(pos > size -1 || pos < 0)
			return false;
		else
			return true;
			*/
		return !(pos > size -1 || pos < 0);
		// DeMorgan's Law
		//return (pos <= size -1 && pos >= 0);
		
	}
	
	public void insertAtHead(T val)
	{
		Node<T> nptr = new Node<T>(val, null);
		if(head == null)
		{
			head = nptr;
			tail = head;
		}
		else
		{
			nptr.setNext(head);
			head = nptr;
		}
		size++;
		
	}
	
	public void insertAtTail(T val)
	{
		Node<T> nptr = new Node<T>(val, null);
		if(head == null)
		{
			head = nptr;
			tail = head;
		}
		else	
		{
			tail.setNext(nptr);
			tail = nptr;
		}
		size++;
	}
	
	public void insertAtPos(T val, int pos)
	{
		if(!isValidPosition(pos))
		{
			return;
		}
		if(pos == 0)
		{
			insertAtHead(val);
			return;
		}
		Node<T> nptr = new Node<T>(val, null);
		Node<T> ptr = head;
		pos = pos - 1;
		for(int i = 0; i < size; i++)
		{
			if(i == pos)
			{
				Node<T> tmp = ptr.getNext();
				ptr.setNext(nptr);
				nptr.setNext(tmp);		
			}
			ptr = ptr.getNext();
		}
		size++;
	}
	
	//printlist
	public void printList()
	{
		Node<T> temp=head;
		if(getSize()==0)
		{
			System.out.println("Empty list");
			return;
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp=temp.next;
			}
		}
	}
	
}
 