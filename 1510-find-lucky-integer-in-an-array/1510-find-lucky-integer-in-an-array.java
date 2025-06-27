class Solution {
    public int findLucky(int[] arr) {
        int fre[]=new int[501];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        int max=-1;
        for(int i=1;i<fre.length;i++){
     if(fre[i]==i){
        max = i;
     }
        }
        return max;
    }

}
// class Solution {
//     public int findLucky(int[] arr) {
//         int fre[] = new int[501]; // numbers go up to 500

//         for (int num : arr) {
//             fre[num]++;
//         }

//         int max = -1;
//         for (int i = 1; i < fre.length; i++) {
//             if (fre[i] == i) {
//                 max = i; // keep updating to the higher lucky number
//             }
//         }

//         return max;
//     }
// }
