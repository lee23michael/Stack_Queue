import java.util.NoSuchElementException;

public class MyQueue
{
    private ListNode head , tail;

    public void offer(int val)
    {
        if (tail == null)
        {
            head = tail = new ListNode(val);
        }
        else
        {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }

    public int poll()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        int res = head.val;
        head = head.next;

        if (head == null)
        {
            tail = null;
        }

        return res;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        return  head.val;
    }
    public boolean isEmpty()
    {
        return head == null;
    }

    public void clear()
    {
        head = tail = null;
    }


}
