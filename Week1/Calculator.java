package Week1;

import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a, b : ");
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("a="+ a + "\t" +"b="+ b);
        System.out.println("Enter 1(addition), 2(subtraction), 3(multiplication),4(division)");
        int operation=scan.nextInt();
        switch(operation) {
            case 1 -> System.out.println("Addition" + "\t" + a+b);
            case 2 -> System.out.println("Subtraction" + "\t"  + (a-b));
            case 3 -> System.out.println("Multiplication"+ "\t"  + a*b);
            case 4 -> System.out.println("Division" + "\t" + a/b);
            default -> System.out.println("enter valid number");
        }


    }

}