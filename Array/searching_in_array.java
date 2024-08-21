import java.util.Scanner;



public class searching_in_array {
    public static int isFound(int arr[],int num){
        int i=0;
        while (i<arr.length) {
            if(arr[i]==num){
                System.out.println("Number is found at "+ i+ " index: "+arr[i]);
            }
            i++;
        }
        return 0;

    }
    public static boolean isTrue(int arr[],int num){
        int i=0;
        while (i<arr.length) {
            if(arr[i]==num){
             return true;
            }
            i++;
        }

        return false;

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int []arr={3,2,4,5,6,7,88,9,44,22};
        System.out.println("Welcome to Array searching \n");
        System.out.println("Enter the number you want to search:");
        int num=sc.nextInt();

        //Method 1
        // isFound(arr, num);



        // method2
        boolean isTrue=isTrue(arr, num);
        if(isTrue){
            System.out.println("your number was found in array");
        }
        else{
            System.out.println("your number is not found in array");
        }


    }
}
