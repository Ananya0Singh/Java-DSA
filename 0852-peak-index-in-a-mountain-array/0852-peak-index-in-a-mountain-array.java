class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        
        int i=1; int j=arr.length-1; 
         while(i<=j)
         {
            int mid=(i+j)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            return mid;

            if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1])
            i=mid+1;

            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            j=mid-1;

         }
        return 1;
    }
}