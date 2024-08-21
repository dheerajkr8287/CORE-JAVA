//abstract class and interface 

abstract class pen{
    abstract public void write();
    abstract public void refill();
    public void greet(){
        System.out.println("hello");
    }
}

class fountainPen extends pen{
    public void write(){
        System.out.println("Writing...");
    }

    public void refill(){
        System.out.println("Black refil");
    }

    public void changeNib(){
        System.out.println("change the nib black to blue");
    }
    
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("bite...");
    }
}

class human extends monkey implements BasicAnimal{
    @Override
     public void eat(){
        System.out.println("eating...");
     }
     @Override
     public void sleep(){
        System.out.println("sleeping ...");
     }

     public void speak(){
        System.out.println("hello sir.");
     }
}


abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();

}

class smartPhone extends telephone{
    @Override
    public void ring(){
        System.out.println("ringing in samrtphone");
    }
    @Override
    public void lift(){
        System.out.println("lift");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting ");
    }

    public void on(){
        System.out.println("turnOn,....");
    }
}


interface tvRemote{
   void onTv();
   void offTv();
}
interface samartTvRemote extends tvRemote{
    void SmartOnTv();
   void SmartOffTv();
}

class Tv implements tvRemote{
    public void onTv(){
        System.out.println("turning On ");


    }
    public void offTv(){
        System.out.println("turining off tv");
    }

    public void theme(){
        System.out.println("change theme");
    }
}
public class practiceset11 {
    public static void main(String[] args) {

        // problem 1,2
        fountainPen f=new fountainPen();
        f.write();
        f.greet();


        // problem 5
        monkey m=new human();
        // m.sleep();//-->cannot use sleep because the reference is monkey which does not have sleep method

        m.jump();
        m.bite();

        BasicAnimal lavish=new human();
        // lavish.speak();//error
        lavish.eat();
        lavish.sleep();


        // problem 4
        telephone t=new smartPhone();
        t.ring();
        // t.on();--error

        tvRemote t1=new Tv();
        // t1.theme();//error
        t1.onTv();
        t1.offTv();


    }
}
