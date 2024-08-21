package folder.folderl1.folderl2;


class calculator{
    public void calculate(int a,int b){
        System.out.println("your result:"+a+b);
    }
}

class saCalculator{
    public void calculate(int a,int b){
        System.out.println("your result:"+ Math.sin(a+b));
    }
}
class hyCalculator{
    public void calculate(int a,int b){
        System.out.println("your result:"+a+b);

        System.out.println("your result:"+ Math.sin(a+b));
    }
}


public class problem2 {
    protected int proInt=5;
    int defInt=55;
    public static void main(String[] args) {
        System.out.println("i am main method");
        }
    
}
