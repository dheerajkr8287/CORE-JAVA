
public class syntax {
public static void main(String[] args) {

    // there are three way to create an array in java

    // 1:declaration and memory allocation then intalize
    // int [] myArr=new int[5];
    // myArr[0]=88;
    // myArr[1]=81;
    // myArr[2]=32;
    // myArr[3]=8;
    // myArr[4]=22;


    // 2:declare and then memory allocation and intalize
    // int [] marks;
    // marks=new int[5];
    // System.out.println(myArr[0]);
    // System.out.println(myArr[1]);
    // System.out.println(myArr[2]);
    // System.out.println(myArr[3]);
    // System.out.println(myArr[4]);


    //declare ,memeory allocation and intalization together
    int []myArr={45,88,11,44,66};



//TRAVERSAL IN THE ARRAY
    int i=0;
    while (i<myArr.length) {
        System.out.println(myArr[i]);
        i++;
        
    }
}
    
}