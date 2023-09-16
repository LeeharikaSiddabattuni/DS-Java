import java.util.Scanner;
public class Lab00SID 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String choice="0";
		String temp;
		System.out.println("Welcome to the Menu framework program");
		System.out.println("Author : Leeharika Siddabattuni");
		System.out.println("Select an option");
		PrintMenu();
		while(true)
		{
			System.out.println("Enter your choice : ");
			choice = sc.nextLine().trim();
			switch(choice)
			{
			case "1":
				{
					System.out.print("Enter a word : ");
					temp=sc.nextLine().trim();
					System.out.println("You entered : "+temp);
					break;
				}
			case "2":
				{
					System.out.print("Enter a different word : ");
					temp=sc.nextLine().trim();
					System.out.println("You entered : "+temp);
					break;
				}
			case "3":
				{
					System.out.print("Enter yet another different word : ");
					temp=sc.nextLine().trim();
					System.out.println("You entered : "+temp);
					break;
				}
			case "4":
				{
					System.out.print("Are you sure you want to quit[Y/N]?");
					choice = sc.nextLine().trim().toUpperCase();
					if(choice.charAt(0)=='Y')
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
		System.out.println();
		System.out.println("1.Do this");
		System.out.println("2.Do that");
		System.out.println("3.Do something else");
		System.out.println("4.Quit");
		System.out.println();
	}
}
