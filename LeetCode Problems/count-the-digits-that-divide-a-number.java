class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem != 0 && num % rem == 0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}