import java.util.*;
public class practiceset4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // problem 1:
    for(int i=0;i<4;i++){
        for(int j=0;j<4-i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }


    /* int n=4;
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");

        }
        System.out.println("");
    } */



    // problem 2:sum of first even number
    /* System.out.println("enter the number:");
    int n=sc.nextInt();
    int i=0;
    int sum=0;
    while(i<n){
        sum=sum+(2*i);
        i++;

    }
    System.out.println("sum is:"+sum); */


    // problem 3:table in reverse order
  /*    System.out.println("enter the number:");
    int n=sc.nextInt();
    for(int i=10;i>=1;i--){
        System.out.println(n+"X"+i+"="+n*i);
    } */


    // factorial using for loop
    /* int num=sc.nextInt();
    // factorial n!=n*(n-1)*(n-2)*-----*1.
    int i,fact=1;
    for(i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println("factorial is:"+fact); */

 
    // problem 9:
    //    System.out.println("enter the number:");
    // int n=sc.nextInt();
    // int sum=0;
    // for(int i=1;i<=10;i++){
    //     System.out.println(n+"X"+i+"="+n*i);
    //     sum=sum+n*i;

    // }
    // System.out.println(sum);





}
    
}