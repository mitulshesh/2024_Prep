package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 0;
        System.out.print(sum(n));
    }

    static int sum(int n){

        //base condition
        if ( n == 0){
            return 0;
        }

        //tail recursion
        return n%10 + sum (n/10);


    }
}
