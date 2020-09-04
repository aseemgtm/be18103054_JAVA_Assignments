import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		System.out.println("Enter array length :");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] num = new int[a];
		if(a==0)
		{
			scan.close();
			System.out.println("end");
			return;
		}
		int[] x = new int[21];
		System.out.println("Enter array of numbers :");
		for(int i=0; i<a; i++)
		{
			num[i] = scan.nextInt();
			x[num[i]] +=1;
		}
		for(int i=0, j=0; i<21 && j<a; i++)
		{
			if(x[i]==0)
				continue;
			else
			{
				while(x[i]!=0)
				{	
					x[i]--;
					num[j]=i;
					j++;
				}
			}	
		}
		for(int i=0; i<a; i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("\n end");
		scan.close();
	}

}
