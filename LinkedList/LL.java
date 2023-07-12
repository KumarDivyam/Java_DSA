//The code given below is mannual implementaion of LinkedList i.e. withoutusing
//Collection Framework
//By using collection Framework we there is no need of creating LL and its functions
//they are all inbuilt and can be simply called using java.util
class LL{
    Node head;
    
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next = next;
        }
    }
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head =newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        
        if (head == null){
            System.out.println("Empty List");
            return;
        }    
         head = head.next;
    }
    public void deleteLast(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.next == null){ //SINGLE ELEMENT IN THE LIST
            head=null;
            return;
        }
        
        Node secondLast = head;
        Node lastnode = head.next;
        while(lastnode.next!=null){
        lastnode = lastnode.next;
        secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void printList(){
        if (head == null){
        System.out.println("Empty List");
        return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public void reversalIterative(){
        if(head == null || head.next == null)
        return ;

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        // list.addFirst("a");
        // list.addFirst("is");       
        // list.printList();
        // System.out.println();
        // list.addLast("List");
        // list.printList();
        // list.addFirst("This");
        // System.out.println();
        // list.printList();
        // list.deleteFirst();
        // System.out.println();
        // list.printList();
        // list.deleteLast();
        // System.out.println();
        // list.printList(); 

        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        
        list.printList();
        System.out.println();
        //list.reversalIterative();
        list.head = list.reverseRecursive(list.head);
        list.printList();


    }
}