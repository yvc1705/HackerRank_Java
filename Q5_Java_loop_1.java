//Task 
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer N
//
//Constraints
//  N >= 2 AND N <=20

//Sample Input
//
//2

//Sample Output
//
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20
//for my convenienet I have written name as public class Q1,2,3.... but in actual hacker rank you will have to write it as public class Solution

import java.util.*;
import java.io.*;
import java.lang.Math.*;

//public class Solution {
class Q6_Java_loop_2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                a+=(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
