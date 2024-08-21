import java.util.*;
public class practiceset6 {
    public static void main(String[] args) {


        // sum of array 
        /* float arr[]={22f,33.4f,55.2f,88.9f,342.3f};
        float sum=0;
        for(float element :arr){
            System.out.println(element);
            sum=sum+element;

        }
        System.out.println("sum is:"+sum); */




        // searching  

        /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("enter the elemnt you want:");
        int searchElement=sc.nextInt();

        int []arr=new int[size];
        System.out.println("Enter " + size + " elements:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //displaying elements

        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println("");

        //  searching elemnts
        boolean found=false;
        for(int i=0;i<size;i++){
            if(arr[i]==searchElement){
                System.out.println("elemnt"+searchElement+"found at index"+i);
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println("element"+searchElement+"not found in array");
        }

 */


        // problem 3:addtion of two matrix

        /* int [][]mat1={{1,2,3},{4,5,6}};
        int [][]mat2={{6,5,4},{3,2,1}};
        int result[][]={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){//row no of times
            for(int j=0;j<mat1[i].length;j++){//coloumn no of times
                System.out.format("setting value for i=%d and j=%d: %d\n",i,j,mat1[i][j]);
                result[i][j]=mat1[i][j]+mat2[i][j];
                
        

            }
            System.out.println(" ");
        }

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }

 */



//  reverse of array
     
    /*  int []arr={1,2,4,5,6};
     for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
     } */





//maximum element in array  
      /*   int []arr={1,2,44,54,6};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
              max=arr[i];
            }
        }
        System.out.println(max);
 */

//minimum element in array  
        /* int []arr={1,2,44,54,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
              min=arr[i];
            }
        }
        System.out.println(min);   */ 



//an array is sorted or not

int []arr={1,2,4,5,6};
     boolean sorted=true;
      for(int i = 0; i < arr.length - 1; i++){
        
            if(arr[i]>arr[i+1]){
                sorted=false;
                System.out.println("not sorted");
                break;
            }
        
    }
    if(sorted){
        System.out.println("sorted array");
    }
    System.out.println("end");


        
    }
}
