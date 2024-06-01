package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Map;
/*
904. Fruit Into Baskets
Solved
Medium
Topics
Companies
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.



Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
 */

public class FruitsIntoBasket {

    public static void main(String[] args) {

        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruits(fruits));
    }

    public static int totalFruits(int[] fruits){

        int l = 0;
        int r = 0;
        Map<Integer,Integer> basket = new HashMap<>();
        int maxLength = 0;
        while(r < fruits.length){
            if(basket.containsKey(fruits[r])){
                basket.put(fruits[r], basket.get(fruits[r])+1);
            }else {
                basket.put(fruits[r],1);
            }

            if(basket.size()<=2){
                maxLength = Math.max(r-l+1,maxLength);
            }else{
                basket.put(fruits[l],basket.get(fruits[l])-1);
                if(basket.get(fruits[l]) == 0){
                    basket.remove(fruits[l]);
                }
                l++;
            }
            r++;
        }
        return maxLength;
    }
}
