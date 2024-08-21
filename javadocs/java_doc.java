package javaDocs;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>Italic</i> word<p>this is new paragraph</p>
 * @author Dheeraj(DARKER)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html"   target="_blank">Java Docs</a>
 */
public class java_doc {

    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    /**
     *hello method is use for addtion of two number
     * @param i This is first number to add
     * @param j This is second number to add
     * @return sum of two number as a Integer
     * @throws Exception if i is 0
     * @deprecated  this method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return  c;
    }
}


//source :>  oracle javadocs



