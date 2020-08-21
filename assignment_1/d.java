import java.util.Scanner;
public class d{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter first string (lowercase letters only): ");
        String p = a.nextLine();
        System.out.print("Enter second string (lowercase letters only): ");
        String q = a.nextLine();
        int m = p.length(), n = q.length();
        int[] dp = new int[26] , dq = new int[26];

        for(int i=0; i<m; i++)
        {
            dp[p.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++)
        {
            dq[q.charAt(i)-'a']++;
        }
        boolean ans = true;
        for(int i=0;i<26;i++)
        {
            if(dp[i]!=dq[i])
            {
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("strings are anagrams");
        }
        else{
            System.out.println("strings are not anagrams");
        }
    }
}