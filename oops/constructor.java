class myEmployee{
    private int id;
    private String name;


    // constructor
    public myEmployee(){
        id=0;
        name="your-name";

    }
    public myEmployee(String myName,int myid){
     id=myid;
     name=myName;
    }

    public myEmployee(String myName){
        name=myName;
        id=1;

    }



   public void setName(String n){
    this.name=n;
   }
   public String getName(){
    return name;
   }


   public void setId(int i){
    this.id=i;
   }
   public int getId(){
    return id;
   }

}

public class constructor {
    public static void main(String[] args) {
    //    myEmployee harry=new myEmployee();
    //    myEmployee harry=new myEmployee("raji",44);
       myEmployee harry=new myEmployee("kaka");
    //    harry.setId(55);
    //    harry.setName("dheeraj");
       System.out.println(harry.getId());
       System.out.println(harry.getName());

    }
}

