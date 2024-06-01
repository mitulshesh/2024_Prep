package Recursion;

public class ReverseNumber {

    static int reversedNumber = 0;

    public static void main(String[] args) {

        System.out.print(reverse( 1021));
    }

    static int reverse(int n){
        if ( n == 0){
            return reversedNumber;
        }
        int rem = n % 10;
        reversedNumber = reversedNumber * 10 + rem;
        n = n / 10;
        reverse(n);
        return reversedNumber;
    }
}
