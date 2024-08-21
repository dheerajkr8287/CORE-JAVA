abstract class parent{
    public parent(){
        System.out.println("mai parent ka constructor hu");
    }

    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();//abstract method :A method that is declared without implementation
    // An abstract method can only be used inside an abstract class.

    abstract public void greet1();
}
//An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

// subclass mai ya toh abstract method ko override kar do ya toh subclass ke aage abstract lga lo.

// abstract class ka object do not instantiated(create).
class child2 extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet1(){
        System.out.println("good afternoon");
    }

}

 abstract class child3 extends parent{
    public void th(){
        System.out.println("i am good");
    }
}


public class abstractmethod_and_class {
    public static void main(String[] args) {
        //parent p=new parent();   //error
        child2 c2=new child2();
        // child3 c3=new child3();//error
    }
}
