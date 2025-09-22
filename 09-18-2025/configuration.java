public class configuration {
    public static class Node{
        int data;
        Node ptr;

        Node(int data){
            this.data=data;
            this.ptr=null;
        }
    }
    
    static Node head;

    public static void push(int data){
        Node newNode = new Node(data);
        newNode.ptr = head;
        head = newNode; 
    }

    public static void pop(){
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + head.data);
        head = head.ptr; 
    }

    public static void display(){
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node currentNode = head;
        System.out.print("Stack: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.ptr;
        }
        System.out.println();
    }

    public static void main(String [] args){
        configuration cfg=new configuration();
        cfg.push(3);
        cfg.push(5);
        cfg.push(6);
        cfg.display();
        cfg.pop();
        cfg.display();
    }
}
