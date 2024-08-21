

import java.util.ArrayList;
class MyGeneric<T1,T2>{ //class ko suply karte hai aur classes  OR we are passing classes to already defined class
    int val;
    private T1 t1;
    private  T2 t2;


    public MyGeneric(int val,T1 t1,T2 t2){
          this.val=val;
          this.t1=t1;
          this.t2=t2;


    }


        public void setVal( int val){
            this.val=val;

        }
        public int getVal(){
            return val;

        }
        public void setT1(T1 t1){
            this.t1=t1;
        }
        public T1 getT1(){
            return t1;
        }

    public void setT2(T2 t2){
        this.t2=t2;
    }
    public T2 getT2(){
        return t2;
    }

}
public class generics {
    public static void main(String[] args) {
//In the above code, notice that we can store any type of object in a collection without Generics. But, this is not the case with the Generics. It allows us to store only one type of object. Take a look at the example given below :
//        ArrayList arrayList1=new ArrayList();--error

        ArrayList<Integer> arrayList=new ArrayList<>();
//        The same code produces the Incompatible type error because we can only store the integer object type.
//        arrayList.add("Str");
          arrayList.add(54);
          arrayList.add(643);
//          arrayList.add(new Scanner(System.in));
  //      Let's suppose you created an ArrayList(without using Generics), and you want to store the value at index 0 into an integer variable named "x." Are you allowed to do this in Java? The answer is a big NO! This is because the ArrayList returns an object, but we're storing the value in an integer variable. In such cases, we need to type-cast the object into our desired data type. But, if we use Generics, then there is no need to typecast. Take a look at the below example to get a better understanding :

//        int a = (int)arrayList.get(0);//The above code produces an error because we've not typecasted the object into the integer type. Now, let's typecast and see the results :

        int a = arrayList.get(0);//Now, let's see how we can get the desired results with the help of the Generics :

//
        System.out.println(a);

//        generic class
        MyGeneric<String,Integer> g1=new MyGeneric<>(22,"MyString is string",33);
        String Str=g1.getT1();
        Integer int1=g1.getT2();
        System.out.println(Str+int1);



    }

}
//type parameter :in java generics cannot be a primitive data type