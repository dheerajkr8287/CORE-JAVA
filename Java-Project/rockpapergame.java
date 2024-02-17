import java.util.Random;
import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args) {
        //0:rock
        //1:paper
        //2:scissor

        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int computerinput=random.nextInt(3);
        
        System.out.println("enter how many times you want to play:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter 0 for rock, 1 for paper,2 for Scissor");
            int myinput=sc.nextInt();

        if(myinput==computerinput){
            System.out.println("match draw");
           
        }
        else if(computerinput==0 && myinput==1 ||computerinput==1&&myinput==2||computerinput==2&&myinput==0){
            System.out.println("you win");

        }
        else{
            System.out.println("you lose");
        }
    }
        
        
    }
    
}
