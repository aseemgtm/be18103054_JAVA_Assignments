public class q1 extends Thread {

    public static void main(String[] args) {
        q1 thread = new q1();
        thread.start(); // start thread

    }

    public void run() {
    	System.out.println("Thread is running. Started the count...");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i); // print number
            if (i % 10 == 0) {
                System.out.println(i + " numbers counted!"); // print string after 10 numbers
            }
            try {
                Thread.sleep(1000); // put thread to sleep for 1 sec
            } catch (InterruptedException e) {
                System.out.println("Unable to put thread to sleep!");
            }
        }

    }
}