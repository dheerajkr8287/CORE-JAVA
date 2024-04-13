import java.util.Scanner;
// fabonacii series is a sum of previous two number
public class fabonacii {
    public static void fabonaciiSeries(int max ){
        int a=0;
        int b=1;
        int c=0;
        while(c<=max){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter max value:");
        int num=sc.nextInt();
        fabonaciiSeries(num);
    }
}
