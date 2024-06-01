package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int n = 0;
        System.out.println(findFactorial(n));
    }

    static int findFactorial(int n){

        if(n <= 1){
            return 1;
        }

        return n * findFactorial(n-1);
    }


}
