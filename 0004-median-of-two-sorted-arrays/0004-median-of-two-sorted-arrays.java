// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int sum=0;
       
//        for(int i=0;i<nums1.length;i++){
//         for(int j=0;j<nums2.length;j++){
//             sum=nums1[i]+nums2[j];
            
          
//         }
//         sum=sum/(nums1.length+nums2.length);
//        }
//        return sum;
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

       
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        
        while (i < n1) {
            mergedArray[k++] = nums1[i++];
        }

        
        while (j < n2) {
            mergedArray[k++] = nums2[j++];
        }

        
        int totalLength = n1 + n2;
        if (totalLength % 2 == 1) {
            
            return mergedArray[totalLength / 2];
        } else {
           
            return (mergedArray[totalLength / 2 - 1] + mergedArray[totalLength / 2]) / 2.0;
        }
    }
}
