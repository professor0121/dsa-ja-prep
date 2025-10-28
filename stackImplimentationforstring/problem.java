public class problem {
    static class Node {
        int data;
        Node ptr;

        Node(int data) {
            this.data = data;
            this.ptr = null;
        }
    }

    public static Node head;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.ptr = head;
        head = newNode;
    }

    public static void pop() {
        if (head == null) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("the element is deleted" + head.data);
        head = head.ptr;
    }

    public static void display() {
        if (head == null) {
            System.out.println("Stack underflow");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.ptr;
        }

    }

    public static void removeDuplicate() {
        if (head == null) {
            System.out.println("Stack underflow");
            return;
        }

        Node current = head;

        while (current != null) {
            Node prev = current;
            Node temp = current.ptr;

            while (temp != null) {
                if (current.data == temp.data) {
                    prev.ptr = temp.ptr;
                } else {
                    prev = temp;
                }
                temp = temp.ptr;
            }
            current = current.ptr;
        }
    }

    public static void main(String[] args) {
        push(3);
        push(6);
        push(2);
        push(2);
        push(8);
        display();
        removeDuplicate();
        display();
        System.out.println("Jai mata di");
    }
}