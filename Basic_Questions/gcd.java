import java.util.Scanner;

public class gcd {
    public static int gcdFind(int firstNum,int secondNum){
        int gcd=1;
        int i=2;
        int leastNum=least(firstNum,secondNum);
        while (i<=leastNum) {
            if(firstNum%i==0 && secondNum%i==0){
                gcd=i;
            }
            i++;
            
        }

        return gcd;
    }
    public static int least( int firstNum, int secondNum){
        if(firstNum<secondNum){
            return firstNum;
        }
        else{
            return secondNum;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no:");
        int firstNum=sc.nextInt();
        System.out.println("enter second no:");
        int secondNum=sc.nextInt();
        System.out.print("your gcd is:");
        System.out.println(gcdFind(firstNum, secondNum));


    }
}
