import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        
        int k= scanner.nextInt();

        scanner.close();

        // we are using sort because binary search will only be applicable for sorted Arrays only
        Arrays.sort(arr);

        // This is using the inbuilt Java method for Binary Search
        // System.out.println(Arrays.binarySearch(arr, k) != -1 ? "Element found " : "Element not Found" );

        // Without using an inbuilt BinarySearch method
        System.out.println(binarySearchApp(arr, n,k) != -1 ? "Element found " : "Element not Found" );

        // Time Complexity: O(log N) // Auxiliary Space: O(1)
    }

    static int binarySearchApp(int[] arr,int n,int k){
        int start=0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end ) / 2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
