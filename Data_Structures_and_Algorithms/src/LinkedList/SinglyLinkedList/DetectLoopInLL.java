package LinkedList.SinglyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class DetectLoopInLL {

    //Naive Solution
    public static boolean detectLoopNaive(Node head){
        //Integer has no such significance
        Map<Node,Integer> store = new HashMap();

        Node tmp = head;
        while(tmp != null){

            if(store.containsKey(tmp)){
                return true;
            }else{
                store.put(tmp,0);
            }
            tmp =tmp.next;
        }
        return false;

        //Time complexity
        //0(N) as we are traversing entire list
        //two Operations of hashmap ---- search/put..
        //Assming it takes logN time ---- O(2logN)
        //total = O(N) + O(2logN) ====not good.. need to Optimize
    }

    public static boolean detectLoopOptimal(Node head){
        //Tortoise and Hare Algorithm
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            //Submitted in leetcode.
        //https://leetcode.com/problems/linked-list-cycle/submissions/1274955117/
    }
}
