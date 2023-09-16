
public class Node<T> 
{
	// attributes
	private T data;
	protected Node<T> next;
	
	// methods
	public Node()
	{
		data = null;
		next = null;
	}
	
	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}

	public T getData() 
	{
		return data;
	}

	public Node<T> getNext() 
	{
		return next;
	}
	public void setData(T data) 
	{
		this.data = data;
	}
	
	public void setNext(Node<T> next) 
	{
		this.next = next;
	}

	@Override
	public String toString() 
	{
		return "Data = " + data;
	}
	
	
	
}