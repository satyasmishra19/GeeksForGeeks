class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int nums[]) {
        // code here
        for(int turn = 0 ; turn < nums.length-1 ; turn++){
            int swap =0;
            for(int i =0 ; i<nums.length-1-turn ; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    swap+=1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
}