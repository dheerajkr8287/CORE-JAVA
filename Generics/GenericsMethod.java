package Generics;
/*
2. Generic Methods
You can also define methods with type parameters. This allows the method to operate on different types of data.
public <T> void genericMethod(T data){...}

 */

class CustomClass{

}
public class GenericsMethod {
    /*
    Bounded generic type:
    In case of bounded type,we use the extends keyword
    here,genericclass is created with bounded type .this means genericclass
    can only work with data type that children of Number(Interger,double,and so on
     */
    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
    static  <E> void printData(E data){

        System.out.println(data);
    }




    public static void main(String[] args) {
        printData("hello");
        printData(123);
        GenericsMethod obj=new GenericsMethod();
//        obj.doubleData("abd");//hmm isee nhi acess kar sakte h because of bounded generics

        obj.doubleData(123);
        CustomClass custom=new CustomClass();
//        obj.doubleData(custom);

    }
}
