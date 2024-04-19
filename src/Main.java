import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        //Stack<Integer> stack = new Stack<>();
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Stack: ");

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
        System.out.println();

        //Queue<Integer> que = new LinkedList<>();
        MyQueue que = new MyQueue();
        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);
        que.offer(5);

        System.out.print("Queue: ");
        while(!que.isEmpty())
        {
            System.out.print(que.poll());
        }
        System.out.println();


    }
}