// acessModifier and constructor

class cylinder{
    private int  radius;
    private int height;

    // constructor
    public cylinder(int ra,int he){
        radius=ra;
        height=he;

    }


    // 
     
    // setter
    public void setRadius(int r){
        this.radius=r;
    }
    // getter
    public int getRadius(){
        return radius;
    }
    //setter
    public void setHeight(int h){
        this.height=h;
    }
    // getter
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2*3.14*radius*(height+radius);
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}


class rectangle{
 private int length;
 private int breadth;

 public rectangle(){
    this.length=4;
    this.breadth=5;

 }
//  getter
public int getLength(){
    return length;
}

public int getBreadth(){
    return breadth;
}

  
 public rectangle(int l,int  b){
   this.length=l;
    this.breadth=b;
 }


}



public class practiceset9 {
    public static void main(String[] args) {
//    problem 1:
        /*  cylinder c=new cylinder();
        c.setHeight(2);
        c.setRadius(5);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
 */

//problem:2
   /*  cylinder c1=new cylinder(2,5 );

    System.out.println(c1.surfaceArea());
    System.out.println(c1.volume());



 */



 //problem 3:
// rectangle re=new rectangle();

rectangle re=new rectangle(54,44);

re.getLength();
re.getBreadth();
System.out.println(re.getLength());
System.out.println(re.getBreadth());

    }
}
