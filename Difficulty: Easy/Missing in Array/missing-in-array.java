//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing, n is length + 1
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        // Calculate the actual sum of the elements in the array
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sums
        return expectedSum - actualSum;
    }
}