package Generics;
/*

Generics in Java are a powerful feature that allow you to write code that can operate on different types while providing compile-time type safety. They enable you to create classes, interfaces, and methods with type parameters, so you can define a class or method that works with various types, without losing the benefits of type safety.


1. Generic Classes
A generic class is a class that can operate on different types of data. You define a generic class by specifying a type parameter in angle brackets <T>
 */
class Dog<E,V>{
    E id;
    V name;
    public Dog(E id,V name){
        this.id=id;
        this.name=name;
    }

    E getId(){
        return id;
    }
}

public class GenericClass {
    public static void main(String[] args) {

        Dog<String,String > d1=new Dog<>("asd123","Leo");
        Dog<String,Integer> d2=new Dog<>("her23",123);
        Dog<Integer,String > d3=new Dog<>(12,"leo");
        System.out.println(d3.getId());

    }

}
