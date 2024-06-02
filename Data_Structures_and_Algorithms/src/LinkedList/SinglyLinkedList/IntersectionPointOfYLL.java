package LinkedList.SinglyLinkedList;

public class IntersectionPointOfYLL {

    public static Node getIntersectionNodeNaive(Node headA, Node headB) {

        int l1 = 0;
        int l2 = 0;

        Node t1 = headA;
        Node t2 = headB;

        while (t1 != null) {
            l1++;
            t1 = t1.next;
        }

        System.out.println("length of first LL:::"+l1);

        while (t2 != null) {
            l2++;
            t2 = t2.next;
        }

        System.out.println("length of second LL:::"+l2);

        System.out.println("t1::"+t1);
        System.out.println("t2::"+t2);

        if (l1 > l2) {
            return getCollisionPoint(headB, headA, l1 - l2);
        } else if (l2 > l1) {
            return getCollisionPoint(headA, headB, l2 - l1);
        } else {
            return getCollisionPoint(headA, headB, 0);
        }
    }

    public static Node getCollisionPoint(Node small,Node bigger, int d){
        Node t1 = small;
        Node t2 = bigger;

        System.out.println("distance to move :::"+d);
        while(d > 0 && t2!=null){
            d--;
            t2 = t2.next;
        }

        //Now after the while loop both are at same position and can be compared
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }

    public static Node getIntersectionNodeOptimal(Node headA, Node headB) {

        Node t1 = headA;
        Node t2 = headB;

        while(t1 != t2){

            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2){
                return t1;
            }

            if(t1 == null){
                t1 = headB;
            }

            if(t2 == null){
                t2 = headA;
            }

        }
        return t1;
}

    public static void main(String[] args) {

        Node head1,head2;
        /*
                Create two linked lists with intersection

                1st 3->6->9->15->30
                2nd 10->15->30

                15 is the intersection point
        */

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

       /*
                Create two linked lists with without intersection

                1st 2->6->4
                2nd 1->5

        */

        /*head1 = new Node(2);
        head1.next =new Node(6);
        head1.next.next = new Node(4);
        head1.next.next.next = null;

        head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = null;

        System.out.println("1st LL ::: "+head1);
        System.out.println("2nd LL ::: "+head2);*/



        //get intersection point
        //Node ret = getIntersectionNodeNaive(head1,head2);
        Node ret = getIntersectionNodeOptimal(head1,head2);
        System.out.println(ret);
    }
}
