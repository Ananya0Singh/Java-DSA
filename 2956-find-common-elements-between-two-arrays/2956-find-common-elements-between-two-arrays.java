class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        // int n1=nums1.length;
        // int n2=nums2.length;
        // int a=0; int b=0;

        // for(int i=0; i<n1;i++)
        // {
        //     for(int j=0;j<n2;j++)
        //     {
        //         if(nums1[i]==nums2[j])
        //         {
        //             a++;
        //             break;
        //         }
        //     }
        // }
        // for(int i=0; i<n2;i++)
        // {
        //     for(int j=0;j<n1;j++)
        //     {
        //         if(nums1[j]==nums2[i]){
        //             b++;
        //             break;}
        //     }
        // }

        //     return  new int[]{a,b};


        HashSet<Integer> s1=new HashSet<>();
    HashSet<Integer> s2=new HashSet<>();
    
    int a=0;int b=0;
     for(int x:nums1)
     s1.add(x);
     
     for(int x:nums2)
     s2.add(x);
      
     for(int x:nums1)
     if(s2.contains(x))
     a++;
     
     for(int x:nums2)
     if(s1.contains(x))
     b++;
     
     return new int[]{a,b};
        

    }
}