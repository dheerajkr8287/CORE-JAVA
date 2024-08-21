
public class varargs {
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b,int c,int d){
    //     return a+b+c+d;
    // }


    // using varargs with same thing 
    static int sum(int x,int ...arr){   //atleast one intergers ir requried 
        // avaliable as int []arr;
        int result=x;
        for(int a :arr){
            result+=a;
        }
        return result;
    }
    
public static void main(String[] args) {
    System.out.println("WELCOME TO VARAGAS TUTURIOLS");
    // System.out.println("the sum of 2 and 3 is :"+sum(2,3));
    // System.out.println("the sum of 4 and 5 and 3 is :"+sum(4,5,3));
    // System.out.println("the sum of 4,4,2,6 is :"+sum(4,4,2,6));


    // using varargs
    System.out.println("the sum of 2 and 3 is :"+sum(2,3));
    System.out.println("the sum of 4 and 5 and 3 is :"+sum(4,5,3));
    System.out.println("the sum of 4,4,2,6 is :"+sum(4,4,2,6));
}
}