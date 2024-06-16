import java.util.Scanner;  

class HelloWorld {
    public static void main(String[] args) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt(); 

        // A number less than 2 is not a prime number
        if (n < 2) {
            System.out.println("not prime number");
            return;
        }

        // Check for factors from 2 to n-1
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
                break; 
            }
        }

        if (temp == 0) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
