import java.util.Scanner;

public class ArrayUtillity {
  public static int[] inputArray(){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the number of elements ");
    int size =sc.nextInt();
    int [] nums=new int[size];
    int i=0;
    while (i<size) {
        System.out.println("please enter element no"+(i+1)+":");
        nums[i]=sc.nextInt();
        i++;
        
    }
    return nums;
  }
  public static void displayArray(int [] numArray){
    int i=0;
    while (i<numArray.length){ 
    System.out.print(numArray[i]+" ");
    i++;
  }
  System.out.println();
}
}
