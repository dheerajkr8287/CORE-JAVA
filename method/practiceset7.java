
public class practiceset7 {

    // table 
static void table(int n){
    for(int i=1;i<=10;i++){
        System.out.println(n+"X"+i+"="+n*i);
    }

}

// patteren using loop
static void pattern_loop(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
    }
}
//sum of first N natural number using recursion
static int sumNum(int n){
 if(n==1){
    return 1;
    
} 
return n+sumNum(n-1);

}



//  pattern using recursiin
static void pattern_rec(int n){
    pattern_loop(n-1);

    if(n>0){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

// pattern_rec(3)
// pattern_rec(2)+3times star and new line
// pattern_rec(1)+2times star and new line+3times star and new line
// pattern_rec(0)+1times star and new line+2times star and new line+3times star and new line



    public static void main(String[] args) {
        // table(5);
        // pattern_loop(7);

        /* sumNum(5);
        System.out.println(sumNum(5)); */
        pattern_loop(5);
    }
}
