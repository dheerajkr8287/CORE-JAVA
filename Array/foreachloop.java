public class foreachloop {
   public static void main(String[] args) {
   /*  String [] students={"harry","rohan","subham","lavish"};
    System.out.println(students.length);
     */


    int []marks={98,45,79,99,80};
    // System.out.println(marks.length); 

    // displaying array using for loop (TRAVERSAL PROBLRM)
    /* for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    } */


    // display array in reverse order
    /* for(int i=marks.length-1;i>=0;i--){
        System.out.println(marks[i]);

    } */


    // display array using for each loop
    for(int element:marks){
        System.out.println(element);
    }
   } 
}
