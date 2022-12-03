import java.util.*;
import java.lang.*;
import java.io.*;

public class AbsMinDistList {
    // The main method must be in a class named "Main".
    public static int findMinDist(List<Integer> nums , int k) {
        int minDist = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i< nums.size(); i++) {
            int tempD = Math.abs(k - nums.get(i));
            if ( tempD < minDist){
                index = i;
                minDist = tempD;
            }
            else if (tempD == minDist & nums.get(i) < nums.get(index)) {
                index = i;
            }
        }
        return nums.get(index);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,3,10,40,88,92,100,96));
        int result = findMinDist(nums, 98);
        System.out.println(result);
    }
}
