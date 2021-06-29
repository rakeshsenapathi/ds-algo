import java.util.Stack;

/**
 * Created by Senapathi on 12-06-2018.
 */
public class QueueUsingTwoStacks {

    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String args[]){

        enQueue(1);enQueue(2);enQueue(8);
        enQueue(3);enQueue(4);enQueue(5);

        deQueue();
        deQueue();
        deQueue();
        printTopElement();
        printTopElement();
    }

    static void enQueue(int val){
        stack1.push(val);
    }

    static void deQueue(){
        juggleStack1();
        juggleStack2();
    }

    static void juggleStack1(){

        while(!stack2.isEmpty()){
            stack2.pop();
        }

        Stack<Integer> tempStack = stack1;

        while(!tempStack.isEmpty()) {
            int temp = tempStack.peek();
            stack2.push(temp);
            tempStack.pop();

        }

    }

    static void juggleStack2(){

        while(!stack1.isEmpty()) {
            stack1.pop();
        }
        stack2.pop();
        Stack<Integer> tempStack = stack2;
        while(!tempStack.isEmpty()) {
            int temp = tempStack.peek();
            stack1.push(temp);
            tempStack.pop();
        }

    }

    static void printTopElement(){

        while(!stack2.isEmpty()){
            stack2.pop();
        }

        Stack<Integer> tempStack = stack1;

        while(!tempStack.isEmpty()) {
            int temp = tempStack.peek();
            stack2.push(temp);
            tempStack.pop();

        }

        System.out.println(stack2.peek());


    }





}
