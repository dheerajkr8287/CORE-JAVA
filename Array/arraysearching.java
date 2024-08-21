import java.util.Scanner;

public class arraysearching {
    public static boolean isAvailable(int []arr,int num){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
              return true;  

            }
            index++;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={44,554,68,66,798,448,222};
        System.out.println("enter the number you want to searching:");
        int num=sc.nextInt();
        boolean isFound=isAvailable(arr, num);
        if(isFound){
            System.out.println("your number is found in array");
        }
        else{
            System.out.println("your number is not found in array");
        }



    }
}
