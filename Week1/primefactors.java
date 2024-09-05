import java.util.*;

public class primefactors{
    public static boolean IsPrime(int x){
        for(int i=2 ;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=scan.nextInt();
        if(n<2){
            System.out.println("enter number greater than 2");
        }
        for(int i=2;i<=n;i++){
            if(n%i==0 && IsPrime(i)){
                System.out.print("prime factors are"+i + "\t");
            }
        }
    }
}