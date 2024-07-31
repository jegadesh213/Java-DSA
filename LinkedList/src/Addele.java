import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Addele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list : ");
        int n = scanner.nextInt();

        LinkedList<String> list  = new LinkedList<>();

        for(int i =0;i<n;i++)
        {
            System.out.print("Element " + i + ": ");
            list.add(scanner.next());
        }

        scanner.close();

        System.out.println(list);


        //reverse the list

        Collections.reverse(list);

        System.out.println(list);

        //here we are using collections because of the herirarcy and accessibility of methods from collections

    }
}
