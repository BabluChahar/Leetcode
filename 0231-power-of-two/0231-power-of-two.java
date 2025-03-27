// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n <= 0) {
//             return false; // Negative numbers and zero cannot be powers of two
//         }
//         return (n & (n - 1)) == 0; // Check if only one bit is set
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;

        while(n%2==0)n/=2;
        return n==1;
    }
}