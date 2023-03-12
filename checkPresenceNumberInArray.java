//Sort and use binary search
// Java code below
import java.util.*;

class A {
    static boolean exists(int[] ints, int k) {
		Arrays.sort(ints);
        return Arrays.binarySearch(ints, k) >= 0;    
	}
}


// Java code below
import java.util.*;

class A {
    static boolean exists(int[] ints, int k) {
		boolean found = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == k) {
                found = true;
                break;
            }
        }
        return found;
	}
}


