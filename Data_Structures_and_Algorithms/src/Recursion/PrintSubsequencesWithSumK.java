package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubsequencesWithSumK {

    private static final List<Integer> orginalList = Arrays.asList(1,2,1);

    private static void printSubsequencesSumK(int index, List<Integer> subsList, int sum){

        //base condition
        if(index >= orginalList.size()){
            if( sum == 2) {
                System.out.println(subsList);
            }
            return;
        }

        subsList.add(orginalList.get(index));
        sum = sum + orginalList.get(index);
        printSubsequencesSumK(index+1,subsList,sum); // to take

        subsList.remove(orginalList.get(index));
        sum = sum - orginalList.get(index);
        printSubsequencesSumK(index+1,subsList, sum); //to not take

    }

    public static void main(String[] args) {
        printSubsequencesSumK(0,new ArrayList<Integer>(),0);
    }
}
