class Solution {
    public void sortColors(int[] nums) {
        int c_0=0,c_1=0,c_2=0,j=0;

    for(int i=0;i< nums.length;i++){
        if(nums[i]==0)
            c_0++;
        if(nums[i]==1)
            c_1++;
        if(nums[i]==2)
            c_2++;
    }

    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            swap(i,j,nums);
            j++;
        }
    }
    for(int i=c_0;i<nums.length;i++){
        if(nums[i]==1){
            swap(i,j,nums);
            j++;
        }
    }
    for(int i=(c_0+c_1);i<nums.length;i++){
        if(nums[i]==2){
            swap(i,j,nums);
            j++;
        }
    }
}

static void swap(int i,int j,int a[]){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }
}
