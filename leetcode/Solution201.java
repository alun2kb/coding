/*因为加法只会影响连续的低位，所以 [n,m] 中的所有数字的长度为 x 的二进制前缀都是相等的。
那也就导致，按位与的结果的长度x的二进制前缀也相同。
*/
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;      // 公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }
}
