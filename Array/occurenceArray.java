import java.util.Scanner;

public class occurenceArray {

    public static int Occur(int numArray[],int nums){
        int i=0;
        int count=0;
        while (i<numArray.length) {
            if(nums==numArray[i]){
                count=count+1;
            }
            i++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numArray[]=ArrayUtillity.inputArray();
        System.out.println("enter the number you want to check:");
        int nums=sc.nextInt();
        int Occur=Occur(numArray, nums);
       
        System.out.println("number of occurence of given no is:"+Occur);




    }
}
