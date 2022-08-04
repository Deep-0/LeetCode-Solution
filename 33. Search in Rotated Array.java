class Solution {
    static int search(int[] arr, int target) {
  int pivot = findPivot(arr);
  // if you didnot find pivot it means array is not rotated
  if (pivot == -1) {
   // just do normal binarysearch
   return binarySearch(arr, target, 0, arr.length - 1);
  }
  // if pivot is found, you have 2 ascending order array
  if (target == arr[pivot]) {
   return pivot;
  }
  if (target >= arr[0]) {
   return binarySearch(arr, target, 0, pivot - 1);
  }
  return binarySearch(arr, target, pivot + 1, arr.length - 1);
 }

 static int findPivot(int[] arr) {
  int start = 0;
  int end = arr.length - 1;
  while (start <= end) {
   int mid = start + (end - start) / 2;
   if (mid < end && arr[mid] > arr[mid + 1]) { // mid>=end so mid+1 is out of array-size
    return mid;
   }
   if (mid > start && arr[mid] < arr[mid - 1]) {
    return mid - 1;
   }
   if (arr[mid] <= arr[start]) {
    end = mid - 1;
   } else {
    start = mid + 1;
   }
  }
  return -1;
 }

 static int binarySearch(int[] arr, int target, int start, int end) {
  while (end >= start) {
   // int mid = (start+end)/2; in this case it might be possible that start+end >
   // int limit so instead of this step we use next step.
   int mid = start + (end - start) / 2;
   if (target < arr[mid]) {
    end = mid - 1;
   } else if (target > arr[mid]) {
    start = mid + 1;
   } else {
    return mid;
   }
  }
  return -1;
 }
}
