
public class practiceset3 {
    public static void main(String[] args) {
        //convert string into lower case
       /*  String name="Harry";
        String lstring=name.toLowerCase();
        System.out.println(lstring); */


        // to replace space with underscore

        /* String str="    Harry   ";
        System.out.println(str.replace(' ', '_')); */



        //problem 3
       /*  String letter ="Dear <|name|>, Thank a lot!";
        letter=letter.replace("<|name|>","sachin") ;
        System.out.println(letter); */


        //detect double and triple space in a string 
          /* String myString="this is a good   name";
          System.out.println(myString.indexOf("  "));
          System.out.println(myString.indexOf("   "));
 */

          //problem 5
         String s="Dear Harry ,this java course is Nice.Thanks";
         s="Dear Harry ,\n\tthis java course is Nice.\nThanks";
         System.out.println(s);

    }
}
