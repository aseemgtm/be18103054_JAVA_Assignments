import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        long x = scan.nextLong();
	        System.out.println("Hailstone sequence: " + x);
	        scan.close();
	        long c = 0L;
	        while(x!=1 && c<Long.MAX_VALUE && x<Long.MAX_VALUE && x>0)
	        {
	            if(x%2!=0)
	            {
	                x*=3;
	                x++;
	            }
	            else
	                x/=2;
	            System.out.println(x);
	            c++;
	        }
	        if(x==1)
	            System.out.println("No of steps: "+c);
	        else if(x==Long.MAX_VALUE || x<0)
	            System.out.println("Integer overflow reached");
	        else
	            System.out.println("No of steps maxed out.");
	}
}
