public class try_catch {
    public static void main(String[] args) {
        int a=4000;
        int b=0;
        // without try

        // int c=a/b;
        // System.out.println("the result is :"+c);


          // with try

        try{
            int c=a/b;
            System.out.println("the result is :"+c);
        }
        catch(Exception e){             //hmm e ke jagah kuch bhi use kar sakte h
            
            System.out.println(e);
        }

        System.out.println("end of the program");
    }
    
}
