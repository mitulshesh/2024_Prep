package LinkedList.DoublyLinkedList;

public class NodeD {
        private int data;
        private NodeD next;
        private NodeD prev;

        public NodeD(int data){
            this.data = data;
            this.next=null;
            this.prev=null;
        }

        public NodeD(int data,NodeD prev,NodeD next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }

        public static NodeD convertArrtoLL(int[] arr){

            NodeD head = new NodeD(arr[0]);

            NodeD mover = head;

            for(int i=1;i<arr.length;i++){
                NodeD tmp = new NodeD(arr[i],mover,null);
                mover.next = tmp;
                mover=tmp;
            }
            return head;
        }

        public static void printDLL(NodeD head){
            NodeD tmp =head;
            int count=0;
            while(tmp!=null){
                count++;
                System.out.print("Printing NodeD "+count+" with data "+tmp.data);
                if(tmp.prev!=null){
                    System.out.print(" And previous as "+tmp.prev.data);
                }else{
                    System.out.print(" And previous as NULL");
                }
                if(tmp.next!=null){
                    System.out.print(" And next as "+tmp.next.data);
                }else{
                    System.out.print(" And next as NULL");
                }
                System.out.print('\n');
                tmp = tmp.next;
            }
        }

        public static NodeD deleteHead(NodeD head){

            if(head == null || head.next == null) {
                return null;
            }

            NodeD tmp = head;
            head = head.next;
            head.prev=null;
            tmp.next=null;
            return head;
        }

        public static NodeD deleteTail(NodeD head){
            NodeD tmp =head;
            while(tmp.next.next!=null){
                tmp=tmp.next;
            }

            tmp.next.prev = null;
            tmp.next=null;
            return head;
        }

        //come back tomorrow
   /* public static NodeD deleteKthElement(NodeD head,int k){

        if(head == null){
            return null;
        }

        NodeD tmp = head;

        int count=0;
        NodeD tmp = head;
        NodeD previous = null;
        while(tmp!=null){
            count++;
            if(count == k){
                previous.next = tmp.next;
                tmp.next.prev = previous;
            }
            previous=tmp;
            tmp = tmp.next;
        }
        return head;
    }*/

        public static NodeD deleteElementByValue(NodeD head,int value){

            if(head == null){
                return null;
            }

            if(head.data == value){
                return deleteHead(head);
            }

            int count=0;
            NodeD tmp = head;
            NodeD previous = null;
            while(tmp!=null){

                if(tmp.data == value){
                    previous.next = tmp.next;
                    if(tmp.next!=null) {
                        tmp.next.prev = previous;
                    }
                }
                previous=tmp;
                tmp = tmp.next;
            }
            return head;
        }

        public static NodeD reverseDLL(NodeD head){

            NodeD current = head;
            NodeD last = null;
            while(current != null) {
                last = current.prev;
                current.prev = current.next;
                current.next = last;
                current = current.prev;
            }
            return last.prev;
        }
    }
