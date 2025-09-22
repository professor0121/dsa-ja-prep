public class Linked {
    public static class Node {
        int data;
        Node ptr;

        Node(int data) {
            this.data = data;
            this.ptr = null;
        }
    }

    public static Node head;

    public static Node last;
  
    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.ptr != null) {
            current = current.ptr;
        }
        current.ptr = newNode;
        last = current.ptr;
    }

    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.ptr;
        }
        System.out.println("null");
    }

    private static void revDisplayHelper(Node node) {
        if (node == null) {
            return;
        }
        revDisplayHelper(node.ptr);
        System.out.print(node.data + " -> ");
    }

    public static int deleteFromBegning() {
        Node current = head;
        head = current.ptr;
        return 0;
    }

    public static Node deleteFromLast() {
        if (head == null) {
            return null;
        }

        if (head.ptr == null) {
            return null;
        }

        Node secondLast = head;
        while (secondLast.ptr.ptr != null) {
            secondLast = secondLast.ptr;
        }
        secondLast.ptr = null;
        System.out.println(secondLast.data);
        return secondLast;
    }

    public static int deleteFromData(int data) {
        Node current = head;

        if(head.data==data){
            head=null;
            head=current.ptr;
            return data;
        }
        while (current != null) {
            if(current.ptr==null){
                deleteFromLast();
            }
            else if (current.data == data) {
                current.ptr=current.ptr.ptr;
                return data;
            }
            current = current.ptr;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("hello abhishek");
        insert(10);
        insert(5);
        insert(6);

        display();
        // revDisplayHelper(head);
        // deleteFromLast();
        int result =deleteFromData(6);
        System.out.println(result);
        display();
    }
}

// Longest substring from string .
// with out repeating the charecter .

// HashSet ;

