import java.util.*;

public class string_method {
    public static void main(String[] args) {
        String name="Harry";
        // length()----->RETURNS length of string name
        /* int value=name.length();
        System.out.println(value); */


        // toLowerCase()----->return a new String which has all the lower case character from the String name
        /* String lstring=name.toLowerCase();
        System.out.println(lstring);
 */

        // toUpperCase()--->return a new String which has all the upper case character from the String name.

        /* String ustring=name.toUpperCase();
        System.out.println(ustring); */


        //trim():Returns a new String after removing all the leading and trailing spaces from the original string.
        /* String nonTrimmedString="     Harry    ";
        System.out.println(nonTrimmedString);
        String trimString=nonTrimmedString.trim();
        System.out.println(trimString); */

        //substring(int start)--->return a substring from start to the end 
      /*   System.out.println(name.substring(1));
        System.out.println(name.substring(2));
        System.out.println(name.substring(3)); */

        //subString(int start,int end)-->Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
        /* System.out.println(name.substring(1,4));
        System.out.println(name.substring(1,5)); */


        // replace(oldchar,newchar)-->Returns a new string after replacing r with p
        /* System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ir")); */

        // startsWith("Ha")-->Returns true if the name starts with the string “Ha”. (True in this case)
        //endsWith("ry")-->Returns true if the name ends with the string “ry”. (True in this case)
        /* System.out.println(name.startsWith("arry"));
        System.out.println(name.endsWith("arry")); */


        //charAt()=return character at a given index
        // System.out.println(name.charAt(1));

        //indexOf()-->Returns the index of the first occurrence of the specified character in the given string
        /* System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("ry")); */


       /*  String modifiedName="Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.indexOf("dkb"));//-1 */


        //lastIndexOf()--->Returns the last index of the specified character from the given string
        /* String modifiedName="Harryrry";
        System.out.println(modifiedName.lastIndexOf("rry",4)); */


        // equal()-->Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
        System.out.println(name.equals("Harry"));

        //equalIgnoreCase()--->"harry”)	Returns true if two strings are equal, ignoring the case of characters.
        System.out.println(name.equalsIgnoreCase("haRRy"));



/*         Escape Sequence Characters : 
---->The sequence of characters after backslash ‘\’ = Escape Sequence Characters
------->Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
---------->Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc. */


        
// right half pyramid

        // System.out.println("* \n**\n***\n****\n*****");
        


        //reverse right pyramid

        // System.out.println("*****\n****\n***\n**\n*");


        //left half pyramid

        // System.out.println("    *\n   **\n  ***\n ****\n*****");

        


    }
}
