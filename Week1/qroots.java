import java.util.*;

public class qroots{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("coefficients 'a' ,'b' , 'c'");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        float det=(float)Math.pow(b, 2)-4*a*c;
        float root1;
        float root2;
        if(det==0){
             root1=-1*(float)(b/2*a);
            System.out.println("Roots are equal "+ root1);
        }
        else if(det>0){
            root1=(-b+det)/2*a;
            root2=(-b-det)/2*a;
            
            System.out.println("Real Root-1 = "+ root1);
            System.out.println("Real Root-2 = "+ root2);
        }
        else {
            root1=(-b)+(det/2*a);
            root2=(-b)-(det/2*a);
            System.out.println("Imaginary Root-1 = "+ root1 + "i");
            System.out.println("Imaginary Root-2 = "+ root2 + "i");

        }

    }
}