import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        // shortland operator
        // int a = 5;
        // Scanner sc = new Scanner(System.in);
        // int x1 = sc.nextInt();
        // // a = a + x1;
        // a+=x1;//shorthand operator
        // System.out.println(a);
        // int x2 = sc.nextInt();
        // a = a + x2;
        // System.out.println(a);
        // int x3 = sc.nextInt();
        // a = a + x3;
        // System.out.println(a);
        // int x4 = sc.nextInt();
        // a = a + x4;
        // System.out.println(a);


        //uniary operator
        

        //pre increment 

        // int p=5;
        // // p++;//first print value of p then increase p value by1
        // System.out.println(p++);
        // System.out.println(p);
        // // ++p;//first increase the value of p then print the value of p
        // System.out.println(++p);
        // System.out.println(p);

        //relational operator 

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to driving liciense portal");
        System.out.println("my age is :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are 18+.you can apply");
        }
        else{
            System.out.println("you are not 18+.so not apply this ");
        }




        
        
        
        

    }
}
