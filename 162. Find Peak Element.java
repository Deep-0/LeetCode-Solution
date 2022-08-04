class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
  int end = nums.length - 1;
  while (start < end) {
   int mid = start + (end - start) / 2;
   if (nums[mid] > nums[mid + 1]) {
    // you are in decrement part
    // this may be ans but look at left
    // this is why end!=mid-1
    end = mid;
   } else {
    // you are in increment part
    start = mid + 1;
   }
  }
  // in the end, start=end is pointing to the largest number of the array because
  // of 2 checks above
  return start; // or return end;
    }
}
