public class Solution{
static int[] searchRange(int[] nums, int target) {
  int[] ans = { -1, -1 };
  ans[0] = search(nums, target, true);
  if (ans[0] != -1) {
   ans[1] = search(nums, target, false);
  }
  return ans;
 }

 static int search(int[] nums, int target, boolean isStartIndex) {
  int start = 0;
  int end = nums.length - 1;
  int ans = -1;
  while (end >= start) {
   // int mid = (start+end)/2; in this case it might be possible that start+end >
   // int limit so instead of this step we use next step.
   int mid = start + (end - start) / 2;
   if (target < nums[mid]) {
    end = mid - 1;
   } else if (target > nums[mid]) {
    start = mid + 1;
   } else {
    ans = mid;
    if (isStartIndex) {
     end = mid - 1;
    } else {
     start = mid + 1;
    }
   }
  }
  return ans;
 }
    }
