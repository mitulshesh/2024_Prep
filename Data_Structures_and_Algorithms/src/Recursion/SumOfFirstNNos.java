package Recursion;

/* can be solved in two ways
    Parameterized --> the parameter carries the answer in subsequent recursion calls
    Functional --> the function returns the value
 */
public class SumOfFirstNNos {

    private static void findSumParameterized(int n,int sum){

        //base condition
        if(n < 1){
            System.out.println(sum);
            return;
        }
        findSumParameterized(n-1 , sum+n);
    }

    private static int findSumFunctional(int n){
        //base condition
        if( n == 0){
            return 0;
        }
        return n + findSumFunctional(n-1);
    }

    public static void main(String[] args) {
        findSumParameterized(4,0);
        System.out.println(findSumFunctional(4));
    }
}
