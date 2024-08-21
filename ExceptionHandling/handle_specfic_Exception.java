import java.util.Scanner;

public class handle_specfic_Exception {
    public static void main(String[] args) throws ArithmeticException {
        int [] marks =new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("enter the number you want to divide the value with");
        int number=sc.nextInt();

        try{
            System.out.println("the value at array index enter is"+marks[ind]);
            System.out.println("the value of array-value/number is:"+marks[ind]/number);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println("something other exception occured");
            System.out.println(e);
        }

        System.out.println("END");
    }
}
