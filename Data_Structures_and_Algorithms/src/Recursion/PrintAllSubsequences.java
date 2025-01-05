package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsequences {

    private static final List<Integer> orginalList = Arrays.asList(1,2,3,4);

    private static void printSubsequences(int index, List<Integer> subsList){

        //base condition
        if(index >= orginalList.size()){
            System.out.println(subsList);
            return;
        }

        subsList.add(orginalList.get(index));
        printSubsequences(index+1,subsList); // to take

        subsList.remove(orginalList.get(index));
        printSubsequences(index+1,subsList); //to not take

    }

    public static void main(String[] args) {

        printSubsequences(0,new ArrayList<Integer>());

    }
}
