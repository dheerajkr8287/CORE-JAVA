import java.util.Scanner;

public class no_of_occurence_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to array occurence");
        int numArray[]=ArrayUtility.inputArray();
        System.out.println("enter the number you want to find");
        int num=sc.nextInt();
        int occurence=noOfOccurences(numArray, num);
        System.out.println("your elements was found "+occurence+"time in array");


    }
    public static int noOfOccurences(int []numArray,int num){
        return 0;
    }
    
}