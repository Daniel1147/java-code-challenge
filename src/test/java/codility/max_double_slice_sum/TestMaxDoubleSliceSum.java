package codility.max_double_slice_sum;

import java.util.ArrayList;
import java.util.Arrays;

class TestMaxDoubleSliceSum {
  public static void main(String[] args) {
    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[] {3, 2, 6, -1, 4, 5, -1, 2});

    // input 2
    inputList.add(new int[] {0, 9, 0, 8, 0});

    // input 3
    inputList.add(new int[] {0, 17, 0, 0});

    // input 4
    inputList.add(new int[] {0, 0, 17, 0});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}