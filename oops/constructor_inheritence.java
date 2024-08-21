class base{
    base(){
        System.out.println("i am a contructor");
    }
    base(int x){
        System.out.println("i am an overloaded contructor");
    }
}


class derived extends base{
    derived(){
        System.out.println("i am a derived class contructor");
    }
    derived(int x,int y){
        super(x);
        System.out.println("i am an overloaded contructor of derived with value of:"+y);
    }
}

class childderived extends derived{
    childderived(){
        System.out.println(" i am childderived class constructor");
    }
    childderived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of childderived ");
    }
}

public class constructor_inheritence {
    public static void main(String[] args) {
        // base b=new base(4);
        // derived d=new derived();
        // derived d1=new derived(4,5);

        // childderived cd=new childderived();
        childderived cd1=new childderived(1,3,4);

    }
}
