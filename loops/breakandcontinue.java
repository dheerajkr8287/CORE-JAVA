public class breakandcontinue {
    public static void main(String[] args) {


        //break
        /* for(int i=0;i<10;i++){
            System.out.println(i);
            System.out.println("hi java");
            if(i==2){
                System.out.println("ending the loop ");
                break;
            }
        }
        System.out.println("loop end here"); */



        // continue
     for(int i=0;i<10;i++){
         if(i==2){
             System.out.println("ending the loop ");
             continue;
            }
            System.out.println(i);
            System.out.println("hi java");
        }
        System.out.println("loop end here"); 


    }
}
