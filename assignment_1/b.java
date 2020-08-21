import java.util.Scanner;

public class b{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("paragraph(only letters): ");
        String p = obj.nextLine();
        String[] pw = p.split("\\s+");

        System.out.print("number of words: ");
        int l = obj.nextInt();
        String [] words = new String[l];

        System.out.print("words (line separated): ");
        Scanner obj1 = new Scanner(System.in);
        for(int i=0; i<l; i++){
            words[i] = obj1.nextLine();
        }

        for(int i=0; i<pw.length; i++){
            for(int j=0; j<l; j++){
                if(pw[i].equals(words[j])){
                    int temp = pw[i].length();
                    String temp1;
                     temp1 = String.valueOf(pw[i].charAt(0));
                    for(int k=0; k<temp-1; k++){
                        temp1 += '*';
                    }
                    pw[i] = temp1;
                }
            }
        }

        System.out.println("Modified paragraph: ");
        for(int i=0; i<pw.length; i++){
            System.out.print(pw[i]);
            System.out.print(" ");
        }
    }
}