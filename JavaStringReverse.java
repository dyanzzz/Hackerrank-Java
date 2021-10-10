import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String strLower = A.toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        
        String result = "";

        for (int i=strLower.length()-1; i>=0; i--){
            char str = strLower.charAt(i);
            result = result + str;
        }

        if (strLower.equals(result)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

/* 
15. Java String Reverse
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string

, print Yes if it is a palindrome, print No otherwise.

Constraints

will consist at most

    lower case english letters.

Sample Input

madam

Sample Output

Yes
 */