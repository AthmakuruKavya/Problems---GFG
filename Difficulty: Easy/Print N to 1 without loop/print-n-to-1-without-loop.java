class Solution {

    void printNos(int n) {
        // code here
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
        
    }
}