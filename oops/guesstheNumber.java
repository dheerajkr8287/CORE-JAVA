import java.util.*;
import java.util.random.*;
class guessGame{
    private int unknownValue;
    private int noOfGuess=0;
    private int userValue;
    // contructor

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

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the uservalue:");
        userValue=sc.nextInt();
    }

    public boolean isCorrectNumber(){
        if(userValue==unknownValue){
            System.out.println("you guessed the correct value");
            noOfGuess++;
            return true;
        }
        else if(unknownValue>userValue){
            System.out.println("you guess smaller value than unknow value");
            noOfGuess++;
            return false;
        }
        else{
            System.out.println("your value is greater than unknow value");
            noOfGuess++;
            return false;
        }
    }
}

public class guesstheNumber {
    public static void main(String[] args) {
        guessGame dk=new guessGame();
        while(true){
            dk.takeUserInput();
            if(dk.isCorrectNumber()){
                break;

            }
        }
        System.out.println("you can guess the unknownumber in: "+dk.getNumOfGuess()+"moves");
        
    }
}
