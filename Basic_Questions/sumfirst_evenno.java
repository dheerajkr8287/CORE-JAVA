package Basic_Questions;

import java.util.Scanner;

/**
 * sumfirst_evenno
 */
public class sumfirst_evenno {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            sum=sum+i;
            }
            

        }
        System.out.println(sum);
    }
}