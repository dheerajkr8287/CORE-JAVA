import java.util.Random;
import java.util.Scanner;

class guessGame{
    private int unknownValue;
    private int userValue;
    private int noOfGuess=0;
//contructor
    public guessGame(){
        Random rand=new Random();
        unknownValue=rand.nextInt(100)+1;
    }
    // setter
    public void setNumOfGuess(int n){
        this.noOfGuess=n;

    }
    // getter
    public int getNumOfGuess(){
        return noOfGuess;
    }
    public void takeUserInput(){ //setter
        System.out.println("enter no. ");
        Scanner sc=new Scanner(System.in);
        userValue=sc.nextInt();
    
    }
    public boolean isCorrectNumber(){
        if(unknownValue==userValue){
             noOfGuess++;
             System.out.println("u guessed the correct numoner");
            return true;
        }
        else if(unknownValue>userValue){
            System.out.println("your is smaller");
             noOfGuess++;
            return false;
        }
        else{
            System.out.println("your no is greater");
            noOfGuess++;
            return false;
        }
    }
 
    
    
}
    
 
public class Guessing_no_game {

    public static void main(String[] args) {
        guessGame Dk=new guessGame();


        while(true){
            Dk.takeUserInput();
            if( Dk.isCorrectNumber()){

                break;

            }
       

        




        }
        System.out.println("You can guess  "+harry.getNumOfGuess()+"  times");
        

        
    }
}
