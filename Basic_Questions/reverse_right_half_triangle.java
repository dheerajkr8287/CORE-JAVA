package Basic_Questions;

import java.util.Scanner;

public class reverse_right_half_triangle {
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the value :");

    int n=sc.nextInt();
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");

        }
        System.out.println(" ");
    }
   }
}
