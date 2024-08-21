class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("my id is:"+id);
        System.out.println("my name is:"+name);


    }
    public int getSalary(){
        return salary;

    }

}
public class customclass{
    public static void main(String[] args) {
    
    //Any real world object=properties+Behaviour
    //object    in     oops= Attributes+Method


        System.out.println("this is custom class");
        Employee harry=new Employee();//instantiating a new Employee object
        Employee john=new Employee();//instantiating a new Employee object

        // setting a attributesfor harry

        harry.id=22;
        harry.name="DK";
        harry.salary=1000;

        // setting a attributes for john
        john.id=44;
        john.name="john kumar";
        john.salary=2000;



        // print the attributes
        harry.printDetails();
        john.printDetails();
        // print the salary
        int salary=harry.getSalary();
        System.out.println(salary);
        int salary1=john.getSalary();
        System.out.println(salary1);





    }
}