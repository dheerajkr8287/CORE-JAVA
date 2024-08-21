
//Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
@FunctionalInterface
interface  DemoAno{
    void meth1(int a);
//    void meth2();

}

//class HarryFun implements  DemoAno{
//    public void meth1(){
//        System.out.println("this is mrth1");
//    }
//}

//class  AnonyDemo implements  DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("this is method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("this is meth2");
//
//    }
//}
public class lamda_Expression {
    public static void main(String[] args) {
//      DemoAno obj=new AnonyDemo();
//      obj.meth1();

        //Anonymous class


//        DemoAno obj=new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("this is meth1");
//            }
//
////            @Override
////            public void meth2() {
////                System.out.println("this is meth2");
////            }
//        };
//        obj.meth1();



        // LAMDA EXPRESSION:In Java, lambda expressions are a way to provide clear and concise syntax for writing anonymous methods (implementations of functional interfaces). They were introduced in Java 8 to facilitate functional programming and to make code more readable and expressive.
        //A lambda expression consists of:

        //Parameters: Enclosed in parentheses. For example, (a, b) for two parameters.
        //Arrow Token: -> separates the parameters from the body.
        //Body: The logic of the lambda, which can be a single expression or a block of statements.

         //    syntax:(parameters) -> {
        //     //multiple statements
        //     };

//        DemoAno obj=new HarryFun();
//        obj.meth1();


        DemoAno obj=(a)->{
            System.out.println("this is meth1:"+a);
        };
        obj.meth1(6);



    }
}
