import java.util.Scanner;

public class JavaAnagrams {

    static int NO_OF_CHARS = 256;
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] str1 = a.toLowerCase().toCharArray();
        char[] str2 = b.toLowerCase().toCharArray();
        
        // Create a count array and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        
        // If both strings are of different
        // length. Removing this condition
        // will make the program fail for
        // strings like "aaca" and "aca"
        if(str1.length != str2.length){
            return false;
        }
        
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for(int i = 0; i < str1.length; i++){
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }
        
        // See if there is any non-zero
        // value in count array
        for(int i = 0; i < NO_OF_CHARS; i++){
            if (count[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/* 
16. Java Anagrams
https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

Two strings, and

, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

    string a: the first string
    string b: the second string

Returns

    boolean: If 

and

    are case-insensitive anagrams, return true. Otherwise, return false.

Input Format

The first line contains a string
.
The second line contains a string

.

Constraints

Strings and

    consist of English alphabetic characters.
    The comparison should NOT be case sensitive.

Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Explanation 0
Character 	Frequency: anagram 	Frequency: margana
A or a 	3 	3
G or g 	1 	1
N or n 	1 	1
M or m 	1 	1
R or r 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams

Explanation 1
Character 	Frequency: anagramm 	Frequency: marganaa
A or a 	3 	4
G or g 	1 	1
N or n 	1 	1
M or m 	2 	1
R or r 	1 	1

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello

Sample Output 2

Anagrams

Explanation 2
Character 	Frequency: Hello 	Frequency: hello
E or e 	1 	1
H or h 	1 	1
L or l 	2 	2
O or o 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/