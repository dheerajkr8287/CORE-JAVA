import java.util.*;

public class rockpaperscisor {
    public static void main(String[] args) {
        //Rock =0;
        // paper=1;
        //scissors=2;
        Scanner sc=new Scanner(System.in);
        Random rand =new Random();
        //generate a random number b/w 0 to 2 
        
        System.out.println("enter the how many times you want to play:");
        int n=sc.nextInt();
        int computerWin=0;
        int userWin=0;
        for(int i=0;i<n;i++){
            // Generate a new random choice for the computer each round

            int computerChoice=rand.nextInt(3) ;


            // here I use of enhanced switch

            String computerChoiceStr=switch(computerChoice){
                case 0->"rock";
                case 1->"paper";
                case 2->"scissor";
                default->"unknow";
               

            };
            System.out.println("computer choose:"+computerChoiceStr);
            System.out.println("Enter 0 for rock,1 for paper,2 for scissor");
            int myInput=sc.nextInt();
            


            if(myInput==computerChoice){
                System.out.println("Match Draw");
            }
            else if(myInput==0&&computerChoice==2||myInput==1&&computerChoice==0||myInput==2&&computerChoice==1){
                System.out.println("user win");
                userWin++;

            }
            else if(myInput==0&&computerChoice==1||myInput==1&&computerChoice==2||myInput==2&&computerChoice==0){
                System.out.println("computer win");
                computerWin++;
            }
            else{
                System.out.println("invalid input");
            }
        }
        if(computerWin>userWin){
            System.out.println("hence ,computer win the game");
        }
        else if(computerWin==userWin){
            System.out.println("the match draw");
        }
        else{
            System.out.println("you wins the final game");
        }

            
sc.close();

    }
}    
