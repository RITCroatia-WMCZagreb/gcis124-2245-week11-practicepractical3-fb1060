/*
@ASSESSME.USERID: fb1060
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

/*
 * 
 * 
For this problem, you will calculate the square root of integers stored in a list.  Given that that the square root of a negative number is imaginary, you should not attempt to calculate the square root of any values that are less than 0.

In the main method of SquareRoots, you are provided with a list of integers.  You must use the following Java Stream methods to print out the square root of every value in the list that is non-negative.
  stream()
  filter()
  forEach()

You may use the Math.sqrt() method in your solution.
 
Using the given list of [9, 16, -1,- 4, 625, 25, 0, 144, -81], the expected
output would be:
  3.0
  4.0
  25.0
  5.0
  0.0
  12.0
 */

import java.util.Arrays;
import java.util.List;

public class SquareRoots {
    public static void main(String[] args) {
        List<Integer> squares = Arrays.asList(9, 16, -1,- 4, 625, 25, 0, 144, -81);
       
    }
}
