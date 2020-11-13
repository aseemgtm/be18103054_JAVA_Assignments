public class q2 extends Thread
{
	int startNumberOfthread;
	static int maxDivisorCount=0, numWithMaxDivisorCount=0;
	
	public q2(int startNumberOfThread)
	{
		this.startNumberOfthread = startNumberOfThread;
	}
	
	public static void main(String[] args) 
	{
		q2 t1 = new q2(1);
		q2 t2 = new q2(10001);
		q2 t3 = new q2(20001);
		q2 t4 = new q2(30001);
		q2 t5 = new q2(40001);
		q2 t6 = new q2(50001);
		q2 t7 = new q2(60001);
		q2 t8 = new q2(70001);
		q2 t9 = new q2(80001);
		q2 t10 = new q2(90001);
		
		long startTime = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
		}
		catch(Exception e) {}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(numWithMaxDivisorCount + " has the maximum number of divisors i.e " + maxDivisorCount);
		System.out.println("Total time elapsed: " + (endTime - startTime) + "ms");		
	}
	
	public void run()
	{
		for(int i=this.startNumberOfthread; i<this.startNumberOfthread+10000; i++)
		{
			int numOfDivisors = 0;
			for(int j=1; j<=i; j++)
				if(i%j == 0) numOfDivisors++;
				
			if(numOfDivisors > maxDivisorCount)
			{
				synchronized(this)
				{
					maxDivisorCount = numOfDivisors;
					numWithMaxDivisorCount = i;
				}
			}
		}
	}

}