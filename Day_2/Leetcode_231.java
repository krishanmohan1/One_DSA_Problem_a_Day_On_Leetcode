package Day_2;

/*Method 1: Iterative Division
        Keep dividing n by 2 as long as n is even. If you reach 1, n is a power of two
*/




public class Leetcode_231 {

    /*Method 1: Iterative Division
        Keep dividing n by 2 as long as n is even. If you reach 1, n is a power of two
*/


//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) return false;
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//        return n == 1;
//    }


    /*
    Method 2: Bit Manipulation
A number is a power of two if it has exactly one bit set in its binary representation.
     */

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }


    /*
    Method 3: Using Built-in Functions (Java 8+)
    Check if n has exactly one one-bit using Integer.bitCount.

    public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    return Integer.bitCount(n) == 1;
    }

     */

    /*
    Method 4: Logarithmic Check
    Check if the logarithm base 2 of n is an integer

public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    double log2 = Math.log(n) / Math.log(2);
    return log2 == (int) log2;
}

     */


    public static void main(String[] args) {

    }
}
