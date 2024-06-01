package LinkedList.DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        NodeD head = NodeD.convertArrtoLL(arr);
        NodeD.printDLL(head);

        //Delete head
        System.out.println("#############trying to delete head");
        head = NodeD.deleteHead(head);
        NodeD.printDLL(head);

        //Delete tail
        System.out.println("###############Trying to delete tail");
        head=NodeD.deleteTail(head);
        NodeD.printDLL(head);

        //Delete Kth Element
        System.out.println("########### TRying to delete 3rd element");
        //head=NodeD.deleteKthElement(head,4);
        NodeD.printDLL(head);

        //Delete element with value 5
        System.out.println("########### TRying to delete element with value 5");
        head=NodeD.deleteElementByValue(head,5);
        NodeD.printDLL(head);

        System.out.println("########## trying to reverse the DLL");
        head = NodeD.reverseDLL(head);
        NodeD.printDLL(head);
    }
}
