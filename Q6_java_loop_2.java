//Task You are given q queries in the form of a, b, and n For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

//Input Format
//The first line contains an integer, q denoting the number of queries. 
//Each line i of the q subsequent lines contains three space-separated integers describing the respective a-th b-th and n-th values for that query.
//Constraints
// 0<= q <= 500
// 0<= a,b <= 50
// 1<= n <= 15

//Output Format
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

//Sample Input
//
//2
//0 2 10
//5 3 5

//for my convenienet I have written name as public class Q1,2,3.... but in actual hacker rank you will have to write it as public class Solution

import java.util.*;
import java.io.*;
import java.lang.Math.*;
//public class Solution {

class Solution{
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
