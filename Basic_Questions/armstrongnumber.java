import java.util.Scanner;

public class armstrongnumber {
    //armstrong number=153( no of digit =power of thst time)then 1^3+5^3+3^3 is equal to 153 original number
    public static void armFind(int num){
        int z=num;
        int count=0;
        int digit,sum=0;
        while(z>0){
            count=count+1;
            z=z/10;
        }
        System.out.println("number of digit counting:"+count);
        z=num;
        while (z>0) {
            digit=z%10;
            sum += Math.pow(digit, count);
            z = z / 10;
        }
           
            if(sum==num){
                System.out.println("armstrong number");
            }else{
                System.out.println("not armstrong");
            }
            

            
        }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        armFind(num);


    }
}
