class Solution {
    public boolean isPalindrome(int x) {
        int rev = reverse(x);
        return rev==x;
    }
     public int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
