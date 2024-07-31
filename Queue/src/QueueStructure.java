import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueStructure {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++)
        {
            String str = scanner.next();
            queue.offer(str);
        }

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Apple"));

        for(int i=0;i<n;i++)
        {
            queue.poll();
        }

        System.out.println(queue);

        System.out.println(queue.isEmpty());

        scanner.close();


    }
}
