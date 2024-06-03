package Predicates;


import java.util.function.Predicate;
import java.util.function.Function;

public class CombiningPredicates {

    public static void main(String[] args) {

        int[] numArr = {4,6,7,3,2,10,14};

       System.out.println("###### Approach 1 --- AND #########");
        Predicate<Integer> p = i -> i % 2 == 0 && i > 4;

        for(int element : numArr){
            if(p.test(Integer.valueOf(element))){
                System.out.println(element);
            }
        }

        System.out.println("###### Approach 2 --- AND #########");
        Predicate<Integer> p1 = i -> i% 2 == 0;
        Predicate<Integer> p2 = i -> i > 4;

        for(int element : numArr){
            if(p1.and(p2).test(Integer.valueOf(element))){
                System.out.println(element);
            }
        }

        System.out.println("####### Approach 3 OR");
        //Find numbers which are  either even or greater than 4
        for(int element : numArr){
            if(p1.or(p2).test(Integer.valueOf(element))){
                System.out.println(element);
            }
        }

        System.out.println("####### Approach 4 Negate");
        //Find numbers which are not even, then we can use negate
        for(int element : numArr){
            if(p1.negate().test(Integer.valueOf(element))){
                System.out.println(element);
            }
        }
    }
}
