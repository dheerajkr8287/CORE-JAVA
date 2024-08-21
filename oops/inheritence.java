
class Base{
    public int x;
    public void setX(int x){
        System.out.println("I am in Base and settng x now");
        this.x=x;
    }
    public int getX(){
        return x;
    }


}

class Derived extends Base{
    int y;
    public void setY(int y){
        System.out.println("I am in derived and settng y now");
        this.y=y;
    }
    public int getY(){
        return y;
    }
}


public class inheritence {
    public static void main(String[] args) {
        // cretaing object of base class 
        Base b=new Base();
        b.setX(5);
        System.out.println(b.getX());

        // creating object of derived class
        Derived d=new Derived();
        d.setX(55);
        System.out.println(d.getX());
        d.setY(66);
        System.out.println(d.getY());


    }
}
