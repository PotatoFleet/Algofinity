import list.List;

public class Main {
    public static void main(String args[]) {
        List list = new List(1, new List(2, new List(3, null)));
        List.print(list);
        list = List.reverse(list);
        List.print(list);
    }
}