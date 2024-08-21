class Employee{
    int salary;
    String name;
    public int  getSalary(){
       return  salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

class cellPhone{
    public void printRing(){
        System.out.println("Ringing.......");
    }
    public void printVibrating(){
        System.out.println("Vibraitng....");
    }
}


class square{
   
    public int areaFind(int side){
        int area=side*side;
        return area;


    }
    public int perimeterFind(int side){
        int perimeter=4*side;
        return perimeter;
    }

}



public class practiceset8 {
public static void main(String[] args) {

    // question 1:
    /* Employee harry=new Employee();
    Employee neeraj=new Employee();

    harry.salary=55;
    System.out.println("harrysalary:"+harry);

    harry.name="dheeraj";
    System.out.println(harry.name);

    neeraj.name="kaka";
    neeraj.salary=5;
    System.out.println("johnName: "+neeraj.salary);
    System.out.println(neeraj.name);

    harry.setName("dark");
    harry.getName();
    System.out.println(harry.getName()); */


    // question 2:
   /*  cellPhone phone=new cellPhone();
    phone.printVibrating();
    phone.printRing(); */



    // question 3:
    square s=new square();
    s.areaFind(4);
    s.perimeterFind(4);
    System.out.println(s.areaFind(4));
    System.out.println(s.perimeterFind(4));

    



    
}
    
}
