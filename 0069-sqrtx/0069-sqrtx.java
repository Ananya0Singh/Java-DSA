class Solution {
    public int mySqrt(int x) {
        if(x<2)
        return x;

        int i=1;int j=x/2; int ans=0;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(x/mid==mid)
            {
        return mid;
            
            }
            else if(x/mid<mid)
            {
            j=mid-1;
            }

            else{
                            ans=mid;

            i=mid+1;
            }
        }

        return ans;
    }
}