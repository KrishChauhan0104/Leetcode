class Solution {
  public int reverse(int x) {
    long as = 0;

    while (x != 0) {
      as = as * 10 + x % 10;
      x /= 10;
    }

    return (as < Integer.MIN_VALUE || as > Integer.MAX_VALUE) ? 0 : (int) as;
  }
}