package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintFirstSubsequenceWithSumK {

    private static final List<Integer> orginalList = Arrays.asList(4,6,9);

    private static boolean printSubsequencesSumK(int index, List<Integer> subsList, int sum){

        //base condition
        if(index >= orginalList.size()){
            if( sum == 15) {
                System.out.println(subsList);
                return true;
            }else{
                return false;
            }
        }

        subsList.add(orginalList.get(index));
        sum = sum + orginalList.get(index);
        // to take
        if(printSubsequencesSumK(index+1,subsList,sum) == true){
            return true;
        }

        subsList.remove(orginalList.get(index));
        sum = sum - orginalList.get(index);
        //to not take
        if(printSubsequencesSumK(index+1,subsList, sum) == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        printSubsequencesSumK(0,new ArrayList<Integer>(),0);
    }
}
