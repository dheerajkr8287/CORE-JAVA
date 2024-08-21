public class tempCodeRunnerFile{

    public static void main(String[] args) {
        
       
    }



    
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = x;
        boolean b = false;
        int temp = 0;
        while (y > 0) {
            temp = temp * 10 + y % 10;
            y = y / 10;

        }
        if (x == temp) b = true;
        return b;
    }

}

