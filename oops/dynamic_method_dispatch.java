class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone ");
    }
}
class smartPhone extends Phone{
    public void music(){
        System.out.println("playing music..");
    }
    @Override
    public void on(){
        System.out.println("turining on samrt phone ..");
    }
}
public class dynamic_method_dispatch {
public static void main(String[] args) {
    // object is made at run time 

    // yha par reference super class ka hai aur object subclass ka hai
    Phone obj=new smartPhone();    //yes it is allowed subclass ke object se super class ko call kar sakte hai
    // smartPhone obj2=new Phone();    //not allowed super class ke obj se sub class ko nhi call kara sakte
    obj.on();    //jiska object create hoga ushi ka override waala method  run hoga

    obj.showTime();
    // obj.music();  //not allowed
}
    
}