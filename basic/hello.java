public class hello{
    public static void main(String[] args){
        System.out.println("hello java");
        // pascal convention ----> AddTwoNum-->for class
        // camelcase-->addTwoNum---->for function
        int quantity;
        //The variables declared inside a method must be initialized with a value before printing their value or performing any operation on them

		// float totalCost = 10 * quantity; // error on this line BECAUSE OF NOT initialize
		// System.out.println(totalCost);


        // OPERATORS

        //Unary Operators

        // bitwise complement(~)---> flip bits of the value
        // logical negation(!)----> inverts the value of a boolean

        /* int numOne = 10;
        boolean isTrue = true;

        System.out.println(!isTrue + " " + ~numOne);   */   //Output will be false -13

        //relational operations is either true or false. 

        // Ternary Operator:<condition> ? <value if condition is true> : < value if condition is false> 
        
/* 
        int numOne =10;
        int numTw0=5;
        int min=(numOne<numTw0)?numOne:numTw0;
        System.out.println(min);  //ouput is 5

 */




//  bitwise operator
          
          /* int p=9,q=10;
          System.out.println(p|q);//11
          System.out.println(p&q);//8
          System.out.println(p^q);//3


          //left shift
          System.out.println(p<<1);//18
          System.out.println(p<<2);//36

          //right shift
          System.out.println(q>>1);//5
          System.out.println(q>>2);//2
 */




//  literals:constant value which are store in the variable
    

int a=83;
char c='A';
float f=33.4f;
double d1=333.4;
System.out.println(f);
System.out.println(c);

  





    }
}