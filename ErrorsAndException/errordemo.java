import java.util.Scanner;

public class errordemo {
public static void main(String[] args) {
    // syntax error
    // int a=0  //error:no semicolon
    // b=3;     //error:b not declared





    // logical error
    // Write a program to print all prime numbers between 1 to 10
    System.out.println(2);
    for (int i=1; i<5; i++){
        System.out.println(2*i+1);
    }



    // runtime error
    int k;
    Scanner sc =new Scanner(System.in);
    k=sc.nextInt();
    System.out.println("Interger part of 1000 divided by k is "+1000/k);
}
    
}