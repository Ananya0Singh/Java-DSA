class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n=nums.length;
        int i=0; int j=n-1; int ind=-1;int indi=-1;

        while(i<=j)
            {
               int mid=(i+j)/2;

                if(nums[mid]>target) j=mid-1;
                else if(nums[mid]<target) i=mid+1;

                 else 
                 { // if(nums[mid]==target)
                  ind=mid;
                  j=mid-1;
                 }

            }

            i=0; j=n-1;

        while(i<=j)
            {
               int mid=(i+j)/2;

                if(nums[mid]>target) j=mid-1;
                else if(nums[mid]<target) i=mid+1;

                 else  // if(nums[mid]==target)
                 {
                  indi=mid;
                  i=mid+1;
                 }

            }
        return new int[]{ind,indi};
    }
}