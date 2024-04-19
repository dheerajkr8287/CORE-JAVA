//java program that allows to keep accessing an array until a valid index is given by the user.


import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=7;
        marks[1]=935;
        marks[2]=9;
        Scanner sc=new Scanner(System.in);
        boolean right=true;
        while (right) {
            
        
        System.out.println("Enter the value of index:");
        int ind=sc.nextInt();
        try{
            System.out.println("welcome to vedio no 82");
            try{
                System.out.println(marks[ind]);
                right=false;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist ");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in Level 1");

        }
    }
    System.out.println("Thank for using this program");
    }
}
