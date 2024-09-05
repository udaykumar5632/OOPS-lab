import java.util.*;
public class minmax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter numbers in array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("minimun element in the array is "+ arr[0]);
        System.out.println("maximum element in the array is "+ arr[4]);
    }
}