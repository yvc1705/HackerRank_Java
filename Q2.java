/*Given an integer, , perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/

//for my convenienet I have written name as public class Q1,2,3.... but in actual hacker rank you will have to write it as public class Solution
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//public class Solution {
public class Q2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        if (N%2 == 1)
        {
            System.out.println("Weird");
        }
        
        else 
        {
            if (N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }    
            if (N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            if (N>20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}