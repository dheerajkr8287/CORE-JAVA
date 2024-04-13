import java.util.Scanner;

public class reversehalftriangle {
    public static void starpattern(int n){
        int i=n;
        while(i>0){
            System.out.print("*");
            int j=1;
            while (j<i) {
                System.out.print(" *");
                j++;
                
            }
            i--;
 
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of number:");
        int n=sc.nextInt();
        starpattern(n);
    }
}
