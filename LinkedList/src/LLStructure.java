import java.util.LinkedList;

public class LLStructure {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();

        list.push(1);
        list.add(2);
        list.addFirst(1);
        list.addLast(2);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(2);

        System.out.println(list);

        list.clear();

        System.out.println(list);

    }
}
