import java.util.*;
import java.lang.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //creating array
        int[] arr = new int[n];

         // Input array elements
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Input k value
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        
        int windowSum = 0;
        
        // Calculate sum of first k elements
        for(int i = 0;i<k;i++){
            windowSum += arr[i];
        }

        // Sliding window to find max sum of k consecutive elements
        int maxSum = windowSum;
        for(int i = k;i < n;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(windowSum,maxSum);
        }
         // Output the result
        System.out.println("Maximum sum of k consequtive numbers is: "+ maxSum);
        
        
        
        
        
    }
}