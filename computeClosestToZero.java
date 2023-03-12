public static int computeClosestToZero(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array cannot be null or empty");
    }
    int closest = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        int current = numbers[i];
        if (Math.abs(current) < Math.abs(closest)) {
            closest = current;
        } else if (Math.abs(current) == Math.abs(closest) && current > 0) {
            closest = current;
        }
    }
    return closest;
}
/*
The function takes an array of integers as input and throws an IllegalArgumentException if the input array is null or empty. It then initializes a variable closest with the first element of the array.

The function then iterates over the remaining elements of the array and compares the absolute value of each element to the absolute value of the closest variable. If the absolute value of the current element is smaller than the absolute value of closest, then closest is updated to the current element. If the absolute values of the current element and closest are equal, then closest is updated to the current element only if the current element is positive.

Finally, the function returns the closest variable, which will hold the integer closest to zero in the input array.*/





