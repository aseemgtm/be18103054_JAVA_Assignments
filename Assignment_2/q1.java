import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		String a,b;
		int x=0,y=0;
		System.out.println("enter string one :");
		Scanner scan = new Scanner(System.in);
		a = scan.next();
		System.out.println("enter string two : ");
		b = scan.next();
		for(int i=0; i<a.length() && i<b.length(); i++)
		{
			if(a.charAt(i) == b.charAt(i))
			{
				continue;
			}
			else if(a.charAt(i) > b.charAt(i))
			{
				x=1;
				break;
			}
			else
			{
				y=1;
				break;
			}
		}
		if(x==0 && y==0)
		{
			if(a.length()==b.length())
				System.out.println("Both the strings are same");
			else if(a.length()<b.length())
				System.out.println(a+ " comes before " +b+ " lexicographically" );
			else
				System.out.println(b+ " comes before " +a+ " lexicographically" );
		}
		else if(x==1)
			System.out.println(b+ " comes before " +a+ " lexicographically" );
		else if(y==1)
			System.out.println(a+ " comes before " +b+ " lexicographically" );
		scan.close();
	}

}
