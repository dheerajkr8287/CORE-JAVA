import java.util.Scanner;

public class cbse_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total_marks=600;
        System.out.println("Enter your input marks:");
        System.out.println("enter hindi marks:");
        float sub1=sc.nextFloat();
        System.out.println("enter math marks:");

        float sub2=sc.nextFloat();
        System.out.println("enter science marks:");

        float sub3=sc.nextFloat();
        System.out.println("enter sst marks:");

        float sub4=sc.nextFloat();
        System.out.println("enter english marks:");

        float sub5=sc.nextFloat();
        System.out.println("enter IT marks:");

        float sub6=sc.nextFloat();
        if((sub1<=100)&&(sub2<=100)&&(sub3<=100)&&(sub4<=100)&&(sub5<100)){

            double Score_marks=sub1+sub2+sub3+sub4+sub5;
            double percentage=(Score_marks/500)*100;
            System.out.println(percentage);
        }
        else {
            System.out.println("invalid input marks");
        }


    }
}
