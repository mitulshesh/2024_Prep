package LinkedList.SinglyLinkedList;

public class SinglyLinkedListMain {
    public static void print(String s){
        System.out.println(s);
    }


    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9,10,11,12};
        // int[] arr = {4};
        Node head = Node.convertArrayToLL(arr);
        System.out.println("Original LL::: "+head);

        //Traverse a LL
        Node tmp = head;
        while(tmp!=null){
            //System.out.println(tmp.data+ " ");
            tmp = tmp.next;
        }

        //print length of LL
        //System.out.println("Length of LL "+Node.lengthOfLL(head));
        System.out.print("\n");
        System.out.println("#### Trying to delete head #####");
        head = Node.deleteHead(head);
        System.out.println("After head deletion LL::: "+head);

        System.out.print("\n");
        System.out.println("#### Trying to delete Tail #####");
        head=Node.deleteTail(head);
        System.out.println("After tail deletion LL ::: "+head);

        int k = 1;
        System.out.print("\n");
        System.out.println("##### Before deleting "+k+"th element #######"+head);
        head=Node.deleteKthElem(head,k);
        System.out.println("After deletetion of "+ k + "th element::::"+head);

        int x =11;
        System.out.print("\n");
        System.out.println("#########Trying to delete element with value "+ x + " from LL");
        head = Node.deleteElemByValue(head,x);
        System.out.println("#########After deleting element with value "+ x + "from LL :::"+head);

        System.out.println("\n");
        int newHeadValue = 200;
        print("###### Trying to insert Head with value "+newHeadValue);
        head=Node.insertHead(head, newHeadValue);
        print("After inserting head with value "+newHeadValue+" LL updated to "+head);

        print("\n");
        int newTailValue = 500;
        print("##########Trying to Insert new Tail with value "+ newTailValue);
        head=Node.insertTail(head,newTailValue);
        print("After inserting tail with value "+ newTailValue+ " LL is ::"+head);

        print("\n");
        int insertPos = 4;
        int insertData = 700;
        print("######Trying to Insert new Node with value "+ insertData+ " at position "+ insertPos);
        head=Node.insertAtKthPos(head,insertPos,insertData);
        print("After inserting Node with value "+ insertData+ " at position "+insertPos+" LL is :::: "+ head);

    }
}
