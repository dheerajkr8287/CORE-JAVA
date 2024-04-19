
public class try_catch {
public static void main(String[] args) {
    int a=9000;
    int b=0;
    // without try
    // int c=a/b;
    // System.out.println("The result is:"+c);

    // with try

    try{
        int c=a/b;
        System.out.println("The result is:"+c);
    }
    catch(Exception e){
        System.out.println("we failed to divide  .Reasons :");
        System.out.println(e);
    }
    System.out.println("End of program");

}
    
}