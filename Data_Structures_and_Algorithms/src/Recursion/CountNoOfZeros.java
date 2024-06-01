package Recursion;

public class CountNoOfZeros {

    public static void main(String[] args) {
        System.out.print(count(100302010));
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n, int count){

        if( n < 1){
            return count;
        }

        int rem = n % 10;

        if(rem == 0){
            count = count + 1;
        }

        return helper(n/10,count);

    }
}
