package Basic_Questions;

import java.util.Scanner;

public class reverse_table {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
