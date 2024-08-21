public class methodoverloading{
    static void telljoke(){
        System.out.println("I invented java");
    }

    static void change(int a){
         a=98;
    }
    static void change2(int arr[]){
         arr[0]=98;
    }


    // method overloading
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){//parameter:reference value
        System.out.println("good morning bro"+a);
    }
    static void foo(int a,int b){
        System.out.println("good morning bro"+a);
        System.out.println("good morning bro"+b);
    }

    public static void main(String[] args) {
        // telljoke();

        // case 1:change in interger
        // int x=45;
        // change(x);
        // System.out.println("the value of x after running change is:"+x);

  


        // note:in case of array the referenece is passed .same is the case for object passing to method\

        // case 2: 
        /* int marks[]={52,44,53,66,94};
        change2(marks);
        System.out.println("the value of xafter running change is:"+marks[0]);
 */




//  method overloading :can have same name but different parameter
//method overloading :cannot be performed by changing the return type of method 
        foo();
        foo(5);
        foo(4,8);//argument:actual value 
    }
}