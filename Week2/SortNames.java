    import java.util.Scanner;
    import java.util.Arrays;
    //use can use import java.util.*;
    public class SortNames {
        SortNames(String[] names) {
            Arrays.sort(names);
            System.out.println("Sorted names are : "+Arrays.toString(names));
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no of names");
            int n=sc.nextInt();
            String[] names=new String[n];
            System.out.println("enter all names either starting letter in capital  or small");
            for(int i=0;i<n;i++){
                System.out.println("enter name"+ (i+1) );
                names[i]=sc.next();
            }
            new SortNames(names);
            sc.close();
        }
    }
