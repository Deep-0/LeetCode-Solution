class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(!Character.isLetterOrDigit(s.charAt(low))){
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(high))){
                high--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
