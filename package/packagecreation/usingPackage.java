import kaka.gym.harryGym;

class using extends harryGym{
   void meth2(){
    System.out.println(x);
    System.out.println(y);
    // System.out.println(z);
    // System.out.println(a);
}
   
}
public class usingPackage {
    public static void main(String[] args) {
        System.out.println("i am using package");
        // harryGym c=new harryGym();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
        using c=new using();
        c.meth2();
    }
}
