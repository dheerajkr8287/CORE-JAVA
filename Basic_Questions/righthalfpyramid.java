import java.util.Scanner;

public class righthalfpyramid {
    public static void starpattern(int n){
        int i=0;
        while(i<n){
            System.out.print("*");
            int j=0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println(" ");
            i++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of number:");
        int n=sc.nextInt();
        starpattern(n);
    }
}
