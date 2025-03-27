class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int Xor=x^y;
        int mask=1;
        for(int i=1;i<=32;i++){
            if((Xor&mask)!=0){
                count++;
            }
            mask<<=1;
        }
        return count;
    }
}