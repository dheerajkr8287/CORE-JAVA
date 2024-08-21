public class issortedarray {

    public static boolean isIncreasing (int [] numArray){
        int i=1;
        while (i<numArray.length) {
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
            
        }

        return true;
    }
    public static boolean isDecreasing(int [] numArray){
        int i=1;
        while (i<numArray.length) {
            if (numArray[i]>numArray[i-1]) {
                return false;
                
            }
            i++;
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to check Array is sorting or not");
        int[] numArray=ArrayUtillity.inputArray();
        boolean isIncreasing=isIncreasing(numArray);
        boolean isDecreasing=isDecreasing(numArray);
        if(isIncreasing || isDecreasing){
            System.out.println("your array is sorted ");
        }
        else{
            System.out.println("your arrary is not sorted ");
        }

        
    }
}

