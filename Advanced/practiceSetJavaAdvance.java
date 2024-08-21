

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//pro2
class myDepricated{
    @Deprecated
    void meth1(){
        System.out.println("I am good");
    }
}

interface myInt{
    void display();

}
public class practiceSetJavaAdvance {
//    pro:3
    @SuppressWarnings("Deprication")
    public static void main(String[] args) {
//        myDepricated d=new myDepricated();
//        d.meth1();

//        problem4 using lamda
//        myInt i= () -> System.out.println("i am displaying");



//        pro5
        int n=5;
        String table="";
        for(int i=1;i<=10;i++){
            table+=n+"X"+i+"="+n*i;
            table+="\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
