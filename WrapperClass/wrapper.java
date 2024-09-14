package WrapperClass;
/*
Wrapper Classes
Java provides wrapper classes to encapsulate primitive types in objects. This allows primitives to be used in contexts that require objects, such as in collections (e.g., ArrayList).
 */

/*
 wrapper classes for each primitive type:

byte → Byte
short → Short
int → Integer
long → Long
float → Float
double → Double
char → Character
boolean → Boolean
 */
public class wrapper {
    private static void fun(Integer a){
        a=2;
    }
    public static void main(String[] args) {
//        int a=1;
//        //Integer b=Integer.valueOf(1); //this is wrap automatic
//        Integer b=1; //autoboxing:primitve data types convert into object of their corresponding wrapper class
//        ex:int to Integer,long to Long
//
//        //int c=b.intValue();//there is no need of boxing
//        int c=b;//unboxing:object convert into primitive data type
//          ex:Integer to int,Long to long
//
//        System.out.println(Integer.max(1,2));
//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.min(2,3));
//        String str="233";
//        Integer i=Integer.valueOf("123");
//        System.out.println(i);

        Integer b=1;
        fun(b);
        System.out.println(b);
    }
}
