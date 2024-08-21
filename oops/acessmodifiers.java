class myEmployee{
    private int id;
    private String name;

   public void setName(String n){
    this.name=n;////this ka use method ke bahar hai  variable aur jo hmm ne    parameter liya hai usme differinate ke liye
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

public class acessmodifiers {
    public static void main(String[] args) {
       myEmployee harry=new myEmployee();
       harry.setId(55);
       harry.setName("dheeraj");
       System.out.println(harry.getId());
       System.out.println(harry.getName());

    }
}
