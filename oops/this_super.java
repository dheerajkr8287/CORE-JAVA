class ekclass{
    int a;
    public int getX(){
        return a;
    }
//constructor

    ekclass(int a){
        //this ka use method ke bahar hai  variable aur jo hmm ne    parameter liya hai usme differinate ke liye
        this.a=a;
    }

    public int returnOne(){
        return 1;
    }
}

class doclass extends ekclass{
    doclass(int c){

        // super keyword:variable used to refer immediate parent class object
        super(c);
        System.out.println("i am a constructor of derived class");
    
    }
}


public class this_super {
    public static void main(String[] args) {
        // ekclass e=new ekclass(4);
        doclass d=new doclass(5);
        System.out.println(d.getX());
    }
    
}
