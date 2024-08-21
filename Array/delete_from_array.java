import java.util.Scanner;

public class delete_from_array {
    public static int[] delete(int numArr[],int numToDelete){
        int occ=occurenceArray.Occur(numArr,numToDelete );
        if(occ==0){
            return numArr;
        }
        int newSize=numArr.length-occ;
        int [] newArr=new int[newSize];
        int i=0, j=0;
        while (i<numArr.length) {
            if(numArr[i]!=numToDelete ){
                newArr[j]=numArr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to array deletion");
        int[] numArr=ArrayUtillity.inputArray();
        System.out.println("enter the number you want to delete");
        int numToDelete=sc.nextInt();

        int newArr[]=delete(numArr,numToDelete);
        System.out.println("here is your new Array");
        ArrayUtillity.displayArray(newArr);
        
        


    }
}
