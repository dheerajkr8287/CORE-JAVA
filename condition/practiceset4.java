import java.util.*;
public class practiceset4{
    public static void main(String[] args){


        // problem 2:
        /* Scanner sc=new Scanner(System.in);
        System.out.println("enter mark1:");
        int marks1=sc.nextInt();
        System.out.println("enter mark2:");

        int marks2=sc.nextInt();
        System.out.println("enter mark3:");

        int marks3=sc.nextInt();

        float avg=marks1+marks2+marks3/3.0f;
        if((avg>40)&&(marks1>33)&&(marks2>33)&&(marks3>33)){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        } */



        //problem 3:
        /* Scanner sc=new Scanner(System.in);
        System.out.println("enter your income in lakh per annum");
        float income=sc.nextFloat();

        float tax=0;
        if(income<2.5){
            tax=tax+0;

        }
        else if(income>2.5f && income<=5f){
            tax=tax+5/100f*(income-2.5f);


        }
        else if(income>5f && income<=10.0f){
            tax=tax+5/100f*(income-2.5f);
            tax=tax+20/100f*(income-5f);


        }
        else if(income>10.f){
            tax=tax+5/100f*(income-2.5f);
            tax=tax+20/100f*(income-5f);
            tax=tax+30/100f*(income-10.0f);
        }
        System.out.println("the total tax paid by employee is:"+tax);
        sc.close(); */



        //problem 4:
        /* int day=3;
        switch (day) {
            case 1:
            System.out.println("Monday");
                
                break;
            case 2:
            System.out.println("Tuesday");  
             break;
            case 3:
            System.out.println("Wednesday"); 
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");  
            break;
            case 6:
            System.out.println("Saturday"); 
            break;
            case 7:
            System.out.println("SUNDAY");
            break;
        
            default:
            System.out.println("invalid input");
                break;
        }

 */

    // problem :leap year program 

/*         Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || year%4==0 &&year%100!=0){
            System.out.println("this is Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        sc.close(); */




    // problem:6
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the url:");
    String url=sc.nextLine();
    switch (url) {
        case ".com":
        System.out.println("Commerical WEBSITE");
            
            break;
        case ".org":
        System.out.println("Organization website");   
        break;
        
        case ".in":
        System.out.println("Indian website");;
        break;

    
        default:
        System.out.println("not in url");
            break;
    }

sc.close();




    }
}