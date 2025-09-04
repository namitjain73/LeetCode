// Last updated: 9/4/2025, 11:03:32 PM
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
        BigInteger m = new BigInteger(num2);
        return n.multiply(m).toString();
    }
}