import java.util.Scanner;

import javax.crypto.ExemptionMechanism;

public class handling_specfic_exception {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=8;
        marks[1]=56;
        marks[2]=6;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array index:");
        int ind=sc.nextInt();


        System.out.println("Enter the number you want divide  value with:");
        int number=sc.nextInt();

        try{
            System.out.println("The value at array index entered is:"+marks[ind]);
            System.out.println("The value of array-value/number is:"+marks[ind]/number);

        }
        catch(ArithmeticException e){
            System.out.println("ArithmaticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurd!");
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println("Some other Exception occured:");
            System.out.println(e);
        }



    }
}
