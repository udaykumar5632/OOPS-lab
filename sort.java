import  java.util.*;
public class sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println( Arrays.toString(arr));

    }
}