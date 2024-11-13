class Solution {
      public static int findMax(int[] piles){
         int maxi = Integer.MIN_VALUE;
         int n=piles.length;
         for(int i=0;i<n;i++){
            maxi=Math.max(maxi, piles[i]);
         }
return maxi;
      }
       public static int calculateTotalHours(int[] v, int hourly){
           int totalH = 0;
        int n = v.length;
        
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

       
    public int minEatingSpeed(int[] piles, int h) {
          int low = 1, high = findMax(piles);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }   
    
}