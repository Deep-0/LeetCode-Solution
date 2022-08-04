class Solution {
    public int divide(int dividend, int divisor) {
      //edge case ( we cant have quotient 2^31 ) since -2^31 / -1 gives 2^31 ( overflow case)  
    if (Integer.MIN_VALUE == dividend && divisor == -1) {
        return Integer.MAX_VALUE;
    }
	
    int a = Math.abs(dividend);
    int b = Math.abs(divisor);
    int quo = 0;
    while (a - b >= 0) {
        int x = 0;
        while (a - ((b << 1) << x) >= 0) {
            x++;
        }
        quo += 1 << x;
        a -= b << x;
    }
	
	//both +ve or both -ve (dividend  and divisor) should return quo as it is else with a -ve sign
      if ((dividend >= 0) == (divisor >= 0)) {
        return quo;
    } else {
        return -1 * quo;
    }
    }
}
