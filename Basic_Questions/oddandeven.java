package Basic_Questions;

import java.util.Scanner;

public class oddandeven {
    public static void main(String[] args) {
        
//for Even number : 2*i
//for Odd number : 2*i+1

Scanner sc =new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
    System.out.println(2*i+1);
    
}
    }
}
