
import java.util.NoSuchElementException;

public class MyStack
{
    private ListNode head;
    public void push(int value)
    {
        ListNode newHead = new ListNode( value);
        newHead.next = head;
        head = newHead;

    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        int res = head.val;
        head = head.next;
        return res;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        return head.val;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void clear()
    {
        head = null;
    }
}
class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
    }
}