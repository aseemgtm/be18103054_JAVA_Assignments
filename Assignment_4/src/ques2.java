public class ques2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
        byte b = (byte)a;
        char c = (char)b;
        int d = c;
        System.out.println("Initial integer: "+ a);
        System.out.println("Byte: "+ b);
        System.out.println("Character: "+ c);
        System.out.println("Final integer: "+ d);
        if (a != d)
        {
        	System.out.println("not equal");
        }
        else
        	System.out.println("equal");
	}
}