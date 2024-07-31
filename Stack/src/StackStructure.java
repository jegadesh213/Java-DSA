import java.util.Scanner;
import java.util.Stack;

public class StackStructure {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] arr = new String[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.next();
        }

        for(String i : arr)
        {
            stack.push(i);
        }
        
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.search("Apple"));

        for(int i=0;i<arr.length;i++)
        {
            stack.pop();
        }

        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.search("Apple"));
        
        scanner.close();
    }
}
