package LinkedList.SinglyLinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public static Node convertArrayToLL(int[] arr){

        //setting the head first as the first node
        //Keep moving the "mover" and tmp would store the new node added
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node tmp = new Node(arr[i]);
            mover.next= tmp;
            mover=tmp;
        }
        return head;
    }

    public static int lengthOfLL(Node head){
        Node tmp = head;
        int count=0;
        while(tmp!=null){
            count++;
            tmp =tmp.next;
        }
        return count;
    }

    /*########################## deletion ###########################*/
    public static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head){

        if(head == null || head.next == null){
            return null;
        }
        Node tmp = head;
        while(tmp.next.next !=null){
            tmp = tmp.next;
        }
        tmp.next = null;
        return head;
    }

    //Delete kth element
    public static Node deleteKthElem(Node head, int k){
        //Edge case 1 : check if head is null
        if(head == null){
            return head;
        }
        //Edge case 2: check if k == 1 , then we just need to move the head
        if(k == 1){
            head = head.next;
            return head;
        }
        //If edge cases dont meet then we continue with core logic to delete Kth element
        Node tmp = head;
        int count=0;
        //Holds the previous node
        Node previous = null;
        while(tmp != null){
            count++;
            if(k == count){
                previous.next = previous.next.next;
                return head;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }

    //Delete element by value
    public static Node deleteElemByValue(Node head, int x){
        //Edge case 1 : check if head is null
        if(head == null){
            return head;
        }
        //Edge case 2 :  determine if head itself is the data to delete
        if(x == head.data){
            head = head.next;
            return head;
        }

        //If edge cases don't meet then we continue with core logic to delete Kth element
        Node tmp = head;
        //Holds the previous node
        Node previous = null;
        while(tmp != null){
            if(x == tmp.data){
                previous.next = previous.next.next;
                return head;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }
    /*########################## Insertion ###########################*/
    //Data is the new Node value to be inserted
    public static Node insertHead(Node currHead, int data){
        if(currHead == null){
            return currHead;
        }
        Node newHead = new Node(data);
        newHead.next = currHead;
        return newHead;
    }

    public static Node insertTail(Node head, int data){

        if(head == null){
            return head;
        }

        Node newTail = new Node(data);
        Node tmp = head;

        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next = newTail;
        return head;
    }

    public static Node insertAtKthPos(Node head, int pos, int data){


        //Edge case 1 : LL is empty and pos == 1
        if(head == null){
            if(pos == 1) {
                head = new Node(data);
                return head;
            }else{
                System.out.println("Not possible");
                return null;
            }
        }
        //Edge case 2: when position is 1
        if(pos == 1){
            Node tmp = new Node(data,head);
            return tmp;
        }

        //Core logic for insertion
        Node tmp = head;
        int currPos = 0;
        while(tmp.next!=null){
            currPos++;

            if(currPos == pos - 1){
                Node newNode = new Node(data);
                Node prevTmp = tmp;
                Node nextTmp = tmp.next;
                prevTmp.next=newNode;
                newNode.next=nextTmp;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
