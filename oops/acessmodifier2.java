
class c1{
    public int x=3;
    protected int y=4;
    int z=31;
    private int a=33;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}


public class acessmodifier2 {
    public static void main(String[] args) {
        c1 c=new c1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);//same package private not allowed
        
    }
}
