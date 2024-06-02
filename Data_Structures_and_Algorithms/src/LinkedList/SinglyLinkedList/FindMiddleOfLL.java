package LinkedList.SinglyLinkedList;

public class FindMiddleOfLL {

    //2 pass solution
    public static Node findMiddleNaive(Node head){

        if(head == null){
            return null;
        }

        int count = 0; // store the length of LL
        Node tmp = head;

        //Pass - 1 TC - O(N)
        while(tmp != null){
            count++;
            tmp =tmp.next;
        }

        int mid = (count/2)+1;

        tmp = head;

        //Pass 2 - TC - O(N/2)
        while(tmp != null){
            mid --;
            if(mid == 0){
                break;
            }
            tmp =tmp.next;
        }
        return tmp;
    }

    public static Node findMiddleOptimal(Node head){
        //Tortoise and Hare Algorithm

        Node slow = head;
        Node fast = head;

        //TC is O(n/2) as we are traversing half of the LL
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9};
        Node head = Node.convertArrayToLL(arr);
        //Node midElement = findMiddleNaive(head);
        Node midElement = findMiddleOptimal(head);
        System.out.println("Middle element is ::::"+midElement.data);
    }
}
