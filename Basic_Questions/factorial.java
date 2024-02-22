package Basic_Questions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int fact=1;

        // for loop

        // for(int i=1;i<=n;i++){
        //     fact=fact*i;

        // }
        // System.out.println("the factorial is:"+fact);



        //while loop
        int i=1;
        fact=1;
        while (i<=n) {
            fact=fact*i;
            i++;
            
        }
        System.out.println("the factorial is:"+fact);
    }
}
