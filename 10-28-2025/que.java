import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class que {

    public static void sortQue(Queue queue) {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        System.out.println("hello from abhishek and java");
        Queue<Integer> list = new LinkedList<>();

        list.add(8);
        list.add(7);
        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println(list);
        sortQue(list);
    }
};