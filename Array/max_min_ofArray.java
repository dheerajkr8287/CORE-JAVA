public class max_min_ofArray {
    public static int max(int numArray[]){

        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max=numArray[0];
        int i=1;
        while (i<numArray.length) {
            if(max<numArray[i]){
                max=numArray[i];
            }
            i++;
        }
        return max;



    }
    public static int min(int numArray[]){
        System.out.println("turn to find min value:");

        int min=Integer.MAX_VALUE;

        int i=0;
        while (i<numArray.length) {
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
        return min;



    }
    public static void main(String[] args) {

        int numArray[]=ArrayUtillity.inputArray();
        int max=max( numArray);
        System.out.println("Your Max number is:"+max);
        int min=min(numArray);
        System.out.println("minimum value is :"+min);


    }
}
