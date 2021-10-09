import java.util.*;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int x=0; x<=n-1; x++){
                int hasilKali = 0;
                for (int y=0; y<=x; y++) {
                    int hasilPangkat = (int) Math.pow(2, y);
                    hasilKali += hasilPangkat * b;
                }
                int result = a + hasilKali;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        in.close();
    }

}

/* 
7. Java Loops II

We use the integers a, b, and n to create the following series:

You are given
queries in the form of , , and . For each query, print the series corresponding to the given , , and values as a single line of

space-separated integers.

Input Format

The first line contains an integer,
, denoting the number of queries.
Each line of the subsequent lines contains three space-separated integers describing the respective , , and

values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of

space-separated integers.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation

We have two queries:

    We use 

, , and to produce some series

:

... and so on.

Once we hit

, we print the first ten terms as a single line of space-separated integers.

We use
, , and to produce some series

:

We then print each element of our series as a single line of space-separated values.
 */