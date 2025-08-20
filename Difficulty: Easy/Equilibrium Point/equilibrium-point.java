class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int rs = 0;
        for(int i=0; i<arr.length; i++){
            rs+=arr[i];
        }
        int ls = 0;
        for(int i=0; i<arr.length; i++){
            rs = rs - arr[i];
            if(rs == ls){
                return i;
            }else{
                ls=ls+arr[i];
            }
        }
        return -1;
    }
}
