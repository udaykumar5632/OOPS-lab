package Week1;

import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
        int temp=n;
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=rem+rev*10;
            n/=10;
        }
        if(rev==temp){
            System.out.println("Given number "+ temp+ "is Palinndrome");
        }
        else{
           System.out.println("Given number "+ temp+ "is not a Palinndrome");
        }
    }
}