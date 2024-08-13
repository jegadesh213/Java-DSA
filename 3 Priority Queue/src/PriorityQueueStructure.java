import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueStructure {
    public static void main(String[] args) throws Exception {
        //priority Queue -> Queue that can be arranged according to priority

        //for Ascending priority
        Queue<Integer> queue = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for(int i = 0 ; i < n ;i++)
        {
            int rand = (int)(Math.random() * 6);
            queue.offer(rand);
        }

        System.out.println(queue);


        //for Descending priority

        Queue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());


        for(int i = 0 ; i < n ;i++)
        {
            int rand = (int)(Math.random() * 6);
            queue2.offer(rand);
        }

        System.out.println(queue2);

    }
}
