class circle{
 public int radius;
 circle(){
    System.out.println("I am non paramertized consrtuctor");
 }
  circle(int r){
    System.out.println(" I am circle of parameterized contructor");
    this.radius=r;
 }
 public double area(){
    return Math.PI*this.radius*this.radius;
 }

}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder paramertized consrtuctor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    
}



public class practiceset10{
    public static void main(String[] args) {
        // circle c=new circle();
        // circle c=new circle(5);

        cylinder c1=new cylinder(4, 5);
    }
}