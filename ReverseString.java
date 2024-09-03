import java.util.*;
public class ReverseString{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println(reverse(word));
    }
    public static char[] reverse(String temp){
        int i = 0;
        int j = temp.length()-1;
        char[] ans = temp.toCharArray();
        while(i<=j){
            ans[i] = temp.charAt(j);
            ans[j] = temp.charAt(i);
            i++;
            j--;
        }
        return ans; 
    }
}