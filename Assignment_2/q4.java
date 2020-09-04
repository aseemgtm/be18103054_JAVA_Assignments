
public class q4 {

	public static void main(String[] args) {
		long n=1;
        long sum = 1;
        while(n< 3037000499L){
            if(sum==n*n)
                System.out.println("Ans: "+n);
            n+=1;
            sum+=n;
            
        }
        System.out.println("sum: "+sum+" n: "+n + " n*n: " + n*n);

	}

}
