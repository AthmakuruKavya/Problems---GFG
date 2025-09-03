class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >first){
                second = first;
                first = arr[i];
            }
            if(arr[i]>second && arr[i] !=first){
                second = arr[i];
            }
        }
        return second;
    }
}