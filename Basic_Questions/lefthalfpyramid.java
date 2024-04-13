import java.util.Scanner;

public class lefthalfpyramid {
    public static void starpattern(int n){
        
        int i=1;
        //outer loop
        while(i<=n){
            
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
                
            }
            j=1;// Reset j for printing stars
            while (j<=i) {
                System.out.print("*");
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
