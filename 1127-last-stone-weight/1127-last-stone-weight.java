class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>1){
            int max=pq.remove();
            int smax=pq.remove();
            int laststone=max-smax;
            if(laststone!=0){
                pq.add(laststone);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }
        
    }
}