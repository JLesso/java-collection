public class LinkedList{
    private class Node{
        public Animal value;
        public Node next;

        public Node(Animal an){ // Creates Animal Node with Next set to null
            this.value = an;
            this.next = null;
        }
        public Node(Animal an,Node node){// Creates Animal Node with Next set
            this.value = an;
            this.next = node;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList(){// Empty linkedlist constructor 
        head = null;
        tail = null;
    }

    public String About(){ //returns about me string
        return "LinkList Created by Jose Lesso";
    }

    public boolean IsEmpty(){ // chead if linkedlist is empty
        if(head == null){ 
            return true;
        }
        return false;
    }

    public void AddHead(Animal an){
        Node node = new Node(an); //creates new node

        if(IsEmpty()){ // Checks if LinkedList is empty
            head = node;
            tail = node;
        }
        else{
            node.next = head;// new node point to current head
            head = node;// new node becomes new head
        }
    }

     public void AddTail(Animal an){
        Node node = new Node(an); //creates new node

        if(IsEmpty()){ // Checks if LinkedList is empty
            head = node;
            tail = node;
        }
        else{
            tail.next = node;// tail points to new node
            tail = node;// new node becomes new tail
        }
     }

      public Animal RemoveHead()
      {

        if(IsEmpty()){ // Checks if LinkedList is empty(no nodes)
            return null;
        }

        if(head == tail){// One node
            Animal node = head.value;
            head = null;
            tail = null;
            return node;
        }
        // Two nodes ore more
        Animal node = head.value;
        head = head.next;// new head
        return node;
      }

      public String ToList(){
        String result = "";
        Node node = head; //creates new node
        while(node != null){
            result += node.value.description() + "\n";// call description and separated by new line
            node = node.next;
        }
        return result;
      }
}