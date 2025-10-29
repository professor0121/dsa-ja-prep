import java.util.*;

public class sortQueue {
    // public static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // public static Node head;

    // public static void insert(int data) {
    // Node newNode = new Node(data);
    // if (head == null || head.data >= newNode.data) {
    // newNode.next = head;
    // head = newNode;
    // } else {
    // Node current = head;
    // while (current.next != null && current.next.data < newNode.data) {
    // current = current.next;
    // }
    // newNode.next = current.next;
    // current.next = newNode;
    // }
    // }

    // public static void display() {
    // Node current = head;
    // while (current != null) {
    // System.out.print(current.data + " ");
    // current = current.next;
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // sortQueue queue = new sortQueue();
    // queue.insert(5);
    // queue.insert(2);
    // queue.insert(8);
    // queue.insert(1);
    // queue.insert(4);

    // queue.display();

    // }

    // sort the queue without using loop and use the recursion
    // public static Queue<Integer> sortData(Queue<Integer> queue) {
    // if (queue.isEmpty()) {
    // return queue;
    // }
    // int front = queue.poll();
    // Queue<Integer> sortedQueue = sortData(queue);
    // insertInSortedOrder(sortedQueue, front);
    // return sortedQueue;
    // }

    // public static void insertInSortedOrder(Queue<Integer> queue, int element) {
    // if (queue.isEmpty() || element <= queue.peek()) {
    // queue.add(element);
    // return;
    // }
    // int front = queue.poll();
    // insertInSortedOrder(queue, element);
    // queue.add(front);
    // }

    // public static void main(String[] args) {
    // Queue<Integer> queue = new LinkedList<>();
    // queue.add(5);
    // queue.add(2);
    // queue.add(8);
    // queue.add(1);
    // queue.add(4);
    // Queue<Integer> sortList = new LinkedList<>();
    // sortList = sortData(queue);
    // System.out.println(sortList);
    // }
    public static Queue<Integer> sortData(Queue<Integer> queue, int low) {
        Queue<Integer> sortList = new LinkedList<>();
        if (queue.isEmpty()) {
            return sortList;
        }
        int front = (int) queue.poll();
        if (front <= low) {
            sortList.add(front);
            sortList.addAll(sortData(queue, front));
        } else {
            Queue<Integer> tempQueue = sortData(queue, low);
            sortList.addAll(tempQueue);
            sortList.add(front);
        }
        return sortList;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(2);
        queue.add(8);
        queue.add(1);
        queue.add(4);
        Queue<Integer> sortList = new LinkedList<>();
        sortList = sortData(queue, queue.peek());
        System.out.println(sortList);
    }

}