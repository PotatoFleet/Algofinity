package list;

public class List {
    public int val = 0;
    public List next = null;

    public List(int val, List next) {
        this.val = val;
        this.next = next;
    }

    public static List reverse(List head) {
        List curr = head;
        List prev = null;
        while (curr != null) {
            List next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void print(List head) {
        System.out.print("[ ");
        while (head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }
        System.out.println("]");
    }
}