import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        // int num=0; //initialization
        // while(num<=10){    //condtion
        //     System.out.println(num);  //actual work
        //     num++; //updation the condtion
        //     //num=num+1; 
        // }


        //reverse the number 20 to 10

    /* int n=20;
    while(n>=10){
        System.out.println(n);
        n--;
    } */


    // print table 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int i=1;
    while(i<=10){
        System.out.println(n+"X"+i+"="+n*i);
        i++;
    }


}
}
