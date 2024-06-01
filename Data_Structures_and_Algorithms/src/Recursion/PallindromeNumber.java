package Recursion;

public class PallindromeNumber {


    public static void main(String[] args) {

        System.out.print(checkPallindrome(1210));
    }


    static boolean checkPallindrome(int n){

        boolean isPallindrome = false;
        if( n == ReverseNumber.reverse(n)){
            isPallindrome = true;
        }
        return isPallindrome;
    }
}
