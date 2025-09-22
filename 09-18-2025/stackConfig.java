import java.util.ArrayList;

public class stackConfig {
    public static ArrayList<Integer>stackArray=new ArrayList<>();
    public static void push(int data){
        stackArray.add(data);
    }
    public static int pop(){
        return stackArray.removeLast();
    }
    public static void display(){
        for(int element:stackArray){
            System.out.println(element);
        }
    }
    public static void main(String [] args){
        push(4);
        push(6);
        push(9);
        display();
        pop();
        display();
    }
}
