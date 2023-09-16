import java.util.Scanner;
import java.util.ArrayList;
public class Lab01SID {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		ArrayList<Character> arr_list = new ArrayList<Character>();
		System.out.println("Welcome to the ArrayList Menu System");
		System.out.println("Author : Leeharika Siddabatuni");
		System.out.println("Using ArrayLists");
		PrintMenu();
		while(true)
		{
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					char ch;
					System.out.print("Enter the character to add:");
					ch=sc.next().charAt(0);
					arr_list.add(0,ch);
					System.out.println("Character added at the beginning");
					break;
				}
				case 2:
				{
					char ch;
					System.out.print("Enter the character to add:");
					ch=sc.next().charAt(0);
					arr_list.add(ch);
					System.out.println("Character added at the end");
					break;
				}
				case 3:
				{
					arr_list.remove(0);
					System.out.println("Character removed from the beginning");
					break;
				}
				case 4:
				{
					arr_list.remove(arr_list.size()-1);
					System.out.println("Character removed from the end");
					break;
				}
				case 5:
				{
					System.out.println("The character at the beginning of the list is "+arr_list.get(0));
					break;
				}
				case 6:
				{
					System.out.println("The character at the end of the list is "+arr_list.get(arr_list.size()-1));
					break;
				}
				case 7:
				{
					if(arr_list.isEmpty()==true)
					{
						System.out.println("The list is empty");
					}
					else
					{
						System.out.println("The list is not empty");
					}
					break;
				}
				case 8:
				{
					System.out.println("There are "+arr_list.size()+" elements in the array");
					break;
				}
				case 9:
				{
					arr_list.clear();
					System.out.println("The list has been cleared");
					break;
				}
				case 10:
				{
					//System.out.println();
					for(int i=0; i<arr_list.size();i++)
					{
						System.out.print(arr_list.get(i));
						if(i==arr_list.size()-1)
						{
							continue;
						}
						System.out.print("->");
					}
					if(arr_list.isEmpty()==true)
					{
						System.out.println("The list is empty");
					}
					System.out.println();
					break;
				}
				case 11:
				{
					System.out.println("Are you sure you want to quit[Y/N]");
					String ch;
					ch = sc.next().toUpperCase();
					if(ch.charAt(0)=='Y')
					{
						System.out.println("Good Bye");
						sc.close();
						System.exit(0);
					}
					break;
				}
				default:
				{
					System.out.println("Invalid choice");
					break;
				}
			}
			PrintMenu();
		}
		
	}
	public static void PrintMenu()
	{
		System.out.println("1.Place the element at the beginning of the ArrayList");
		System.out.println("2.Place the element at the end of the ArrayList");
		System.out.println("3.Remove an element from the beginning of the ArrayList");
		System.out.println("4.Remove an element from the end of the ArrayList");
		System.out.println("5.Examine the element at the beginning of the ArrayList");
		System.out.println("6.Examine the element at the end of the ArrayList");
		System.out.println("7.Check if the ArrayList is empty");
		System.out.println("8.Get the current size of the ArrayList");
		System.out.println("9.Clear the ArrayList");
		System.out.println("10.Print the contents of the ArrayList");
		System.out.println("11.Quit");
		System.out.println();
	}
}
