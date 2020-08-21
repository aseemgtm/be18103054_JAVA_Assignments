import java.util.Scanner;

public class a{
    public static void main(String[] args){

        Scanner o = new Scanner(System.in);
        System.out.print("Enter string(lowercase letters only): ");
        String str = o.nextLine();
        System.out.print("Enter substring(lowercase letters only): ");
        String s = o.nextLine();
        int m = str.length(), n = s.length();
        if(m<n){
            System.out.print(0);
            return;
        }
        int[] ds = new int[26] , dsub = new int[26];
        for(int i=0; i<n; i++){
            dsub[s.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++){
            ds[str.charAt(i)-'a']++;
        }

        int f = 0;
        int a = 0;
        for(int i=0;i<26;i++){
            if(dsub[i]!=ds[i]){
                f++;
            }
        }
        if(f==0){
            a++;
        }
        int index = 0;

        for(int i=n;i<m;i++){
            index = str.charAt(i-n)-'a';
            if(dsub[index]==ds[index]){
                f++;
            }
            else if((dsub[index]+1)==ds[index]){
                f--;
            }
            ds[index]--;
            index = str.charAt(i)-'a';
            if(dsub[i]==ds[i]){
                f++;
            }
            else if(dsub[index]-1==ds[index]){
                f--;
            }
            ds[index]++;
            if(f==0){
                a++;
            }
        }
        System.out.print("Answer: ");
        System.out.print(a);
    }
}