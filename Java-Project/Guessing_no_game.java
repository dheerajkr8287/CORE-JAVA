import java.util.Random;
import java.util.Scanner;

class guessGame{
    private int anjanValue;
    private int userValue;
    private int noOfCount=0;
//contructor
    public guessGame(){
        Random rand=new Random();
        anjanValue=rand.nextInt(100)+1;
    }
    public void takeUserInput(){ //setter
        System.out.println("enter no. ");
        Scanner sc=new Scanner(System.in);
        userValue=sc.nextInt();
    
    }
    public boolean isCorrectNumber(){
        if(anjanValue==userValue){
             noOfCount++;
             System.out.println("u guessed the correct numoner");
            return true;
        }
        else if(anjanValue>userValue){
            System.out.println("your is smaller");
             noOfCount++;
            return false;
        }
        else{
            System.out.println("your no is greater");
            noOfCount++;
            return false;
        }
    }
 
    
    
}
    
 
public class Guessing_no_game {

    public static void main(String[] args) {
        guessGame harry=new guessGame();


        while(true){
            harry.takeUserInput();
            if( harry.isCorrectNumber()){

                break;

            }
       

        




        }
        

        
    }
}
