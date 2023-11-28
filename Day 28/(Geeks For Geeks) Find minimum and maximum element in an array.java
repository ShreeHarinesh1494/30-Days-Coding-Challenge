Problem :

Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Solution :

class Compute {
    static Pair getMinMax(long a[], long n) {
        long min = Arrays.stream(a).min().orElse(Long.MAX_VALUE);
        long max = Arrays.stream(a).max().orElse(Long.MIN_VALUE);

        return new Pair(min, max);
    }
}
