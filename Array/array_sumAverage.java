public class array_sumAverage {

    public static long sum(int[] numArray){
       int sum=0;
       int i=0;
       while (i<numArray.length) {
        sum=sum+numArray[i];
        i++;
        
       }

        return sum;
    }

    public static double average(int[] numArray){

        return sum(numArray)/numArray.length;
    }
    public static void main(String[] args) {
        int numArray[]=ArrayUtillity.inputArray();
        long sum=sum(numArray);
        double avg=average(numArray);
        System.out.println("Sum of the number is :"+sum);
        System.out.println("Avreage of the number is:"+avg);
    }
}
