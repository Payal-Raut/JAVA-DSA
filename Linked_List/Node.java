
class Node{
    Node next ;
    int data ;
    
    Node(int data){
        this.data = data ;
        this.next = null;
    }
    public static void main(String[] args) {
        //inititalize node 
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        //insert at beginning
        Node newNode = new Node(40);
        newNode.next = head;
        head = newNode;


        //insert at end 
        Node newNode1 = new Node(50);       
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode1;


        //delete node
        public static void deleteNode(){
            
        }


        //print nodes

        temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }
}