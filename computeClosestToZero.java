import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        if(ts.length == 0){
            return 0;
        }
        int closest = ts[0];
        if(ts.length>= 0 && ts.length <= 10000){
            for (int i = 1; i < ts.length; i++) {
                int current = ts[i];
                if (Math.abs(current) < Math.abs(closest)) {
                    closest = current;
                } else if (Math.abs(current) == Math.abs(closest) && current > 0) {
                    closest = current;
                }
            }
        }
        return closest;
    }

    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
    /* Ignore and do not change the code above */
}
